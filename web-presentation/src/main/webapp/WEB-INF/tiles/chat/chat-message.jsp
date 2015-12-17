<%@include file="../common/taglib-includes.jsp" %>
<%@ page import="za.co.rettakid.meds.common.MedsConstantes" %>
<c:set var="timeFormat" value="<%=MedsConstantes.TIME_FORMAT%>"/>

<c:choose>
    <c:when test="${param.owner == true}">
        <c:set var="cardColor" value="teal"/>
        <c:set var="textColor" value="white"/>
    </c:when>
    <c:otherwise>
        <c:set var="cardColor" value="teal"/>
        <c:set var="textColor" value="white"/>
    </c:otherwise>
</c:choose>

<div class="row">
    <div class="card-panel teal">
        <span class="white-text"><c:out value="${param.message}"/></span>
    </div>
</div>
