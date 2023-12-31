package com.example.flowers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class DetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Page()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Page(){
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "search",
                            tint = Color.White
                        )
                    }
//                    Text(
//                        textAlign = TextAlign.Center,
//                        text = "Flowers")
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Row {
                            Icon(
                                imageVector = Icons.Filled.Search,
                                contentDescription = "search",
                                tint = Color.White,
                                modifier = Modifier.size(width = 20.dp, height = 20.dp)
                            )
                            Icon(
                                imageVector = Icons.Filled.ShoppingCart,
                                contentDescription = "cart",
                                tint = Color.White,
                                modifier = Modifier.size(width = 20.dp, height = 20.dp)
                            )
                        }

                    }
                },
            )
        }
    )
    {paddingValues ->
        Details()
    }
}

@Composable
fun Details(){
    Column(
        modifier = Modifier.padding(top = 48.dp)
    ) {
        LazyRow(){
            items(20) { index ->
                Item2(index)
            }
        }
        Row (
            modifier = Modifier.padding(16.dp)
        ){
            Button(
                onClick = {},
            ) {
                Text("Add to cart")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = {}) {
                Text("Buy")
            }
        }
        Column (
            modifier = Modifier.padding(16.dp)
        ){
            Text(
                text = "Name",
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Meaning",
                style = MaterialTheme.typography.bodyLarge
            )
            Text(text = "In this layout structure, the LazyColumn is wrapped inside a Box composable. By aligning the LazyColumn to the top of the Box using align(Alignment.TopCenter), the LazyColumn will be positioned below the TopAppBar. Additionally, the LazyColumn will not be hidden by the BottomAppBar since it's part of the content inside the Box. This ensures that the LazyColumn content is visible and not obscured by the app bars.")
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Care",
                style = MaterialTheme.typography.bodyLarge
            )
            Text(text = "In this layout structure, the LazyColumn is wrapped inside a Box composable. By aligning the LazyColumn to the top of the Box using align(Alignment.TopCenter), the LazyColumn will be positioned below the TopAppBar. Additionally, the LazyColumn will not be hidden by the BottomAppBar since it's part of the content inside the Box. This ensures that the LazyColumn content is visible and not obscured by the app bars.")
        }

    }
}

@Composable
fun Item2(index: Int){
    ElevatedCard(
        modifier = Modifier
            .size(width = 400.dp, height = 400.dp)
            .padding(20.dp)
    )
    {
        Image(painter = painterResource(id = R.drawable.flower),
            contentDescription ="flower",
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun pageTwo(){
    Page()
}