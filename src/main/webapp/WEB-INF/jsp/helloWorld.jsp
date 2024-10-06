<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  import="java.util.List" import="java.util.ArrayList"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>helloWorld</title>
</head>
<body>
    tips:  ${tips} <br>
    tips2:  ${tips2} <br>
    bankCardDto:  id = ${bankCardDto.id};cardNo = ${bankCardDto.cardNo}; remark = ${bankCardDto.remark};
</body>
</html>