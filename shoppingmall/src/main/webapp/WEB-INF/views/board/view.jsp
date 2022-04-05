<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보</title>
</head>
<body>
<h2>상품 정보</h2>
		<table border="1">
				<tr>
					<th>옷 코드</th>
					<td>${vo.clothCode}</td>
				</tr>
				<tr>
					<th>옷 이름</th>
					<td>${vo.clothName}</td>
				</tr>
				<tr>
					<th>옷 사이즈</th>
					<td>${vo.clothSize}</td>
				</tr>
				<tr>
					<th>옷 가격</th>
					<td>${vo.clothPrice}</td>
				</tr>
				<tr>
					<th>옷 소개</th>
					<td colspan="2">${vo.clothInfo}</td>
				</tr>
				<tr>
					<th>옷 수량</th>
					<td>${vo.clothInventory}</td>
				</tr>
				
		</table>
		<div>
				<a href="<c:url value="/board/list.do"/>">목록</a>
				<a href="${pageContext.request.contextPath}/board/delete?no=${vo.clothNum}"role="button" class="btn btn-outline-info">삭제</a>
				

		</div>

</body>
</html>