package eu.wojciechzurek.example.functions

import eu.wojciechzurek.example.loggerFor
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import kotlin.math.PI

@Component
class Math {

    private val logger = loggerFor(javaClass)

    @Bean
    fun square(): (String) -> Int = { it.trim().toInt().let { num -> num * num } }

    @Bean
    fun stupid(): (String) -> Unit = { logger.info("Stupid function here: $it") }

    @Bean
    fun pi(): () -> Double = { PI }
}