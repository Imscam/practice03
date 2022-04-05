<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
</head>
<body>
	<h2>상품 목록</h2>

<article>
	
		<table border="1">
			<tr>
					<th>옷번호</th>
					<th>옷 코드</th>
					<th>옷  이름</th>
					<th>옷 수량</th>
			</tr>
			<c:forEach items="${list}" var="list" >
				<tr>
					<td>${list.clothNum}</td>
					<td>${list.clothCode}</td>
					<td><a href="<c:url value="/board/view.do/${list.clothNum}"/>">
						${list.clothName}</a></td>
					<td>${list.clothInventory}</td>
				</tr>
			</c:forEach>
		</table>

</article>
</body>
</html>