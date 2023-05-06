package com.dev.vazguen.recylerview.utils

import com.dev.vazguen.recylerview.R
import com.dev.vazguen.recylerview.model.CarDetail

object DataProvider {

    val CarList = listOf(
        CarDetail(
            id = 0,
              marca = "Mercedes",
              modelo = "AMG G63",
              year = 2019,
              color = "black",
              speed = 240.0,
              price = 160000.0,
              ImageId = R.drawable.mercedesamg
        ),
        CarDetail(
            id = 1,
            marca = "Tesla",
            modelo = "modelo Y",
            year = 2021,
            color = "white",
            speed = 250.0,
            price = 47000.0,
            ImageId = R.drawable.teslay
        ) ,
        CarDetail(
            id = 2,
            marca = "Mercedes-Benz",
            modelo = "AMG GT",
            year = 2022,
            color = "white",
            speed = 312.0,
            price = 92000.0,
            ImageId = R.drawable.mercedesbenzamggt
        ),
        CarDetail(
            id = 3,
            marca = "Porsche",
            modelo = "911 ",
            year = 2019,
            color = "black",
            speed = 293.0,
            price = 138000.980,
            ImageId = R.drawable.borchenienine
        )
    )
}