package ru.dumdumbich.domain.entity

/**
 * @author  DumDumbIch (dumdumbich@mail.ru)
 * @version 1.0
 * @date  14.04.2023 11:56
 */

enum class PathType(val content: Content) {
    FILE(
        Content(
            "Файл",
            "File"
        )
    ),
    DIRECTORY(
        Content(
            "Каталог",
            "Directory"
        )
    );

    fun get(language: Language): String = when (language) {
        Language.EN -> this.content.en
        Language.RU -> this.content.ru
    }

}