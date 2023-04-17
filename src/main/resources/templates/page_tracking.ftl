<#import "page_base.ftl" as layout />
<@layout.header>
    <table>
        <caption align=center>
            <em><b>${model.title}</b></em>
        </caption>
        <tr><th>${model.columnFileName}<th>${model.columnCreatedTime}<th>${model.columnLastModificationTime}<th>${model.columnMimeType}<th>${model.columnFileSize}<th>${model.columnFileOrDirectory}
        <#list model.listFileInfo as file>
            <tr><td>${file.name}<td>${file.createdTime}<td>${file.lastModifiedTime}<td>${file.mimeType}<td>${file.size}<td>${file.pathType}
        </#list>
    </table>
</@layout.header>