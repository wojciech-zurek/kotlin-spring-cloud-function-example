package eu.wojciechzurek.example.functions

import java.util.function.Supplier

class UnixTime : Supplier<Long> {
    override fun get(): Long = System.currentTimeMillis() / 1000

}