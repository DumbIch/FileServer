package ru.dumdumbich.ui.pages.home

import ru.dumdumbich.domain.entity.Content
import ru.dumdumbich.domain.entity.Language

/**
 * @author  DumDumbIch (dumdumbich@mail.ru)
 * @version 1.0
 * @date  11.04.2023 09:58
 */

enum class HomePageString(val content: Content) {

    TITLE(
        Content(
            "Описание ресурса",
            "About... "
        )
    ),
    TEXT(
        Content(
            "Данная программа разработана для отслеживания изменений файлов и каталогов в целевой директории",
            "The program is designed for tracking file changes in the target directory and logging events"
        )
    );

    fun get(language: Language): String = when (language) {
        Language.EN -> this.content.en
        Language.RU -> this.content.ru
    }

}