<%@include file="../common/taglib-includes.jsp" %>
<%@ page import="za.co.rettakid.meds.common.MedsConstantes" %>
<c:set var="timeFormat" value="<%=MedsConstantes.TIME_FORMAT%>"/>
<c:set var="dateFormat" value="<%=MedsConstantes.DATE_FORMAT%>"/>
<c:set var="dateTimeFormat" value="<%=MedsConstantes.DATE_TIME_FORMAT%>"/>
<c:set var="dayFormat" value="<%=MedsConstantes.DAY_OF_WEEK_FORMAT%>"/>

<div class="card blue lighten-2">
    <div class="card-content">
        <fmt:formatDate var="effFromTime" pattern="${timeFormat}" value="${effFrm}"/>
        <fmt:formatDate var="effToTime" pattern="${timeFormat}" value="${effTo}"/>
        <fmt:formatDate var="effToDateTime" pattern="${dateTimeFormat}" value="${effTo}"/>
        <p id="appointment-modal-appointment-time-init" class="center-align"><c:out value="${effFromTime}" /> - <c:out value="${effToTime}" /></p>
        <input id="expectedTo" name="expectedTo" type="hidden" value="<c:out value="${effToDateTime}"/>" />
        <input id="appointment-expected-to-time" type="hidden" value="<c:out value="${effToTime}"/>" />
    </div>
</div>
<a id="appointment-view-add-btn" class="btn-floating" onclick="addAppointment()"><i class="material-icons">add</i></a>