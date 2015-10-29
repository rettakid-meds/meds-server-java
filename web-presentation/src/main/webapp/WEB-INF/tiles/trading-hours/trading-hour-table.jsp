<%@include file="../common/taglib-includes.jsp" %>
<table>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Monday" />
        <jsp:param name="effFrm" value="${tradingDay.monday.effFrm}" />
        <jsp:param name="effTo" value="${tradingDay.monday.effTo}" />
        <jsp:param name="open" value="${tradingDay.monday.open}" />
    </jsp:include>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Truesday" />
        <jsp:param name="effFrm" value="${tradingDay.tuesday.effFrm}" />
        <jsp:param name="effTo" value="${tradingDay.tuesday.effTo}" />
        <jsp:param name="open" value="${tradingDay.tuesday.open}" />
    </jsp:include>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Wednesday" />
        <jsp:param name="effFrm" value="${tradingDay.wednesday.effFrm}" />
        <jsp:param name="effTo" value="${tradingDay.wednesday.effTo}" />
        <jsp:param name="open" value="${tradingDay.wednesday.open}" />
    </jsp:include>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Thursday" />
        <jsp:param name="effFrm" value="${tradingDay.thursday.effFrm}" />
        <jsp:param name="effTo" value="${tradingDay.thursday.effTo}" />
        <jsp:param name="open" value="${tradingDay.thursday.open}" />
    </jsp:include>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Friday" />
        <jsp:param name="effFrm" value="${tradingDay.friday.effFrm}" />
        <jsp:param name="effTo" value="${tradingDay.friday.effTo}" />
        <jsp:param name="open" value="${tradingDay.friday.open}" />
    </jsp:include>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Saturday" />
        <jsp:param name="effFrm" value="${tradingDay.saturday.effFrm}" />
        <jsp:param name="effTo" value="${tradingDay.saturday.effTo}" />
        <jsp:param name="open" value="${tradingDay.saturday.open}" />
    </jsp:include>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Sunday" />
        <jsp:param name="effFrm" value="${tradingDay.sunday.effFrm}" />
        <jsp:param name="effTo" value="${tradingDay.sunday.effTo}" />
        <jsp:param name="open" value="${tradingDay.sunday.open}" />
    </jsp:include>
    <jsp:include page="../trading-hours/trading-hour-line.jsp">
        <jsp:param name="day" value="Public Holiday" />
        <jsp:param name="effFrm" value="${tradingDay.pubicHoliday.effFrm}" />
        <jsp:param name="effTo" value="${tradingDay.pubicHoliday.effTo}" />
        <jsp:param name="open" value="${tradingDay.pubicHoliday.open}" />
    </jsp:include>
</table>
