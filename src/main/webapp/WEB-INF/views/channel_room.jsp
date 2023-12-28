<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Welcome Ch.?</title>
    <link rel="stylesheet" href="/assets/css/channel_room.css">
    <link rel="stylesheet" href="https://cdn.linearicons.com/free/1.0.0/icon-font.min.css">
</head>

<body class="back_bg">
<div class="container">
    <div class="container_group">
        <div class="box1">
            <div class="menu">
                <h1>Channel Name</h1>
                <div class="dropdown">
                    <button class="dropbtn">
                        <span class="lnr lnr-chevron-down"></span>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">친구</a>
                        <a href="#">채널</a>
                    </div>
                </div>
            </div>
            <div class="channel_group">
                <div class="channel">
                    <input type="button" class="channel_button">
                    <input type="button" class="channel_button">
                </div>
                <div class="userlist">
                    <a href="#"><p>Me</p></a>
                    <a href="#"><p>User1</p></a>
                </div>
            </div>
        </div>
        <div class="box2">
            <div id="chat-page" class="hidden">
                <div class="chat-container">
                    <div class="chat-header">
                        <h2>Ch.? Room</h2>
                    </div>
                    <!-- messageArea는 채팅 내역이 들어갈 곳이다. li 구역 안보여야 함.-->
                    <ul id="messageArea">
                        <li> <!-- 프로필은 디폴트 또는 사용자 변경, 닉네임은 불러오기, <p>는 input 내용 가져오기 -->
                            <a href="#"><img src="/assets/img/santa.png">nickname</a>
                            <p>just do it.</p>
                        </li>
                    </ul>
                    <form id="messageForm" name="messageForm">
                        <div class="form-group">
                            <div class="input-group clearfix">
                                <input type="text" id="message" placeholder="메시지를 입력하시오..." autocomplete="off" class="form-control"/>
                                <button type="submit" class="primary">Send</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>