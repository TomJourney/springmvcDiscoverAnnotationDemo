<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  import="java.util.List" import="java.util.ArrayList"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
    <table border="1" cellpadding="0" cellspacing="0" bordercolor="#000000">
        <tr>
            <td>编号</td>
            <td>银行卡号</td>
            <td>备注</td>
        </tr>
        <c:forEach items="${bankCardList}" var="bankCard">
            <tr>
                <td>${bankCard.id}</td>
                <td>${bankCard.cardNo}</td>
                <td>${bankCard.remark}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>