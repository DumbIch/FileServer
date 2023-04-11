package ru.dumdumbich.ru.dumdumbich.ui.base

import ru.dumdumbich.ru.dumdumbich.domain.entity.Content
import ru.dumdumbich.ru.dumdumbich.domain.entity.Language

/**
 * @author  DumDumbIch (dumdumbich@mail.ru)
 * @version 1.0
 * @date  11.04.2023 09:38
 */

enum class BasePageString(val content: Content) {
    HEADER(
        Content(
            "Файловый сервер системы регистрации аварийных и переходных процессов",
            "File server of Disturbance recorder system"
        )
    ),
    FOOTER(
        Content(
            "При технической поддержке ДимДимЫч : dumdumbich@mail.ru",
            "with technical support by DumDumbIch : dumdumbich@mail.ru"
        )
    );

    fun get(language: Language): String = when (language) {
        Language.EN -> this.content.en
        Language.RU -> this.content.ru
    }

}