import kotlin.random.Random
fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    if (num <= 3) return true
    if (num % 2 == 0 || num % 3 == 0) return false
    var i = 5
    while (i * i <= num) {
        if (num % i == 0 || num % (i + 2) == 0) return false
        i += 6
    }
    return true
}
fun main() {
    var randomPrime: Int? = null
    var Attempts = 0
    do {
        val randomNum = Random.nextInt(2, 10000001)
        println("Random number: $randomNum")
        if (isPrime(randomNum)) {
            println("$randomNum is a PRIME number")
            randomPrime = randomNum
        }
        else {
            printFactors(randomNum)
        }
        Attempts++
    } while (randomPrime == null)

    println("Total attempts to find a prime number: $Attempts")
}
fun printFactors(num: Int) {
    print("$num is NOT prime.  factors: ")
    for (i in 2..num / 2) {
        if (num % i == 0) {
            print("$i ")
        }
    }
    println()
}

