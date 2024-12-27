<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이름 중복 안내</title>
<style>
	h1 {
		--color: red;
	}
</style>
<%	
//꺽쇠 퍼센트는 스크립틀릿 이라고 해서 jsp에서 자바 코드를 작성하세 해줌
//원래 jsp는 실행될때 servlet 으로 변환되어 실행됨. 사실상 서블릿임
//** 그래서 HTML  기반의 파일이지만 자바 코드를 쓸 수 있는 특징을 가짐
//서블릿의 경우에는 어떨까?
//서블릿의 경우에는 PrinterWriter 를 통해서 웹페이지 태그를 출력할수 있었음
//**jsp 와비교했을ㄸ#ㅐ 자바 기반의 파일이지만 HTML 코드를 쓸 수 있는 특징을 가짐
//jsp의 사용 이유
//-자바 코드와 HTML 코드를 분리할수 있음
//-> 지금의 result.jsp는 자바 +HTML 코드가 같이 있는 것 이지만 지금 하려고 하는 것이 자바코드와 HTML 코드를 분리 하려고 하는 것임
//- SERVLET 과 같은 객체를 공휴 할 수 있어서 백엔드 단에서 넘어온 데이터를 출력 할수 있음
//MVC Model1,2  설명
//지금처럼 JSP 에 자바코드와 html 코드가 함께 있는 방식으로 코딩 하는 것을 MODEL1 방식 이라고 함
//쓰면 안되는 건 아니지만 옛날 바식이며 공동 작업시 유지보수가 힘드다는 단점이 있어서 안쓰는 방식
//혼자서 개발할때는 편리한 부분이 있음 코드가 한누에 보이기 때문에 헷갈일이 줄어듬
//백엔드 프로그래밍 (서버프로그래밍) 부분은 Servlet 에서 하고 Servlet 에서 처리한 데이터를 jsp 에서 출력 하도록 컨트롤러, 
//과 뷰로 나누는 방식을 Model 2 방식 이라고 함. 그래서 지금 그 방식 대로 코드를 수정해 볼것임 
//스크립틀릿은 삭제후 EL(= $) 을 사용하여 데이터를 받아옴
//String message = (String)request.getAttribute("message");
	
	
	
	
%>
</head>
<body>
<!--퍼센트 이쿼르 기호 옆에 변수명 대신 getAttribute 할때 전달 햇던 키 값을 달러 안에 적어주면 됨  -->
<h1> ${message}</h1>

</body>
</html>