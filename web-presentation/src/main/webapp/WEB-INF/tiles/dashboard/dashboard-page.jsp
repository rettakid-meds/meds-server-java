<%@include file="../common/taglib-includes.jsp" %>
<script>
    function hideMarker(field) {
        for (var i = 0; i < ${fn:length(practices)}; i++) {
            if (field == markers[i].markerFieldId) {
                mapMarkers[i].setVisible(true);
            } else {
                mapMarkers[i].setVisible(false);
            }
        }
    }
</script>
<div class="row">
    <div class="col s12">`
        <div id="map" class="large"></div>
        <script src="https://maps.googleapis.com/maps/api/js?key=<c:out value="${mapsApiWebKey}" />&callback=loadMap"
                async defer></script>
    </div>
    <script>
        var markers = [];
        function loadMap() {
            <c:forEach var="practice" items="${practices}" varStatus="loop">
            markers[${loop.index}] = {
                markerLatLng: {
                    lat: ${practice.practice.latitude},
                    lng: ${practice.practice.longitude}
                },
                markerName: '${practice.practice.name}',
                markerIcon: '<c:url value="/fields/${practice.field.fieldId}/image"/>',
                markerUrl: '<c:url value="/practices/${practice.practice.practiceId}"/>',
                markerFieldId: ${practice.field.fieldId}
            };
            </c:forEach>

            initReadMultiMap(-26, 28, markers,true);

        }

    </script>
</div>

<div class="container">
    <div class="row">
        <div class="col s12">
            <c:forEach var="field" items="${fields}">
                <div class="chip">
                    <a href="#" onclick="return false">
                        <img src="<c:url value="/fields/${field.fieldId}/image"/>" alt="Field"
                             onclick="hideMarker(${field.fieldId})">
                    </a>
                    <c:out value="${field.name}"/>
                </div>
            </c:forEach>
        </div>
    </div>
</div>