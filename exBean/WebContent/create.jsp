<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<jsp:useBean id="item" scope="page" class="exBean.studentVO">

 <jsp:setProperty name="item" property="no"/>

 <jsp:setProperty name="item" property="name"/>

 <!--<jsp:setProperty name="item" property="*"/>-->

</jsp:useBean>

<jsp:useBean id="dao" scope="page" class="exBean.studentDAO"/>

</html>
<%
 request.setCharacterEncoding("UTF-8");
 dao.insertStudent(item);
%>