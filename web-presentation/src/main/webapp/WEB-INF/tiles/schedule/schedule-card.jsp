<%@include file="../common/taglib-includes.jsp" %>
<%@ page import="za.co.rettakid.meds.common.MedsConstantes" %>
<c:set var="timeFormat" value="<%=MedsConstantes.TIME_FORMAT%>"/>
<c:set var="dateFormat" value="<%=MedsConstantes.DATE_FORMAT%>"/>
<div class="card blue lighten-2">
    <div class="card-content">
        <fmt:formatDate var="date" pattern="${dateFormat}" value="${scheduleItem.effFrm}"/>
        <fmt:formatDate var="timeFrom" pattern="${timeFormat}" value="${scheduleItem.effFrm}"/>
        <h5 id="schedule-modal-appointment-date-init" class="center-align">date</h5>
        <p id="schedule-modal-appointment-time-init" class="center-align">from - to</p>
    </div>
</div>