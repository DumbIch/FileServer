<#macro header>
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <title>${model.titleHeader}</title>
            <link rel="stylesheet" type="text/css" href="/static/css/styles.css">
        </head>
        <body>
            <img src="/static/images/atom.jpg">
            <h2>${model.titleHeader}</h2>
            <hr>
            <#nested>
            <hr>
            <a href="/">Back to the main page</a>
            <p><i>${model.titleFooter}</i></p>
        </body>
    </html>
</#macro>