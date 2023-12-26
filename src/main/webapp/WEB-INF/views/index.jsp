<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Web Study</title>
    <style>
        .test1 {
            background-color: #1E2026;
        }
        .test2 {
            float: left;
            background-color: #496D8C;
            width: 700px;
            height: 500px;
            margin-top: 50px;
            border: 2px solid transparent;
            border-radius: 30px;
            background-image: linear-gradient(#323640, #4E5463),
            linear-gradient(to right, #2A8C68 0%, #04BF68 100%);
            background-origin: border-box;
            background-clip: content-box, border-box;
        }
        /**/
        .test3 {
            color: white;
            background-color: #FFFFFF;
            width: auto;
            height: 120px;
            margin-top: 650px;
        }
        .test4 {
            color: black;
            float: left;
            background-color: #496D8C;
            width: 300px;
            height: 800px;
            margin: 50px;
            border: 2px solid transparent;
            border-radius: 30px;
            background-image: linear-gradient(#747D94, #747D94),
            linear-gradient(to right, #04BF68 0%, #2A8C68 100%);
            background-origin: border-box;
            background-clip: content-box, border-box;
        }
        .test5 {
            color: white;
            clear: both;
            background-color: #1E2026;
            width: 700px;
            height: 250px;
            transform: translate(0, -120%);
            border: 2px solid transparent;
            border-radius: 30px;
            background-image: linear-gradient(#323640, #4E5463),
            linear-gradient(to right, #08A65C 0%, #04BF68 100%);
            background-origin: border-box;
            background-clip: content-box, border-box;
        }
    </style>
</head>
<body class="test1">
<div class="test2"></div>
<div class="test4">
    <div class="test3"></div>
</div>
<div class="test5"></div>
</body>
</html>