package com.example.compose_quadrants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_quadrants.ui.theme.Compose_QuadrantsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_QuadrantsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quardants()
                }
            }
        }
    }
}

@Composable
fun Quardants(modifier: Modifier = Modifier) {
    val q1title = stringResource(id = R.string.first_title)
    val q1text = stringResource(id = R.string.first_description)
    val q1color = Color(0xFFEADDFF)
    val q2title = stringResource(id = R.string.second_title)
    val q2text = stringResource(id = R.string.second_description)
    val q2color = Color(0xFFD0BCFF)
    val q3title = stringResource(id = R.string.third_title)
    val q3text = stringResource(id = R.string.third_description)
    val q3color = Color(0xFFB69DF8)
    val q4title = stringResource(id = R.string.fourth_title)
    val q4text = stringResource(id = R.string.fourth_description)
    val q4color = Color(0xFFF6EDFF)

    Column(modifier.fillMaxWidth()) {
        Row(modifier.weight(1f)) {
            QuadCard(
                title = q1title,
                description = q1text,
                backgroundColor = q1color,
                modifier = modifier.weight(1f))
            QuadCard(
                title = q2title,
                description = q2text,
                backgroundColor = q2color,
                modifier = modifier.weight(1f))
        }
        Row(modifier.weight(1f)) {
            QuadCard(
                title = q3title,
                description = q3text,
                backgroundColor = q3color,
                modifier = modifier.weight(1f))
            QuadCard(
                title = q4title,
                description = q4text,
                backgroundColor = q4color,
                modifier = modifier.weight(1f))
        }
    }
}

@Composable
fun QuadCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp))
        Text(
            text = description,
            textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_QuadrantsTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Quardants()
        }
    }
}