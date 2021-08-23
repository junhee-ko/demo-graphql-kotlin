package me.jko.demo.graphql.kotlin

import com.expediagroup.graphql.generator.annotations.GraphQLDescription
import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component

@Component
class ConferenceQuery : Query {

    fun conference() = Conference(name = "KotlinConf", year = 2019)

    fun people(nameStartWith: String?): List<People> =
        listOf(
            Attendee(name = "Junhee", ticket = TicketType.FULL),
            Speaker(name = "James", talks = listOf("GraphQL is awesome", "GraphQL-Kotlin is event better"))
        ).filter { it.name.startsWith(nameStartWith ?: "") }

    fun schedule(): ScheduleDetails = ScheduleDetails()
}
