package eu.wojciechzurek.example.functions

import java.util.function.Function

class Statistic : Function<String, Map<Char, Int>> {

    override fun apply(message: String): Map<Char, Int> = message
            .toLowerCase()
            .filter { char -> char in message }
            .groupingBy { char -> char }
            .eachCount()
}