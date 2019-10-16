package eu.wojciechzurek.example.functions

import eu.wojciechzurek.example.UserEntity
import eu.wojciechzurek.example.UserRequest
import reactor.core.publisher.Flux
import java.util.concurrent.atomic.AtomicLong
import java.util.function.Function

class User : Function<Flux<UserRequest>, Flux<UserEntity>> {

    private val id = AtomicLong()

    override fun apply(request: Flux<UserRequest>): Flux<UserEntity> = request.map { UserEntity(id.getAndIncrement(), it.name, it.age) }
}