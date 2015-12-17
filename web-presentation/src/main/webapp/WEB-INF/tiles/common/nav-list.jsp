<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page import="za.co.rettakid.meds.common.enums.PermissionEnum" %>

<c:set var="PRACTICE_LIST_READ" value="<%=PermissionEnum.PRACTICE_LIST_READ%>"/>
<c:set var="DOCTOR_LIST_READ" value="<%=PermissionEnum.DOCTOR_LIST_READ%>"/>
<c:set var="DOCTOR_ITEM_UPDATE" value="<%=PermissionEnum.DOCTOR_ITEM_UPDATE%>"/>

<sec:authorize access="isAuthenticated()">
    <li><a href="<c:url value="/dashboard" />" class="<c:out value="${param.textColor}"/>-text">Dashboard</a></li>
</sec:authorize>
<sec:authorize access="hasAuthority('${DOCTOR_LIST_READ}')">
    <li><a href="<c:url value="/doctors" />" class="<c:out value="${param.textColor}"/>-text">Doctors</a></li>
</sec:authorize>
<sec:authorize access="hasAuthority('${PRACTICE_LIST_READ}')">
    <li><a href="<c:url value="/practices" />" class="<c:out value="${param.textColor}"/>-text">Practices</a></li>
</sec:authorize>
<sec:authorize access="hasAuthority('${DOCTOR_ITEM_UPDATE}')">
    <li><a href="<c:url value="/schedules" />" class="<c:out value="${param.textColor}"/>-text">Schedule</a></li>
</sec:authorize>
<sec:authorize access="isAnonymous()">
    <li><a href="<c:url value="/login" />" class="waves-effect waves-light btn">Login / Sing up</a></li>
</sec:authorize>