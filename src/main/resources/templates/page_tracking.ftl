<#import "page_base.ftl" as layout />
<@layout.header>
    <h1>${model.title}</h1>
    <div>
        <h3>
            ${model.columnFileName} : ${model.columnCreatedTime} : ${model.columnLastModificationTime} : ${model.columnMimeType} : ${model.columnFileSize} : ${model.columnFileOrDirectory}
        </h3>
    </div>
    <table border="1px" cellspacing="2" border="1" cellpadding="5">
        <#list model.listFileInfo as file>
            <tr><td>${file.name}<td>${file.createdTime}<td>${file.lastModifiedTime}<td>${file.mimeType}<td>${file.size}<td>${file.pathType}
        </#list>
    </table>
</@layout.header>