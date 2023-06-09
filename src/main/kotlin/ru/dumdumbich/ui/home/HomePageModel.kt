package ru.dumdumbich.ru.dumdumbich.ui.home

import ru.dumdumbich.ru.dumdumbich.domain.entity.Language
import ru.dumdumbich.ru.dumdumbich.ui.base.BasePageModel

/**
 * @author  DumDumbIch (dumdumbich@mail.ru)
 * @version 1.0
 * @date  11.04.2023 09:58
 */

class HomePageModel(language: Language = Language.RU) : BasePageModel(language) {

    val title = HomePageString.TITLE.get(language)

}
