<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home Page</title>
<%@ include file="parts/header.jsp" %>
</head>
<body>
<%@ include file="parts/nav.jsp" %>
    <div class="view">
        <div class="pages">
            <jsp:include page="parts/shop.jsp"></jsp:include>
        </div>
    </div>
      <%@ include file="parts/footer.jsp" %>
</body>
</html>

