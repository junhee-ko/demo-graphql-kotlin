package me.jko.demo.graphql.kotlin

data class Speaker(
    override val name: String,
    val talks: List<String>
) : People
