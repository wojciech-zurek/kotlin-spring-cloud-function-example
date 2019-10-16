package eu.wojciechzurek.example.functions

import eu.wojciechzurek.example.loggerFor
import java.util.function.Consumer

class Log : Consumer<String>{

    private val logger  = loggerFor(javaClass)

    override fun accept(message: String) = logger.info("Got it! $message")
}