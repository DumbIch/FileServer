package ru.dumdumbich.ru.dumdumbich.ui.home

import io.ktor.resources.*
import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.resources.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable

/**
 * @author  DumDumbIch (dumdumbich@mail.ru)
 * @version 1.0
 * @date  11.04.2023 09:59
 */

@Resource("/home")
@Serializable
class HomePageRoute

fun Route.homePageRoute() {
    get<HomePageRoute> {
        val model = HomePageModel()
        call.respond(FreeMarkerContent("page_home.ftl", mapOf("model" to model)))
    }
}

fun Application.registerHomePageRoute() {
    routing {
        homePageRoute()
    }
}