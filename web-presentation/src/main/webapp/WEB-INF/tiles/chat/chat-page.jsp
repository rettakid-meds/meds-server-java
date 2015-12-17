<%@include file="../common/taglib-includes.jsp" %>

<script>
    var stompClient = null;

    function connect() {
        var socket = new SockJS("<c:url value="/notification" />");
        stompClient = Stomp.over(socket);
        stompClient.connect({}, function (frame) {
            console.log('connected: ' + frame);
            stompClient.subscribe('/queue/chat', function (response) {
                console.log('subscribe 1: ' + response.success);
            });


            stompClient.subscribe('/topic/ws', function(response){
                console.log('subscribe all: ' + response.success);
            });
            stompClient.subscribe('/notif/user', function(response){
                console.log('subscriben user: ' + response.success);
            });
            stompClient.subscribe('/notif/new', function(response){
                console.log('subscriben new user: ' + response.success);
            });
        })
    }

    function disconnect() {
        if (stompClient != null) {
            stompClient.disconnect();
        }
        console.log("Disconnected");
    }

    function sendToAll() {
        stompClient.send("/app/ws", {}, JSON.stringify({'name': "look"}));
    }

    function sendToUser() {
        stompClient.send("/app/chat", {}, JSON.stringify({'name': "look"}));
    }

    function sendToAllOld() {
        stompClient.send("/app/ws", {}, JSON.stringify({ 'name': "look" }));
    }

    function sendToUserOld() {
        stompClient.send("/app/notif", {}, JSON.stringify({ 'name': "look" }));
    }

    connect();

</script>

<div class="container">
    <div class="row">
        <div id="message-list" class="grey full-height full-width" style="min-height: 300px">

        </div>
    </div>
    <div class="row">
        <div class="card-panel">
            <div class="row">
                <div class="input-field col s10">
                    <textarea id="message-textarea" class="materialize-textarea"></textarea>
                </div>
                <div class="col s2">
                    <button class="btn-floating btn-large waves-effect waves-light red" onclick="sendToUser()"><i
                            class="material-icons">add</i>
                    </button>
                    <button class="btn-floating btn-large waves-effect waves-light red" onclick="sendToAllOld()"><i
                            class="material-icons">edit</i>
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>