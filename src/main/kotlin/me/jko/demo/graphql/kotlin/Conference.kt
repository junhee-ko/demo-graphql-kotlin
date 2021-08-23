package me.jko.demo.graphql.kotlin

import com.expediagroup.graphql.generator.annotations.GraphQLDescription

data class Conference(
    @GraphQLDescription(value = "Awesome place to learn `things`")
    val name: String,

    @Deprecated("no needed anymore")
    val year: Int?
)
