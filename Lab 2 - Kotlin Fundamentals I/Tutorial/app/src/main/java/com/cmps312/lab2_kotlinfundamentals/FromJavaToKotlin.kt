package com.cmps312.lab2_kotlinfundamentals

fun main(args: Array<String>) {

    var names = arrayListOf("Abdulahi" , "Mohamed", "Sara", "Fatema")
    names.add("Ghalia")
    names.forEach {name ->println(name)}

    var mappedNames = names.map {name -> "$name - ${name.length}"}

    mappedNames.forEach { println(it) }

    val combined = names.reduce { acc, s -> "$acc**$s" }

    println(combined)

}



//for (i in 5..15) print("$i ")
//
//println("\n")
//for (i in 5 until 15) print("$i ")
//
//println("\n")
//for (i in 50 downTo 1 step 4) print("$i ")
//
//var numbers = 1..100;
//
//println("\n")
//for(num in numbers) print("$num - ")






//fun add(a : Int , b: Int): Int {
//    return a+b
//}
//
//fun add2(a : Int , b: Int) = a+b



//conditionals

//if else
//    switch(month){
//        case 4:
//        case 5:
//        case 6:
//        ...
//        case 12:
//            System,out.println("Month above 3")
//    }
// switch
//val month = 'F';
//
//val result = when (month) {
//    'J' -> "Jan"
//    'F' ->  "Feb"
//    'M' -> "March"
//    else ->  "Month is not correct number"
//}

//println(result)
//if (height < 1.5) {
//    println("Short")
//}
//else
//println("tall")
//
////    String result = height < 1.5 ? "Short" : "Tall";
//val result = if(height < 1.5)  "Short" else "Tall";
//println(result)
//
//var fname = "Abdulahi"
//var lname = "Hassen"
//
//
//println("$fname $lname")
//
//val longString = """
//        Line One
//        Line two
//        Line three
//        any other text you want
//        multiple lines for you
//    """.trim()
//
//println(longString)

//    //display
//    println("Hello welcome to CMPS-312")
//
//    //variables
////    final int x; //constant
////    final int y = 10;
//
//    val x: Int;
//    val y = 10;
//    println(y)
//
//    var w: Int = y;
//    w = 20;
//    println(w)