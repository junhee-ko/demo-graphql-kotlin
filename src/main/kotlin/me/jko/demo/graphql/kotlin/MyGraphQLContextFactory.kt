package me.jko.demo.graphql.kotlin

import com.expediagroup.graphql.server.spring.execution.SpringGraphQLContext
import com.expediagroup.graphql.server.spring.execution.SpringGraphQLContextFactory
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest

@Component
class MyGraphQLContextFactory : SpringGraphQLContextFactory<MyGraphQLContext>() {
    override suspend fun generateContext(request: ServerRequest): MyGraphQLContext {
        val customVal = request.headers().firstHeader("MyHeader") ?: "defaultValue"

        return MyGraphQLContext(customVal, request)
    }
}

class MyGraphQLContext(val myCustomValue: String, request: ServerRequest) : SpringGraphQLContext(request)
