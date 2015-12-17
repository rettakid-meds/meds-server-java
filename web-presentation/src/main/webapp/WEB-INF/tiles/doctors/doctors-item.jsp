<%@include file="../common/taglib-includes.jsp" %>
<%@ page import="za.co.rettakid.meds.common.MedsConstantes" %>
<%@ page import="za.co.rettakid.meds.common.enums.PermissionEnum" %>
<c:set var="timeFormat" value="<%=MedsConstantes.TIME_FORMAT%>"/>
<c:set var="DOCTOR_ITEM_UPDATE" value="<%=PermissionEnum.DOCTOR_ITEM_UPDATE%>"/>
<c:set var="DOCTOR_ITEM_UPDATE_id" value="<%=PermissionEnum.DOCTOR_ITEM_UPDATE%>"/>
<c:set var="DOCTOR_ITEM_UPDATE_id" value="${DOCTOR_ITEM_UPDATE_id}_${practice.practiceId}"/>
<c:set var="DOCTOR_ITEM_DELETE_id" value="<%=PermissionEnum.DOCTOR_ITEM_DELETE%>"/>
<c:set var="DOCTOR_ITEM_DELETE_id" value="${DOCTOR_ITEM_DELETE_id}_${practice.practiceId}"/>
<c:set var="DOCTOR_OVERRIDE" value="<%=PermissionEnum.DOCTOR_OVERRIDE%>"/>

<div class="parallax-container">
    <div class="parallax">
        <img src="<c:url value="/images/${doctor.image.imageId}" />">
    </div>
</div>
<div class="container">
    <h1><c:out value="${doctor.user.name}"/></h1>
    <div class="row">
        <div class="col s12 m6">
            <div class="card">
                <div class="card-content">
                    <span class="card-title green-text">Contact Info</span>
                    <p><c:out value="${doctor.user.phone}"/></p>
                    <p><c:out value="${doctor.user.email}"/></p>
                </div>
            </div>
            <div class="card">
                <div class="card-content">
                    <span class="card-title blue-text">About Us</span>
                    <p><c:out value="${doctor.bio.data}"/></p>
                </div>
            </div>
        </div>
        <div class="col s12 m6">
            <div class="card">
                <div class="card-content">
                    <span class="card-title orange-text">Trading hours</span>
                    <jsp:include page="../trading-hours/trading-hour-table.jsp"/>
                </div>
            </div>
        </div>
    </div>
    <%--<div class="row">
        <div class="card">
            <div class="card-content">
                <span class="card-title black-text">Today's Acclivity</span><br>
                <c:forEach var="scheduleDiv" items="${schedule}">
                    <div class="col s3 m1">
                        <div class="row">
                            <div class="col s12">
                                <fmt:formatDate var="effFrm" pattern="${timeFormat}" value="${scheduleDiv[0].effFrm}"/>
                                <c:out value="${effFrm}"/>
                            </div>
                        </div>
                        <div class="row">
                            <c:forEach var="scheduleItem" items="${scheduleDiv}" varStatus="loop">
                                <div class="col s12 m3 padding-none">
                                    <c:choose>
                                        <c:when test="${scheduleItem.appointmentAvailability.available}">
                                            <div class="green" style="height: 50px">
                                                <fmt:formatDate var="effFrm" pattern="${timeFormat}"
                                                                value="${scheduleItem.effFrm}"/>
                                                <span class="hide-on-med-and-up center-align"><c:out
                                                        value="${effFrm}"/></span>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="red" style="height: 50px"></div>
                                        </c:otherwise>
                                    </c:choose>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>--%>
</div>


<sec:authorize access="hasAnyAuthority('${DOCTOR_ITEM_UPDATE_id}','${DOCTOR_OVERRIDE}')">
    <!-- floating action button -->
    <div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
        <a class="btn-floating btn-large">
            <i class="large material-icons">mode_edit</i>
        </a>
        <ul>
            <sec:authorize access="hasAnyAuthority('${DOCTOR_ITEM_DELETE_id}','${DOCTOR_OVERRIDE}')">
                <li>
                    <a class="btn-floating red">
                        <i class="material-icons">delete</i>
                    </a>
                </li>
            </sec:authorize>
            <sec:authorize access="hasAnyAuthority('${DOCTOR_ITEM_UPDATE_id}','${DOCTOR_OVERRIDE}')">
                <li>
                    <a class="btn-floating green" href="<c:url value="/doctor/${doctor.doctorId}/form" />">
                        <i class="material-icons">mode_edit</i>
                    </a>
                </li>
            </sec:authorize>
        </ul>
    </div>
</sec:authorize>

<sec:authorize access="!hasAnyAuthority('${DOCTOR_ITEM_UPDATE_id}','${DOCTOR_OVERRIDE}')">
    <div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
        <a href="<c:url value="/appointments/doctors/${doctor.doctorId}" />" class="btn-floating btn-large">
            <i class="large material-icons">schedule</i>
        </a>
    </div>
</sec:authorize>