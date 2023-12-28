<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/assets/css/channels-me.css">
    <title>Summit 메인화면</title>
</head>
<body>
    <div class="mainDiv">
        <div class="serverListDiv">
            <button class="meBtn" type="button"></button>
            <span class="makeLine"></span>

            <div class="servers">
                <div class="serverList">
                    <div class="selectedEffect"></div>
                    <button type="button" class="server"></button>
                </div>
                <div class="serverList">
                    <div class="selectedEffect"></div>
                    <button type="button" class="server"></button>
                </div>
            </div>

        </div>


        <div class="dmsgListDiv">
            <button class="startDM" type="button">다이렉트 메세지 시작하기</button>
            <div class="dmsgs">
                <div class="dmsgList">
                    <button type="button" class="dmsg">김다빈</button>
                </div>
            </div>
        </div>



        <div class="friendListDiv">

        </div>
    </div>
</body>
</html>