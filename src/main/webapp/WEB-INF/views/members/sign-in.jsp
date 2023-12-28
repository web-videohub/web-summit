<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/assets/css/main.css">
    <title>메인화면</title>

</head>
<body>
<div id="snowfall"></div>
<%--<jsp:include page="include/header.jsp"/>--%>
<div class="mainDiv">
    <img id="santa" src="/assets/img/santaHat.png" alt="">

    <form class="loginForm" action="" method="">
        <div class="mainTitle">
            <h1>안녕하세요? 반가워요!</h1>
            <h4>즐거운 크리스마스 보내세요!</h4>
        </div>
        <div class="inputDiv">
            <span class="inputText">아이디<span class="redStar">&nbsp;*</span></span>
            <input id="inputDiv1" type="text" name="account">
            <span class="inputText">비밀번호<span class="redStar">&nbsp;*</span></span>
            <input id="inputDiv2" type="password" name="password">
        </div>
        <div class="enterDiv">
            <a href="#">비밀번호가 생각나지 않나요?</a>
        </div>
        <button id="loginBtn" type="submit"> 로그인 </button>
        <div class="regiDiv">
            아직 가입하시지 않으셨나요? <a href="/sign-up">계정만들기</a>
        </div>
    </form>
    <div class="newsDiv">

    </div>

</div>
<script>
    document.addEventListener("DOMContentLoaded", function() {
        const snowfallContainer = document.getElementById("snowfall");

        // 눈송이 뿌리기
        for (let i = 0; i < 50; i++) {
            const snowflake = document.createElement("div");
            snowflake.className = "snowflake";
            snowflake.style.left = (Math.random() * 100) + 'vw';
            snowflake.style.animationDuration = (Math.random() * 3 + 2) + 's';
            snowfallContainer.appendChild(snowflake);
        }
    });
</script>
</body>
</html>