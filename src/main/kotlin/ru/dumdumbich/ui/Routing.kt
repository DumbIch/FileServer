package ru.dumdumbich.ui

/**
 * @author  DumDumbIch (dumdumbich@mail.ru)
 * @version 1.0
 * @date  10.04.2023
 */

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello from Windows Server 2008 R2 : File Tracking Server!")
        }
    }
}
