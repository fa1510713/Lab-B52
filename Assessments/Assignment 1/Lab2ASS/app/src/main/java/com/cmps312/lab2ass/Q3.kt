package com.cmps312.lab2ass

data class Friend(
    val firstName: String,
    val lastName: String,
    val gender: String = "M"

) {
    override fun toString(): String {
        val friend: String
        if (gender.equals("M"))
            friend = "Mr ${firstName + " " + lastName + " -" + gender}"
        else
            friend = "Ms ${firstName + " " + lastName + " -" + gender}"
        return friend
    }
}

fun main(args: Array<String>) {
    val friend = arrayOf(

        Friend("Abdullahi", "Hassen", "M"),
        Friend("Fatima", "Hamza", "F"),
        Friend("Abbas", "IbnFernas"),
        Friend("Fiona", "Shrek", "F")

    )
    for (f in friend)
        println(f.toString())
}