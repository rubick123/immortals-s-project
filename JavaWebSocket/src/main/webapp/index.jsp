<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>客服聊天</title>
</head>
<body>
    <div id="chart">
        <h1 id="welcome">Welcome</h1><br/>
        <div id="message">
            <div class="bubbleDiv">
                <div class="bubbleItem">     <!--左侧的泡泡-->
                    <span id="question" class="bubble leftBubble">
                    <span class="bottomLevel"></span>
                    <span class="topLevel"></span>
                </span>
                </div>
                <div class="bubbleItem clearfix">
                    <span style="font-family: Arial, Helvetica, sans-serif;"><!--右侧的泡泡--></span>
                    <span id="answer" class="bubble rightBubble">
                    <span class="bottomLevel"></span>
                    <span class="topLevel"></span>
                </span>
                </div>
            </div>
        </div>
        <input id="text" type="text"/>
        <button onclick="send()">发送</button>
        <button onclick="closeWebSocket()">关闭</button>
    </div>
</body>

<script type="text/javascript">
    var websocket = null;
    //判断当前浏览器是否支持WebSocket
    if ('WebSocket' in window) {
        websocket = new WebSocket("ws://localhost:8080/websocket");
    }
    else {
        alert('当前浏览器 Not support websocket')
    }

    //连接发生错误的回调方法
    websocket.onerror = function () {
        //setMessageInnerHTML("WebSocket连接发生错误");
    };

    //连接成功建立的回调方法
    websocket.onopen = function () {
        setMessageInnerHTML("你好");
    }

    //接收到消息的回调方法
    websocket.onmessage = function (event) {
        setMessageInnerHTML(event.data);
    }

    //连接关闭的回调方法
    websocket.onclose = function () {
        //setMessageInnerHTML("WebSocket连接关闭");
    }

    //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
    window.onbeforeunload = function () {
        closeWebSocket();
    }

    //将消息显示在网页上
    function setMessageInnerHTML(innerHTML) {
        var qu = document.createElement("div");
        var qu_node = document.createTextNode("你好");
        qu.appendChild(qu_node);
        var element = document.getElementById("question");
        element.appendChild(qu);

        var an = document.createElement("div");
        var an_node = document.createTextNode("请问需要什么帮助？");
        an.appendChild(an_node);
        var element = document.getElementById("answer");
        element.appendChild(an);
    }

    //关闭WebSocket连接
    function closeWebSocket() {
        websocket.close();
    }

    //发送消息
    function send() {
        var message = document.getElementById('text').value;
        websocket.send(message);
    }
</script>
<style>
    #chart {
        width: 600px;
        height: 700px;
        margin-top: 50px;
        margin-left: 451.5px;
    }
    #welcome {
        text-align: center;
    }
    #text {
        size: 24px;
        margin-left: 100px;
    }
    .bubbleDiv {
        width: 430px;
        margin: 0 auto;
        height: 250px;
        border: 1px solid crimson;
    }

    .bubbleItem {
        width: 100%;
    }

    .bubble {
        max-width: 655px;
        position: relative;
        line-height: 30px;
        padding-left: 10px;
        padding-top: 3px;
        padding-bottom: 3px;
        border-radius: 7px;
        margin-top: 15px;
        padding-right: 10px;
        display: inline-block;
    }

    .leftBubble {
        position: relative;
        margin-left: 25px;
        border: 1px solid #00b6b6;
        background-color: #f8fdfc;
    }

    .leftBubble .bottomLevel {
        position: absolute;
        top: 10px;
        left: -10px;
        border-top: 10px solid #00b6b6;
        border-left: 10px solid transparent;
    }

    .leftBubble .topLevel {
        position: absolute;
        top: 11px;
        left: -8px;
        border-top: 10px solid #f8fdfc;
        border-left: 10px solid transparent;
        z-index: 100;
    }

    .rightBubble {
        position: relative;
        margin-right: 26px;
        float: right;
        border: 1px solid #aaa;
    }

    .rightBubble .bottomLevel {
        position: absolute;
        bottom: 11px;
        right: -10px;
        border-bottom: 10px solid #aaa;
        border-right: 10px solid transparent;
    }

    .rightBubble .topLevel {
        position: absolute;
        bottom: 12px;
        right: -8px;
        border-bottom: 10px solid #fff;
        border-right: 10px solid transparent;
        z-index: 100;
    }

    .clearfix:after {
        visibility: hidden;
        display: block;
        font-size: 0;
        content: " ";
        clear: both;
        height: 0;
    }
</style>
</html>