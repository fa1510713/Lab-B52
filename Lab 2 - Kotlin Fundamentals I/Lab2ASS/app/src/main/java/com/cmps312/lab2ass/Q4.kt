package com.cmps312.lab2ass

fun main(args: Array<String>) {

    val cities = mutableListOf("Doha", "Tokyo", "Delhi")
    println("------cities------")
    display(cities)

    println("------Adding Dkhaka to the end------")
    cities.add("Dkhaka")
    display(cities)

    println("------Adding Beijing to the beginning------")
    cities.add(0, "Beijing")
    display(cities)

    println("------Sorting Cites in Alphabetical order------")
    cities.sort()
    display(cities)

    println("------Sorting Cites in Alphabetical order by reverse------")
    cities.sortDescending()
    display(cities)

    println("------Cities after removing  Beijing------")
    cities.remove("Beijing")
    display(cities)

}

fun display(cities: List<String>) {
    for (city in cities) {

        println("$city ")
    }
}