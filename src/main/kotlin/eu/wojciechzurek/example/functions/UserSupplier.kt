package eu.wojciechzurek.example.functions

import eu.wojciechzurek.example.User
import java.util.function.Supplier

class UserSupplier: Supplier<User> {

    override fun get(): User = User("Test", 30)
}