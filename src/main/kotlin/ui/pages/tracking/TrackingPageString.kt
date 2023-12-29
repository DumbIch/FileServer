package ru.dumdumbich.ui.pages.tracking

import ru.dumdumbich.domain.entity.Content
import ru.dumdumbich.domain.entity.Language

/**
 * @author  DumDumbIch (dumdumbich@mail.ru)
 * @version 1.0
 * @date  14.04.2023 11:44
 */

enum class TrackingDirectoryPageString(val content: Content) {

    TITLE(
        Content(
            "Отслеживание изменений в целевой директории",
            "Tracking of target directory"
        )
    ),
    TEXT(
        Content(
            "Показать содержимое",
            "Show content :"
        )
    ),
    COLUMN_FILE_NAME(
        Content(
            "Имя",
            "File name"
        )
    ),
    COLUMN_FILE_SIZE(
        Content(
            "Размер",
            "File size"
        )
    ),
    COLUMN_CREATED_TIME(
        Content(
            "Время создания",
            "Created time"
        )
    ),
    COLUMN_LAST_MODIFICATION_TIME(
        Content(
            "Время модификации",
            "Last modification time"
        )
    ),
    COLUMN_MIME_TYPE(
        Content(
            "MIME тип",
            "MIME Type"
        )
    ),
    COLUMN_FILE_OR_DIRECTORY(
        Content(
            "Файл или директория",
            "File or Directory"
        )
    );


    fun get(language: Language): String = when (language) {
        Language.EN -> this.content.en
        Language.RU -> this.content.ru
    }

}