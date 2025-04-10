import kotlin.math.pow

/**
 *
 * //https://leetcode.com/problems/count-the-number-of-powerful-integers/?envType=daily-question&envId=2025-04-10
 *
 * Example 1:
 *
 * Input: start = 1, finish = 6000, limit = 4, s = "124"
 * Output: 5
 * Explanation: The powerful integers in the range [1..6000] are 124, 1124, 2124, 3124, and, 4124. All these integers have each digit <= 4, and "124" as a suffix. Note that 5124 is not a powerful integer because the first digit is 5 which is greater than 4.
 * It can be shown that there are only 5 powerful integers in this range.
 */

fun numberOfPowerfulInt(start: Long, finish: Long, limit: Int, s: String): Long {
    val powerStringLen = s.length
    val minStringLen = start.toString().length
    val startingLen = if(powerStringLen > minStringLen) powerStringLen else minStringLen

    val maxStringLen = finish.toString().length
    val powerInteger = Integer.getInteger(s)

    if(powerInteger < start || powerInteger > finish) {
        return 0
    }

    val powerNumbers = mutableListOf(powerInteger)

    for(i in 1..limit) {
        val incrementer = 10.0.pow(maxStringLen - 1)
        while(incrementer > powerInteger) {
            val newPowerNumber = (incrementer * i) + powerInteger
            powerNumbers.add(newPowerNumber.toInt())

            incrementer / 10
        }

    }
    return 0
}