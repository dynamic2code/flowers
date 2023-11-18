package com.example.flowers

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.flowers.ui.theme.FlowersTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LandingPage()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LandingPage(){

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(
                        textAlign = TextAlign.Center,
                        text = "Flowers")
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
    ) {paddingValues ->
        LazyColumn (
            modifier = Modifier.padding(top = 54.dp)
        ) {
            items(20) { index ->
                Item(index)
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Item(index: Int){
    Card(
        onClick = {
        },
        modifier = Modifier
            .size(width = 450.dp, height = 360.dp)
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.Center, // Center the items vertically
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            ElevatedCard (
                modifier = Modifier.size(width = 350.dp, height = 300.dp)

            ){
                Image(painter = painterResource(id = R.drawable.flower),
                    contentDescription ="flower",
                    modifier = Modifier.fillMaxSize()
                    )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "flower name")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun pageOne(){
    LandingPage()
}