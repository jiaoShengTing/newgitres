<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
    <c:if test="${ ! empty list }">
      <table border="1px" width="80%">
         <tr>
            <td>编号</td>
            <td>型号</td>
            <td>价格</td>
            <td>日期</td>
            <td>操作</td>
         </tr>
         <c:forEach items="${list }" var="equ" varStatus="status">
            <tr>
            <td>${equ.id }</td>
            <td>${equ.model }</td>
            <td>${equ.price }</td>
            <td><f:formatDate value="${equ.date }" /></td>
            <td><a href="queryById.mapper?id=${equ.id }">修改</a></td>
            </tr>
         </c:forEach>
      </table>
       <a href="add.jsp">添加</a>
   </c:if>
   <c:if test="${empty list }">
      <c:redirect url="queryList.mapper"></c:redirect>
   </c:if>
   
</body>
</html>