<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/assets/css/sign-up.css">
    <title>회원가입</title>
</head>
<body>
    <div id="snowfall"></div>

    <div class="registerDiv">
        <img id="santa" src="/assets/img/santaHat.png" alt="">
        <form class="registerForm" action="" method="">
            <div class="registerTitle">
                <h2>계정 만들기</h2>
            </div>
            <div class="inputDiv">
                <span class="inputText">아이디<span class="redStar">&nbsp;*</span></span>
                <input id="inputDiv1" type="text" name="account">
                <span class="inputText">이름<span class="redStar">&nbsp;*</span></span>
                <input id="inputDiv2" type="text" name="account">
                <span class="inputText">이메일<span class="redStar">&nbsp;*</span></span>
                <input id="inputDiv3" type="email" name="email">
                <span class="inputText">비밀번호<span class="redStar">&nbsp;*</span></span>
                <input id="inputDiv4" type="password" name="password">
                <span class="inputText">비밀번호 확인<span class="redStar">&nbsp;*</span></span>
                <input id="inputDiv5" type="password" name="password">
            </div>
            <button id="registerBtn" type="submit"> 회원가입 </button>
            <div class="goLogin">
                <a href="/">로그인 화면으로 돌아가기</a>
            </div>
        </form>

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