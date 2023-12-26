<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>메인화면</title>
    <style>
        body {
            background-color: #1e2026;
            display: flex;
            justify-content: center;
            align-content: center;
            flex-direction: column;
        }
        .tex {
            width: 1000px;
            height: 600px;
            margin: auto;
            background-color: #496d8c;
            border: 2px solid transparent;
            border-radius: 30px;
            background-image: linear-gradient(#323640, #4e5463),
            linear-gradient(to right, #2a8c68 0%, #04bf68 100%);
            background-origin: border-box;
            background-clip: content-box, border-box;
        }
        #maintext {
            color: #04bf68;
            text-align: center;
            font-size: 5vh;
        }
    </style>
</head>
<body>
    <div><h3 id="maintext">안녕하세요 디수쿠도 입니다!</h3></div>
    <div class="tex"></div>
</body>
</html>