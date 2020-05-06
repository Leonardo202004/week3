<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>
<body>
<div class="table table-hover">
<form action="/houses">
姓名：<input type="text" name="name" value="${vo.name }">
手机号：<input type="text" name="phone" value="${vo.phone }">
房型：<input type="text" name="tname" value="${vo.tname }">
房价：<input type="text" name="p1" value="${vo.p1 }">--<input type="text" name="p2" value="${vo.p2 }">
预定日期：<input type="date" name="c1" value="${vo.c1 }">--<input type="date" name="c2" value="${vo.c2 }">
<input type="submit" value="查询">
</form>
	<table>
		<tr>
			<td>预定日期</td>
			<td>姓名</td>
			<td>手机</td>
			<td>房型</td>
			<td>房价</td>
			<td>备注</td>
		</tr>
		<c:forEach items="${info.list }" var="i"> 
		<tr>
			<td>
			<fmt:formatDate value="${i.created }" pattern="yyyy-MM-dd"/>
			
			</td>
			<td>${i.name }</td>
			<td>${i.phone }</td>
			<td>${i.tname }</td>
			<td>${i.price }</td>
			<td>${i.content }</td>
		</tr>
		</c:forEach>
		<tr>
		<td><jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include></td>
		</tr>
	</table>
</div>
<script type="text/javascript">
	function goPage(pageNum){
		location="/houses?pageNum="+pageNum;
	}
</script>
</body>
</html>