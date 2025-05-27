package com.example.amritsactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rajnish.androidappy.R

class ListViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListView()
        }
    }
}

@Composable
fun ListView() {
    val images = listOf(
        R.drawable.facbook,
        R.drawable.google,
        R.drawable.gracebook,
        R.drawable.eye)

    val name = listOf("facebook","google","image","image-1")

    Scaffold(modifier = Modifier.fillMaxSize()){ innerPadding ->
        LazyColumn(modifier = Modifier.
        padding(innerPadding)
        ){
            item {
               LazyVerticalGrid(modifier = Modifier.fillMaxWidth().height(320.dp), columns = GridCells.Fixed(3))  {
                    items(images.size) {
                            index ->
                        Column(verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painterResource(images[index]),
                            contentDescription = null,
                            modifier = Modifier.size(180.dp).clip(CircleShape)
                        )
                        Text(text = name[index])
                        }
                    }
                }
                Box(
                    modifier = Modifier.height(200.dp)
                        .fillMaxWidth()
                        .padding(20.dp)
                        .background(color = Color.Red)
                )
                Box(
                    modifier = Modifier.height(200.dp)
                        .fillMaxWidth()
                        .padding(20.dp)
                        .background(color = Color.Blue)
                )
                Box(
                    modifier = Modifier.height(200.dp)
                        .fillMaxWidth()
                        .padding(20.dp)
                        .background(color = Color.Yellow)
                )
                Box(
                    modifier = Modifier.height(200.dp)
                        .fillMaxWidth()
                        .padding(20.dp)
                        .background(color = Color.Green)
                )

                Box(
                    modifier = Modifier.height(200.dp)
                        .fillMaxWidth()
                        .padding(20.dp)
                        .background(color = Color.Magenta)
                )

                LazyRow(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    item {
                        Box(
                            modifier = Modifier.size(120.dp).padding(10.dp)
                                .background(color = Color.Gray)
                        )
                        Box(
                            modifier = Modifier.size(120.dp).padding(10.dp)
                                .background(color = Color.Red)
                        )
                        Box(
                            modifier = Modifier.size(120.dp).padding(10.dp)
                                .background(color = Color.Blue)
                        )
                        Box(
                            modifier = Modifier.size(120.dp).padding(10.dp)
                                .background(color = Color.Yellow)
                        )
                        Box(
                            modifier = Modifier.size(120.dp).padding(10.dp)
                                .background(color = Color.Green)
                        )
                        Box(
                            modifier = Modifier.size(120.dp).padding(10.dp)
                                .background(color = Color.Black)
                        )
                    }
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListViewPreview() {
    ListView()
}