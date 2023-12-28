<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Ch.?</title>
    <link rel="stylesheet" href="/assets/css/channer_room.css">
    <link rel="stylesheet" href="https://cdn.linearicons.com/free/1.0.0/icon-font.min.css">
</head>

<body class="back_bg">
    <div class="container">
        <div class="container_group">
            <div class="box1">
                <div class="menu">
                    Channer name
                    <span class="lnr lnr-chevron-down"></span>
                </div>
                <div class="channer_group">
                    <div class="channer">
                        <img src="channer_profile.png">
                        <img src="channer_profile.png">
                        <img src="channer_profile.png">
                    </div>
                    <div class="userlist">
                        <p>참여자 1</p>
                        <p>참여자 2</p>
                    </div>
                </div>
            </div>
            <div class="box2">
                <div id="chat-page" class="hidden">
                    <div class="chat-container">
                        <div class="chat-header">
                            <h2>Ch.? Room</h2>
                        </div>
                        <!-- messageArea는 채팅 내역이 들어갈 곳이다.-->
                        <ul id="messageArea">
                            <li>
                                <a href="#"><img src="profile.png">nickname</a>
                                <p>just do it.</p>
                            </li>
                            <li class="mychat">
                                <a href="#"><img src="profile.png">nickname</a>
                                <p>just do it.</p>
                            </li>
                        </ul>
                        <form id="messageForm" name="messageForm">
                            <div class="form-group">
                                <div class="input-group clearfix">
                                    <input type="text" id="message" placeholder="Type a message..." autocomplete="off" class="form-control"/>
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