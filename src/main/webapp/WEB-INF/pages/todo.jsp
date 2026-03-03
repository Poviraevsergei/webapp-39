<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1> Hello <%=request.getSession().getAttribute("username")%></h1>
<h1> Hello ${username}</h1>
</body>
</html>