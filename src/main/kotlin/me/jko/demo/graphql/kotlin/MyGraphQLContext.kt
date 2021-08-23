package me.jko.demo.graphql.kotlin

import com.expediagroup.graphql.server.spring.execution.SpringGraphQLContext
import org.springframework.web.reactive.function.server.ServerRequest

class MyGraphQLContext(val myCustomValue: String, request: ServerRequest) : SpringGraphQLContext(request)
