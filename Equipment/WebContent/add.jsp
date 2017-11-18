<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>add.jsp</title>
</head>
<body>
<center>
<h3 >添加备件</h3>
<form action="addEqu1.mapper">
  <table>
     <tr>
        <td>型号</td>
        <td><input name="model"/> </td>
     </tr>
     <tr>
       <td>价格</td>
        <td><input name="price"/></td>
     </tr>
     <tr>
        <td>日期</td>
         <td><input name="date"/> </td>
     </tr>
      <tr>
        <td><input type="reset" value="清空"/><td>
         <td><input type="submit" value="提交"/> </td>
     </tr>
  </table>
</form>
</center>
</body>

</html>