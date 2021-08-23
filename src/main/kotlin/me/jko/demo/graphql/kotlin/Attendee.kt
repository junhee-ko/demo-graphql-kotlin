package me.jko.demo.graphql.kotlin

data class Attendee(
    override val name: String,
    val ticket: TicketType
) : People
