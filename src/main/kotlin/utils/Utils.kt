package utils

fun getFactorial(number: Int): Int {
    var factorial = 1

    if (number == 0 || number == 1) {
        return factorial
    }

    for (i in 2 .. number) {
        factorial *= i
    }

    return factorial
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }

    if (number == 2) {
        return true
    }

    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}

fun reverseString(string: String): String {
    return string.reversed()
}

fun findMaxElement(numbers: IntArray): Int? {
    return numbers.maxOrNull()
}

fun fibonacci(number: Int): Int {
    if (number == 1) {
        return 0
    }

    val sequence = mutableListOf(0, 1)

    for (i in 2 until number) {
        sequence.add(sequence[i - 1] + sequence[i - 2])
    }

    return sequence.last()
}

fun isPalindrome(string: String): Boolean {
    val lowerCase = string.lowercase()

    return lowerCase == lowerCase.reversed()
}

fun sumOfDigits(number: Int): Int {
    var sum = 0
    var currentNumber = number

    while (currentNumber != 0) {
        val digit = currentNumber % 10
        sum += digit
        currentNumber /= 10
    }

    return sum
}

fun calculateGCD(a: Int, b: Int): Int {
    if (b == 0) {
        return a
    }

    return calculateGCD(b, a % b)
}

fun countVowels(string: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var count = 0

    for (characters in string) {
        if (characters in vowels) {
            count += 1
        }
    }

    return count
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9.0 / 5.0) + 32
}
