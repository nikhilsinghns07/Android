package com.ns07.first

fun main(args:Array<String>)
{
// Learing about variables in Kotlin

//    var a = 10
//    var b = 20
//    var c = a+b
//    println(a+b)
//    a = 16 // var can be re assigned
//    val d = 19 // val cannot be re assigned in program later.

    // Data Types

//    var a : Boolean = true
//    var b : Char = 'R'
//    var c : Byte = 12
//    var d : Short = -356
//    var e : Int = 23435
//    var f : Long = -52325253425L
//    var g : Float = 5.3463F
//    var h : Double = 7.3534276464
//
//    println(a)
//    println(b)
//    println(c)
//    println(d)
//    println(e)
//    println(f)
//    println(g)
//    println(h)

//    Type Conversion
/*
toByte()
toShort()
toInt()
tolong()
toFloat()
toDouble()
*/


//    var x: Byte = 127
//    var y: Int = x.toInt()

//    String Data Type

//    var a:String = "Hello Kotlin"
//    var b:String= "Programming"
//    println(a + b)
//    var age = 20

//    println("I am " + age + "years old")
//    println(a.uppercase())

// Arrays
//    var age = arrayOf(1,2,3,4)
//    println("First element of the array: " + age[0])

// Array List
    /*
    var ageArrayList = ArrayList<Int>()
    ageArrayList.add(10)
//    ageArrayList.add(index: 1,element: 15)
    ageArrayList.add(20)

    println("First element of ArrayList = " + ageArrayList [0])
    println("First element of ArrayList = " + ageArrayList [1])
    ageArrayList.remove(element = 10)

    println(ageArrayList)

    var myMixArrayList = ArrayList<Any>()
    myMixArrayList.add("Volkswagen")
    myMixArrayList.add(5)
    myMixArrayList.add(8.2)
    myMixArrayList.add(1.4f)

    println(myMixArrayList)
    */

//    Sets
    /*
    var myArray = arrayListOf<Any>("Kotlin","Python","JavaScript","C","C++","Java","Kotlin")

    println("Size of Array is : ${myArray.size}")
    println(myArray.last())

    var mySet = setOf<Any>("Kotlin","Python","JavaScript","C","C++","Java","Kotlin")
    println("Size of Set is: ${mySet.size}")
    println(myArray.last())

     */

// Maps

    var age = mapOf<String,Int>("Dhoni" to 38, "Kohli" to 33)
    println("Age of Dhoni is ${age["Dhoni"]} ")
    println("Age of Kohli is ${age["Kohli"]} ")

    var players = mutableMapOf<String,Int>("Rohit" to 34)
    players.put("Rahul",28)
    println(players)

}
