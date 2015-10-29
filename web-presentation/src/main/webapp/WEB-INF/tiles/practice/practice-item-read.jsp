<%@include file="../common/taglib-includes.jsp" %>
<c:url var="practiceFormUrl" value="/practices"/>
<div class="parallax-container">
    <div class="parallax">
        <img src="<c:url value="/images/${practice.image.imageId}" />">
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col s12 m4">
            <h1><c:out value="${practice.name}"/></h1>
            <p><c:out value="${practice.phone}"/></p>
            <p><c:out value="${practice.email}"/></p>
            <p><c:out value="${practice.address}"/></p>
            <p>R<c:out value="${practice.fee}"/></p>
        </div>
        <div class="col s12 m8">
            <div id="map"></div>
            <script src="https://maps.googleapis.com/maps/api/js?key=<c:out value="${mapsApiKey}"/>=loadMap"
                    async defer></script>
            <script>
                function loadMap() {
                    initMap(<c:out value="${practice.latitude}"/>, <c:out value="${practice.longitude}"/>);
                }
            </script>
        </div>
    </div>
    <div class="row">
        <div class="col s12 m8">
            <p><c:out value="${practice.bio.data}"/></p>
        </div>
        <div class="col s12 m4">
            <jsp:include page="../trading-hours/trading-hour-table.jsp" />
        </div>
    </div>
</div>