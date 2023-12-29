function sendMessage() {
    // 메시지 입력값 가져오기
    var messageText = document.getElementById("message").value;

    // 빈 칸 금지
    if(messageText === "") {
        return false;
    }

    // 새로운 메시지를 생성하여 추가
    var newMessage = document.createElement("li");
    newMessage.innerHTML = '<a href="#"><img src="/assets/img/santa.png">nickname</a><p>' + messageText + '</p>';
    document.getElementById("messageArea").appendChild(newMessage);

    // 메시지 입력값 초기화
    document.getElementById("message").value = "";

    return true;
}

function searchFriend() {

    // 검색 텍스트 값 받아오기
    var searchText = document.getElementById("search").value;
    console.log(searchText);
}