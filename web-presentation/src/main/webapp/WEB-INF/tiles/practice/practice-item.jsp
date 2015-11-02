<%@include file="../common/taglib-includes.jsp" %>
<c:url var="practiceFormUrl" value="/practices"/>
<div class="parallax-container">
    <div class="parallax">
        <img src="<c:url value="/images/${practice.image.imageId}" />">
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col s12 m8">
            <h1><c:out value="${practice.name}"/></h1>
        </div>
        <div class="col s12 m4">
            <p><c:out value="${practice.phone}"/></p>

            <p><c:out value="${practice.email}"/></p>

            <p><c:out value="${practice.address}"/></p>

            <p>R<c:out value="${practice.fee}"/></p>
        </div>
    </div>
    <div class="row">
        <div class="col s12 m6">
            <p><c:out value="${practice.bio.data}"/></p>
        </div>
        <div class="col s12 m6">
            <jsp:include page="../trading-hours/trading-hour-table.jsp"/>
        </div>
    </div>
    <div class="row">
        <jsp:include page="../map/map-read.jsp">
            <jsp:param name="longitude" value="${practice.longitude}"/>
            <jsp:param name="latitude" value="${practice.latitude}"/>
            <jsp:param name="name" value="${practice.name}"/>
        </jsp:include>
    </div>
</div>

<!-- floating action button -->
<div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
    <a class="btn-floating btn-large">
        <i class="large material-icons">mode_edit</i>
    </a>
    <ul>
        <li><a class="btn-floating red"><i class="material-icons">delete</i></a></li>
        <li><a class="btn-floating green" href="<c:url value="/practices/${practice.practiceId}/form" />"><i class="material-icons">mode_edit</i></a></li>
    </ul>
</div>