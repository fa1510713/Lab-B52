package com.cmps312.lab2ass

import java.util.Arrays

val max = { nums: IntArray -> nums.max() }

val min = { nums: IntArray -> nums.min() }

val sum = { nums: IntArray -> nums.sum() }

val avg = { nums: IntArray -> nums.average() }

fun cube(nums: IntArray): IntArray {
    var count = 0
    var cubic = IntArray(46)
    for (i in nums) {
        cubic[count] = i * i * i
        count += 1
        if (count > 46)
            break
    }
    return cubic
}

fun main() {
    val nums = IntArray(46) { 4 + (it + 1)}

    println(Arrays.toString(nums))
    val maximum = max(nums)
    println(maximum)

    val minimum = min(nums)
    println(minimum)

    val sum = sum(nums)
    println(sum)

    val average = avg(nums)
    println(average)

    val cubicNums = cube(nums)
    print(Arrays.toString(cubicNums))

}