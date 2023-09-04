package com.example.practise1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practise1.ui.theme.Practise1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practise1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,

                ) {
                    Greeting( )

                    Spacer(modifier = Modifier.height(10.dp))

                    UserDetails("")

                    Spacer(modifier = Modifier.height(10.dp))

                    ContactDetails()

                    Spacer(modifier = Modifier.height(10.dp))

                   OrdersGroup()

                    Spacer(modifier = Modifier.height(10.dp))

                    MoreItems()

                    Spacer(modifier = Modifier.height(10.dp))


                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting( modifier: Modifier = Modifier) {
    Column(
      // modifier=Modifier.padding(horizontal = 24.dp)
        modifier=Modifier.padding(horizontal = 24.dp, vertical = 20.dp),

    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start=80.dp)

                            )
                    },
                    navigationIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.arrow_back),
                            contentDescription = "arrow",



                        )

                    },
                    
                    actions = {

                       
                        IconButton(onClick = {  }) {
                            Icon(
                                painterResource(id = R.drawable.border_color),
                                contentDescription = "more",

                            )
                        }
                    }
                )
            }
        ) {
        }
    }
}

@Composable
fun UserDetails(text: String){
    val borderWidth = 4.dp

    Row(
        verticalAlignment = Alignment.Top,
        modifier= Modifier
            .padding(horizontal = 24.dp, vertical = 80.dp)
            .fillMaxSize(),

        ) {
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription ="",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .border(
                    BorderStroke(borderWidth, Color.Transparent),
                    CircleShape
                )
                .padding(borderWidth)
                .clip(CircleShape)
        )
        Column {
            Text(
                text="Emma Phillips",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(50.dp)
                    .padding(horizontal = 20.dp, vertical = 10.dp),



                )
            Text(
                text="Fashion Model",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)
                )
        }
    }

}

@Composable
fun ContactDetails() {
    Column(
        modifier=Modifier
            .padding(horizontal = 24.dp, vertical = 200.dp),
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp)

        ){
            Image(
                painter = painterResource(id = R.drawable.phone),
                contentDescription ="phone"
            )
            Text(
                text = "(581)-307-6902",
                fontSize = 18.sp,
                modifier=Modifier
                    .padding(start = 20.dp)
            )

        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.email),
                contentDescription ="phone"
            )
            Text(
                text = "emma.philips.com",
                fontSize = 18.sp,
                modifier=Modifier
                    .padding(start = 20.dp)
            )
        }

    }
}

@Composable
fun OrdersGroup() {
    Column(

        modifier=Modifier
            .padding(horizontal = 1.dp, vertical = 300.dp)

    ) {
        Divider(color = Color.Black, thickness = 2.dp)

        Text("one", Modifier.padding(4.dp))
        Spacer(modifier = Modifier.height(40.dp))


        Divider(color = Color.Black, thickness = 1.dp)



    }
}
@Composable
fun MoreItems(){
    Column(

        modifier=Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp,vertical=5.dp)
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,



    ) {
        Box (
            modifier = Modifier
                .fillMaxWidth()



        ){Spacer(modifier = Modifier.height(60.dp))
            Image(
                painter = painterResource(id = R.drawable.favorite),
                contentDescription ="phone"
            )
            Text(
                text = "Your Favorites",
                fontSize = 18.sp,
                modifier=Modifier
                    .padding(start = 38.dp)
            )

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()



        ) {Spacer(modifier = Modifier.height(60.dp))
            Image(
                painter = painterResource(id = R.drawable.payment),
                contentDescription ="phone"
            )
            Text(
                text = "Payment",
                fontSize = 18.sp,
                modifier=Modifier
                    .padding(start = 38.dp)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()



        ) {Spacer(modifier = Modifier.height(60.dp))
            Image(
                painter = painterResource(id = R.drawable.people),
                contentDescription ="phone"
            )
            Text(
                text = "Tell Your Friend",
                fontSize = 18.sp,
                modifier=Modifier
                    .padding(start = 38.dp)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()



        ) {Spacer(modifier = Modifier.height(60.dp))
            Image(
                painter = painterResource(id = R.drawable.local_offer),
                contentDescription ="phone"
            )
            Text(
                text = "Promotions",
                fontSize = 18.sp,
                modifier=Modifier
                    .padding(start = 38.dp)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()



        ) {Spacer(modifier = Modifier.height(60.dp))
            Image(
                painter = painterResource(id = R.drawable.settings),
                contentDescription ="phone"
            )
            Text(
                text = "Settings",
                fontSize = 18.sp,
                modifier=Modifier
                    .padding(start = 38.dp)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()



        ) {Spacer(modifier = Modifier.height(60.dp))
            Image(
                painter = painterResource(id = R.drawable.power),
                contentDescription ="phone"
            )
            Text(
                text = "Log Out",
                color = Color.Red,
                fontSize = 18.sp,
                modifier=Modifier
                    .padding(start = 38.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practise1Theme {
        Greeting()
    }
}