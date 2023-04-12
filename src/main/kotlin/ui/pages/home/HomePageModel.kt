package ru.dumdumbich.ui.pages.home

import ru.dumdumbich.ui.base.BasePageModel
import ru.dumdumbich.ui.entity.Language

/**
 * @author  DumDumbIch (dumdumbich@mail.ru)
 * @version 1.0
 * @date  11.04.2023 09:58
 */

class HomePageModel(language: Language = Language.RU) : BasePageModel(language) {

    val title = HomePageString.TITLE.get(language)

}
