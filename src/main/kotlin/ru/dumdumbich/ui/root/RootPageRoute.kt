package ru.dumdumbich.ru.dumdumbich.ui.root

import io.ktor.resources.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.resources.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable

/**
 * @author  DumDumbIch (dumdumbich@mail.ru)
 * @version 1.0
 * @date  11.04.2023 10:06
 */

@Resource("/")
@Serializable
class RootPageRoute

fun Route.rootPageRoute() {
    get<RootPageRoute> {
        call.respondRedirect("/home", permanent = true)
    }
}

fun Application.registerRootPageRoute() {
    routing {
        static("/static") {
            resources("files")
        }
        rootPageRoute()
    }
}