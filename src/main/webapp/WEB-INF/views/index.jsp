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
        <div class="mainTitle">
            <h1>정상회담</h1>
        </div>
        <div class="loginDiv">
            <div class="inputDiv">
                <input id="inputDiv1" type="text" name="account" placeholder=" 아이디">
                <input id="inputDiv2" type="password" name="password" placeholder=" 패스워드">
            </div>
            <div class="enterDiv">
                <button id="loginBtn" type="button" name="loginButton"> 로그인 </button>
            </div>
        </div>
        <div class="regiDiv">
            <a href="#">아이디 찾기</a>
            <a href="#">비밀번호 찾기</a>
            <a href="#">회원가입</a>
        </div>
    </div>
    <script>
        document.addEventListener("DOMContentLoaded", function() {
            const snowfallContainer = document.getElementById("snowfall");

            // Create snowflakes
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