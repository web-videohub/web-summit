<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<div class="serverListDiv">
    <div class="serverList">
        <div class="selectedEffect"></div>
        <button class="server meBtn" type="button"></button>
    </div>
    <span class="makeLine"></span>

    <div class="servers">
        <c:forEach var="s" items="${sList}">
            <div class="serverList">
                <div class="selectedEffect"></div>
                <button type="button" class="server" name="${s.serverName}"></button>
            </div>
        </c:forEach>
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