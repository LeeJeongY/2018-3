<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<%@ page import = "exActionTag.studentVO" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<jsp:useBean id="item" scope="page" class="exActionTag.studentVO"/> 
<jsp:useBean id="dao" scope="page" class="exActionTag.studentDAO"/>
<%
 request.setCharacterEncoding("UTF-8");
 List<studentVO> items = new ArrayList<studentVO>(); //ArrayList를 선언한다.
 items = dao.selectStudent(); //DAO에 있는 selectStudent를 아이템이라는 변수에 넣는다.
%>
<body>
<%
 for(int i=0;i<items.size();i++) { 
  item = items.get(i);
%>
  <%=item.getNo()%>
  <%=item.getName()%><BR>
 <%}%>
</body>
</html>