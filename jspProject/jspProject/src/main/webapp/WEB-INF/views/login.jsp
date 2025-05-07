<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/main.css">
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
	<main>
		<form action="" method="post">
			<div>
				<label>id</label><input type="text" name="id" required="required" placeholder="아이디">
				<label>pw</label><input type="password" name="pw" required="required" placeholder="비밀번호">
				<button>login</button>
			</div>
			<div><a href="#">회원가입</a></div>
		</form>
	</main>
	<jsp:include page="/WEB-INF/views/common/footer.jsp"></jsp:include>
</body>
</html>