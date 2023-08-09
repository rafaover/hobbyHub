package com.feeltheboard.hobbyhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.hobbyhub.model.Topic
import com.feeltheboard.hobbyhub.ui.theme.HobbyHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HobbyHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //
                }
            }
        }
    }
}

@Composable
fun topicCard(topic: Topic, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Row {
            Image(painter = painterResource(topic.image), contentDescription = stringResource(topic.title))
            Column {
                Text(text = stringResource(topic.title))
                Row {
                    Icon(painter = painterResource(R.drawable.ic_grain), contentDescription = null)
                    Text(text = stringResource(topic.quantity))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun courseGrid() {
    topicCard()
}
