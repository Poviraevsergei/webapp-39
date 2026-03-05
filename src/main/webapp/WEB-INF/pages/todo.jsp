<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1> Hello <%=request.getSession().getAttribute("username")%>
</h1>
<h1> Hello ${username}</h1>

ForEach:
<c:forEach var="name" items="${array}">
    <c:out value="${name}"/>
</c:forEach>

if:
<c:if test="${array.length == 3}">
    <h1>Array have 3 names</h1>
</c:if>
<br>
<c:choose>
    <c:when test="${randomNumber == 1}">
        <h1>One</h1>
    </c:when>
    <c:when test="${randomNumber == 2}">
        <h1>Two</h1>
    </c:when>
    <c:when test="${randomNumber == 3}">
        <h1>Three</h1>
    </c:when>
    <c:otherwise>
        <h1>Idk, help me ...</h1>
    </c:otherwise>
</c:choose>

<br>
try-catch:
<c:catch var="ex">
    <%System.out.println(10 / 0);%>
</c:catch>

<c:if test="${ex != null}">
    <h1> Got exception: ${ex.message}</h1>
</c:if>
</body>
</html>