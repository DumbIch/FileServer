package ru.dumdumbich.ui.pages.tracking

import io.ktor.resources.*
import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.resources.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable
import ru.dumdumbich.targetDirectory

/**
 * @author  DumDumbIch (dumdumbich@mail.ru)
 * @version 1.0
 * @date  14.04.2023 11:48
 */


@Serializable
@Resource("/pages/tracking")
class TrackingPageRoute


fun Route.trackingPageRoute(directory: String) {
    get<TrackingPageRoute> {
        val model = TrackingPageModel(targetDirectory)
        call.respond(FreeMarkerContent("page_tracking.ftl", mapOf("model" to model)))
    }
}

fun Application.registerTrackingPageRoute(directory: String) {
    routing {
        trackingPageRoute(directory)
    }
}
