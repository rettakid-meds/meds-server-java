<%@include file="../common/taglib-includes.jsp" %>
<c:choose>
    <c:when test="${empty param.name || empty param.latitude || param.longitude}">
        <c:set var="mapName" value="new" />
        <c:set var="mapLat" value="-26" />
        <c:set var="mapLong" value="28" />
    </c:when>
    <c:otherwise>
        <c:set var="mapName" value="${param.name}" />
        <c:set var="mapLat" value="${param.latitude}" />
        <c:set var="mapLong" value="${param.longitude}" />
    </c:otherwise>
</c:choose>

<div id="map"></div>
<script src="https://maps.googleapis.com/maps/api/js?key=<c:out value="${param.mapsApiKey}" />&callback=loadMap"
        async defer></script>
<%--<script src="https://maps.googleapis.com/maps/api/js?key=<c:out value="${mapsApiKey}"/>=loadMap"
        async defer></script>--%>
<script>
    function loadMap() {
        console.log("made it");
        initWriteMap('<c:out value="${mapName}"/>', <c:out value="${mapLat}"/>, <c:out value="${mapLong}"/>, function (latLng) {
            $("#longitude").val(latLng.lng());
            $("#latitude").val(latLng.lat());
            customAjaxCall({
                url: "https://maps.googleapis.com/maps/api/geocode/json?latlng=" + latLng.lat() + "," + latLng.lng() + "&key=<c:out value="${param.mapsApiServiceKey}" />",
                dataType: 'json',
                type: 'GET',
                success: function (data) {
                    $.each(data.results, function (index, result) {
                        if (index == 0) {
                            $("#address").html(result.formatted_address);
                        }
                    });
                },
                error: function (xhr, ajaxOptions, thrownError) {
                    console.log(xhr.status);
                    console.log(thrownError);
                }
            });
        });
    }
</script>