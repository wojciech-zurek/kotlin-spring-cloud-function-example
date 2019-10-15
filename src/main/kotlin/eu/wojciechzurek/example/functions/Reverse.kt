package eu.wojciechzurek.example.functions

import reactor.core.publisher.Flux
import java.util.function.Function

class Reverse : Function<Flux<String>, Flux<String>> {

    override fun apply(message: Flux<String>): Flux<String> = message.map { it.reversed() }
}