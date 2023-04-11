package ru.dumdumbich.ru.dumdumbich.ui.base

import ru.dumdumbich.ru.dumdumbich.domain.entity.Language

/**
 * @author  DumDumbIch (dumdumbich@mail.ru)
 * @version 1.0
 * @date  11.04.2023 09:38
 */

open class BasePageModel(language: Language = Language.RU) {

    val titleHeader: String = BasePageString.HEADER.get(language)
    val titleFooter: String = BasePageString.FOOTER.get(language)

    private var _currentLanguage: Language
    val currentLanguage: Language
        get() = _currentLanguage

    init {
        _currentLanguage = language
    }

}