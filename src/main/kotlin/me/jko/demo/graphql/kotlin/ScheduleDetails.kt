package me.jko.demo.graphql.kotlin

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ScheduleDetails {

    private val logger: Logger = LoggerFactory.getLogger(ScheduleDetails::class.java)

    fun greetings(context: MyGraphQLContext): String {
        return if (context.myCustomValue == "first") {
            "First greeting"
        } else {
            "Second greeting"
        }
    }

    suspend fun talks(): List<String> = coroutineScope {
        logger.info("Greetings list of talks")

        val cached = async { cachedTalks() }
        val databased = async { databaseTalks() }

        logger.info("Returning list of talks")

        listOf(cached.await(), databased.await()).flatten()
    }

    private suspend fun cachedTalks(): List<String> {
        delay(100)
        logger.info("Get cached talks")

        return listOf("GraphQL is awesome")
    }

    private suspend fun databaseTalks(): List<String> {
        delay(2000)
        logger.info("Get DB talks")

        return listOf("GraphQL-Kotlin is event better")
    }

//    private fun cachedTalks(): List<String> {
//        Thread.sleep(100)
//        logger.info("Get cached talks")
//
//        return listOf("GraphQL is awesome")
//    }
//
//    private fun databaseTalks(): List<String> {
//        Thread.sleep(2000)
//        logger.info("Get DB talks")
//
//        return listOf("GraphQL-Kotlin is event better")
//    }
}
