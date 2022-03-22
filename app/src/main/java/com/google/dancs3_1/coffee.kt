package com.google.dancs3_1


var coffeeList = mutableListOf<coffee>()
val COFFE_ID_EXTRA = "coffeeExtra"
class coffee (
    var img : Int,
    var tvnName : String,
    var tvgia : String,


    val id: Int?= coffeeList.size
        )


