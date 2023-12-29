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
        <jsp:include page="include/serverList.jsp"/>
        <div class="dmsgListDiv">
            <button class="startDM" type="button">다이렉트 메세지 시작하기</button>
            <div class="dmsgs">
                <c:forEach var="m" items="${mList}">
                    <div class="dmsgList">
                        <button type="button" class="dmsg" name="${m.dms}">김다빈</button>
                    </div>
                </c:forEach>
                <div class="dmsgList">
                    <button type="button" class="dmsg">김다빈</button>
                </div>
                <div class="dmsgList">
                    <button type="button" class="dmsg">김다빈</button>
                </div>

            </div>


            <div class="profileDiv">
                <span>프사</span>
<%--                ${login.profileIMG}
                    ${login.name}
                    ${login.state}
--%>
                <span>사용자이름</span>
                <span>온라인</span>
            </div>
        </div>



        <div class="friendListDiv">
            <div class="friendFilterDiv">
                <div class="filters">
                    <button type="button">친구</button>
                    <button type="button">온라인</button>
                    <button type="button">모두</button>
                </div>
            </div>
            <h4>온라인 - 0명</h4>
            <div class="friends">
                <c:forEach var="f" items="${fList}">
                    <div class="friendList">
                        <span>${f.name}</span>
                        <span>${f.state}</span>
                    </div>

                </c:forEach>
                <div class="friendList">
                    <span>다빈99</span>
                    <span>온라인</span>
                </div>
            </div>
        </div>
    </div>

<script>
    // 서버클릭시 selectedEffect 작동
    let $servers = document.querySelectorAll('.server');
    let $selectedEffects = document.querySelectorAll('.selectedEffect');
    $servers.forEach($server => {
        $server.addEventListener("click", e => {
            $selectedEffects.forEach($selectedEffect => {
                $selectedEffect.style.display = 'none';
            });

            let $serverList = $server.closest('.serverList'); // 수정된 부분
            let $selectedEffect = $serverList.querySelector('.selectedEffect');

            $selectedEffect.style.display = 'flex';
        });
    });



    // 서버목록 렌더링

    // 메세지목록 렌더링

    // 친구목록(+접속상태) 렌더링
</script>
</body>
</html>