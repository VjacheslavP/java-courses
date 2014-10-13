<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Categories list: </h1>
<ul>
    <c:forEach var="category" items="${categories}">
        <li>
            <a href="/catalog/products/<c:out value="${category.id}"></c:out>">
                <c:out value="${category.name}"></c:out>
            </a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
