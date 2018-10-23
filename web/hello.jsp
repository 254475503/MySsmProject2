<%--
  Created by IntelliJ IDEA.
  User: yifanshi006129
  Date: 2018/10/23
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:if test="${!empty bean}">
        <c:forEach items="${bean}" var="obj" varStatus="data_index">
            <p>${obj.id}</p>
        </c:forEach>
    </c:if>
</body>
</html>
