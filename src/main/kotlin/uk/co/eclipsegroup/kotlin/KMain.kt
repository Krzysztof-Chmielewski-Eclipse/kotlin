package uk.co.eclipsegroup.kotlin

fun main() {
    val beer = Beer("Krzysztof IPA", "KIPA", 90)
    val kBeer = KotlinBeer("Krzysztof IPA", "KIPA", 90)

    println(beer.name)
    println(kBeer.name)

    println(beer)
    println(kBeer)
}