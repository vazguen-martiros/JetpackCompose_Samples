package com.dev.vazguen.recylerview.ui.ui

import android.annotation.SuppressLint
import android.telecom.Call
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dev.vazguen.recylerview.model.CarDetail
import com.dev.vazguen.recylerview.utils.DataProvider
import com.dev.vazguen.recylerview.utils.DataProvider.CarList

class CarCard {

    @SuppressLint("NotConstructor")
    @Composable
    fun CarCard(car: CarDetail,  onClick: () -> Unit) {
        val padding =16.dp
        Card(
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 20.dp)
                .fillMaxWidth()
                .clickable(onClick = onClick),
            elevation = 5.dp,
            backgroundColor = Color.LightGray,
            shape = RoundedCornerShape(corner = CornerSize(10.dp))

        ) {

            Row(modifier = Modifier.padding(5.dp)) {
                Column(
                    Modifier
                        .padding(padding)
                        .weight(1f)

                ) {
                    Text(
                        text = car.marca,
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    )
                    Text(
                        text =  car.modelo,
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    )
                    Text(
                        text = "Year :- "+car.year.toString(),
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 15.sp
                        )
                    )
                    Text(
                        text = "Color :- "+car.color,
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 15.sp
                        )
                    )

                    Text(
                        text = "Price :- "+  car.price.toString(),
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 15.sp
                        )
                    )
                }
                Image(painter = painterResource(car.ImageId), contentDescription = "Profile Image",
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(160.dp)
                        .clip((CircleShape)))
            }
        }
    }
    @Composable
    fun DetailsContent() {
        val cars = remember {  CarList }
        println(cars.get(0).id)
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(
                  cars
            ) {
                CarCard(car = it, onClick = {
                    //Onclick function navigate newx screen
                    print(it.id)
                }
                )
            }
        }
    }

}