<%@page isELIgnored="false" pageEncoding="utf-8" contentType="text/html; utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <c:forEach items="${requestScope.User}" var="admin">
        ${admin.id}
        ${admin.name}
        ${admin.password}<br/>
    </c:forEach>

</body>
</html>
