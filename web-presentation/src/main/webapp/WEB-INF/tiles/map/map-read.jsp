<%@include file="../common/taglib-includes.jsp" %>
<div id="map"></div>
<script src="https://maps.googleapis.com/maps/api/js?key=<c:out value="${param.mapsApiKey}" />&callback=loadMap"
        async defer></script>
<%--<script src="https://maps.googleapis.com/maps/api/js?key=<c:out value="${mapsApiKey}"/>=loadMap"
        async defer></script>--%>
<script>
    function loadMap() {
        console.log("made it");
        initReadMap('<c:out value="${param.name}"/>',<c:out value="${param.latitude}"/>, <c:out value="${param.longitude}"/>);
    }
</script>