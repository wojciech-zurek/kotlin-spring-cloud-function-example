package eu.wojciechzurek.example.functions

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import java.util.function.Function

@Component
class Case {

    @Bean
    fun upperCase(): Function<String, String> = Function { it.toUpperCase() }

    @Bean
    fun lowerCase(): Function<Flux<String>, Flux<String>> = Function { it.map { word -> word.toLowerCase() } }
}