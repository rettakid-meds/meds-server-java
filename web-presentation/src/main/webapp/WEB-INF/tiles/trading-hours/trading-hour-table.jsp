<%@include file="../common/taglib-includes.jsp" %>
<%@ page import="za.co.rettakid.meds.common.MedsConstantes" %>
<c:set var="timeFormat" value="<%=MedsConstantes.TIME_FORMAT%>"/>
<table class="striped">
    <fmt:formatDate var="mondayFrom" pattern="${timeFormat}" value="${tradingDay.monday.effFrm}"/>
    <fmt:formatDate var="mondayTo" pattern="${timeFormat}" value="${tradingDay.monday.effTo}"/>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Monday"/>
        <jsp:param name="dayName" value="monday"/>
        <jsp:param name="write" value="${param.write}"/>
        <jsp:param name="effFrm" value="${mondayFrom}"/>
        <jsp:param name="effTo" value="${mondayTo}"/>
        <jsp:param name="open" value="${tradingDay.monday.open}"/>
    </jsp:include>

    <fmt:formatDate var="tuesdayFrom" pattern="${timeFormat}" value="${tradingDay.tuesday.effFrm}"/>
    <fmt:formatDate var="tuesdayTo" pattern="${timeFormat}" value="${tradingDay.tuesday.effTo}"/>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Tuesday"/>
        <jsp:param name="dayName" value="tuesday"/>
        <jsp:param name="write" value="${param.write}"/>
        <jsp:param name="effFrm" value="${tuesdayFrom}"/>
        <jsp:param name="effTo" value="${tuesdayTo}"/>
        <jsp:param name="open" value="${tradingDay.tuesday.open}"/>
    </jsp:include>

    <fmt:formatDate var="wednesdayFrom" pattern="${timeFormat}" value="${tradingDay.wednesday.effFrm}"/>
    <fmt:formatDate var="wednesdayTo" pattern="${timeFormat}" value="${tradingDay.wednesday.effTo}"/>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Wednesday"/>
        <jsp:param name="dayName" value="wednesday"/>
        <jsp:param name="write" value="${param.write}"/>
        <jsp:param name="effFrm" value="${wednesdayFrom}"/>
        <jsp:param name="effTo" value="${wednesdayTo}"/>
        <jsp:param name="open" value="${tradingDay.wednesday.open}"/>
    </jsp:include>

    <fmt:formatDate var="thursdayFrom" pattern="${timeFormat}" value="${tradingDay.thursday.effFrm}"/>
    <fmt:formatDate var="thursdayTo" pattern="${timeFormat}" value="${tradingDay.thursday.effTo}"/>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Thursday"/>
        <jsp:param name="dayName" value="thursday"/>
        <jsp:param name="write" value="${param.write}"/>
        <jsp:param name="effFrm" value="${thursdayFrom}"/>
        <jsp:param name="effTo" value="${thursdayTo}"/>
        <jsp:param name="open" value="${tradingDay.thursday.open}"/>
    </jsp:include>

    <fmt:formatDate var="fridayFrom" pattern="${timeFormat}" value="${tradingDay.friday.effFrm}"/>
    <fmt:formatDate var="fridayTo" pattern="${timeFormat}" value="${tradingDay.friday.effTo}"/>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Friday"/>
        <jsp:param name="dayName" value="friday"/>
        <jsp:param name="write" value="${param.write}"/>
        <jsp:param name="effFrm" value="${fridayFrom}"/>
        <jsp:param name="effTo" value="${fridayTo}"/>
        <jsp:param name="open" value="${tradingDay.friday.open}"/>
    </jsp:include>

    <fmt:formatDate var="saturdayFrom" pattern="${timeFormat}" value="${tradingDay.saturday.effFrm}"/>
    <fmt:formatDate var="saturdayTo" pattern="${timeFormat}" value="${tradingDay.saturday.effTo}"/>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Saturday"/>
        <jsp:param name="dayName" value="saturday"/>
        <jsp:param name="write" value="${param.write}"/>
        <jsp:param name="effFrm" value="${saturdayFrom}"/>
        <jsp:param name="effTo" value="${saturdayTo}"/>
        <jsp:param name="open" value="${tradingDay.saturday.open}"/>
    </jsp:include>

    <fmt:formatDate var="sundayFrom" pattern="${timeFormat}" value="${tradingDay.sunday.effFrm}"/>
    <fmt:formatDate var="sundayTo" pattern="${timeFormat}" value="${tradingDay.sunday.effTo}"/>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Sunday"/>
        <jsp:param name="dayName" value="sunday"/>
        <jsp:param name="write" value="${param.write}"/>
        <jsp:param name="effFrm" value="${sundayFrom}"/>
        <jsp:param name="effTo" value="${sundayTo}"/>
        <jsp:param name="open" value="${tradingDay.sunday.open}"/>
    </jsp:include>

    <fmt:formatDate var="pubicHolidayFrom" pattern="${timeFormat}" value="${tradingDay.pubicHoliday.effFrm}"/>
    <fmt:formatDate var="pubicHolidayTo" pattern="${timeFormat}" value="${tradingDay.pubicHoliday.effTo}"/>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Public Holiday"/>
        <jsp:param name="dayName" value="pubicHoliday"/>
        <jsp:param name="write" value="${param.write}"/>
        <jsp:param name="effFrm" value="${pubicHolidayFrom}"/>
        <jsp:param name="effTo" value="${pubicHolidayTo}"/>
        <jsp:param name="open" value="${tradingDay.pubicHoliday.open}"/>
    </jsp:include>
</table>
