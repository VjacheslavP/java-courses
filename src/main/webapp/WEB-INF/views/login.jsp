<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Authorization</title>
</head>
<body>
<c:if test="${message}">
    <p class="warning">
        <c:out value="${message}"></c:out>
    </p>
</c:if>
    <form action="/catalog/action/login" method="post">
        <input name="username" value="test" type="text"/>
        <input name="password" value="test" type="password"/>
        <input type="submit"/>
    </form>
</body>
</html>
