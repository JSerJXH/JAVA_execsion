<%--
  Created by IntelliJ IDEA.
  User: Big_Sea
  Date: 2022/3/20
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <c:forEach items="${list}" var="user">
    ${user.id} --${user.name}---${user.score}
  </c:forEach>
  </body>
</html>
