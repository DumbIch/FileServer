package ru.dumdumbich

import io.ktor.server.application.*
import io.ktor.server.resources.*
import ru.dumdumbich.ru.dumdumbich.core.monitor.AppMonitorPlugin
import ru.dumdumbich.ru.dumdumbich.core.monitor.monitorModule
import ru.dumdumbich.ru.dumdumbich.ui.base.configureTemplating
import ru.dumdumbich.ru.dumdumbich.ui.home.registerHomePageRoute
import ru.dumdumbich.ru.dumdumbich.ui.root.registerRootPageRoute

/**
 * @author  DumDumbIch (dumdumbich@mail.ru)
 * @version 1.0
 * @date  11.04.2023 09:38
 */

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    install(Resources)
    install(AppMonitorPlugin)
    monitorModule()
    configureTemplating()
    registerRootPageRoute()
    registerHomePageRoute()
}
