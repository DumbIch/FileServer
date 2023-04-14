package ru.dumdumbich.ui.pages.tracking

import ru.dumdumbich.domain.entity.FileInfo
import ru.dumdumbich.domain.entity.Language
import ru.dumdumbich.domain.entity.PathType
import ru.dumdumbich.domain.usecase.GetFileInfoUseCase
import ru.dumdumbich.ui.base.BasePageModel

/**
 * @author  DumDumbIch (dumdumbich@mail.ru)
 * @version 1.0
 * @date  14.04.2023 11:46
 */

class TrackingPageModel(val path: String, language: Language = Language.RU) :
    BasePageModel(language) {

    private var _listFilesInfo: List<FileInfo>
    val listFileInfo: List<FileInfo>
        get() = _listFilesInfo

    val title = TrackingDirectoryPageString.TITLE.get(language)
    val columnFileName = TrackingDirectoryPageString.COLUMN_FILE_NAME.get(language)
    val columnFileSize = TrackingDirectoryPageString.COLUMN_FILE_SIZE.get(language)
    val columnCreatedTime = TrackingDirectoryPageString.COLUMN_CREATED_TIME.get(language)
    val columnLastModificationTime = TrackingDirectoryPageString.COLUMN_LAST_MODIFICATION_TIME.get(language)
    val columnMimeType = TrackingDirectoryPageString.COLUMN_MIME_TYPE.get(language)
    val columnFileOrDirectory = TrackingDirectoryPageString.COLUMN_FILE_OR_DIRECTORY.get(language)

    init {
        _listFilesInfo = getFileInfo(path)
//        _listFilesInfo = getFakeFileInfo()

    }


    private fun getFileInfo(path: String) = GetFileInfoUseCase(path).invoke()

    private fun getFakeFileInfo() =
        listOf(
            FileInfo("file01", "10000", "12:00", "15:00", "plan/txt", PathType.FILE),
            FileInfo("file02", "10000", "12:00", "15:00", "plan/txt", PathType.FILE),
            FileInfo("file03", "10000", "12:00", "15:00", "plan/txt", PathType.FILE),
            FileInfo("file04", "10000", "12:00", "15:00", "plan/txt", PathType.FILE),
            FileInfo("file05", "10000", "12:00", "15:00", "plan/txt", PathType.FILE),
            FileInfo("file06", "10000", "12:00", "15:00", "plan/txt", PathType.FILE),
            FileInfo("file07", "10000", "12:00", "15:00", "plan/txt", PathType.FILE),
            FileInfo("file08", "10000", "12:00", "15:00", "plan/txt", PathType.FILE),
            FileInfo("file09", "10000", "12:00", "15:00", "plan/txt", PathType.FILE),
            FileInfo("file10", "10000", "12:00", "15:00", "plan/txt", PathType.FILE)
        )

}
