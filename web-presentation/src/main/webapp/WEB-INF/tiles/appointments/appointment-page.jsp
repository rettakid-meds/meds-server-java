<%@include file="../common/taglib-includes.jsp" %>
<%@ page import="za.co.rettakid.meds.common.MedsConstantes" %>
<c:set var="timeFormat" value="<%=MedsConstantes.TIME_FORMAT%>"/>
<c:set var="dateFormat" value="<%=MedsConstantes.DATE_FORMAT%>"/>
<c:set var="dateTimeFormat" value="<%=MedsConstantes.DATE_TIME_FORMAT%>"/>
<c:set var="dayFormat" value="<%=MedsConstantes.DAY_OF_WEEK_FORMAT%>"/>

<script>
    $(document).ready(function () {
        $(".appointment-btn").click(function (event) {
            event.preventDefault();
            var dateTimeFrom = $(this).data("datetimefrom");
            $("#appointment-modal").openModal();
            customAjaxCall({
                url: "<c:url value="/appointments/doctors/new/form?expectedFrom={expectedFrom}&doctorId=${doctorId}" />".replace("{expectedFrom}",dateTimeFrom),
                type: "GET",
                success:  function(data)    {
                    $("#appointment-modal").html(data);
                }
            })
        });
    });

</script>

<div class="container">
    <div class="row">
        <c:forEach var="daySchedule" items="${weekSchedule}">
            <div class="col s12 m3">
                <fmt:formatDate var="date" pattern="${dateFormat}" value="${daySchedule[0].effFrm}"/>
                <fmt:formatDate var="day" pattern="${dayFormat}" value="${daySchedule[0].effFrm}"/>

                <h3 class="center-align"><c:out value="${day}"/></h3>

                <p class="center-align"><c:out value="${date}"/></p>
                <c:forEach var="scheduleItem" items="${daySchedule}">
                    <c:if test="${scheduleItem.appointmentAvailability.available}">
                        <div class="card">
                            <div class="card-content">
                                <fmt:formatDate var="effFrm" pattern="${timeFormat}" value="${scheduleItem.effFrm}"/>
                                <fmt:formatDate var="effTo" pattern="${timeFormat}" value="${scheduleItem.effTo}"/>
                                <p class="center-align"><c:out value="${effFrm}"/> - <c:out value="${effTo}"/></p>
                            </div>
                            <div class="card-action">
                                <fmt:formatDate var="date" pattern="${dateFormat}" value="${scheduleItem.effFrm}"/>
                                <fmt:formatDate var="timeFrom" pattern="${timeFormat}" value="${scheduleItem.effFrm}"/>
                                <fmt:formatDate var="timeTo" pattern="${timeFormat}" value="${scheduleItem.effTo}"/>
                                <fmt:formatDate var="dateTimeFrom" pattern="${dateTimeFormat}"
                                                value="${scheduleItem.effFrm}"/>
                                <fmt:formatDate var="dateTimeTo" pattern="${dateTimeFormat}"
                                                value="${scheduleItem.effTo}"/>
                                <a href="#" class="center-align appointment-btn"
                                   data-date="<c:out value="${date}" />"
                                   data-timefrom="<c:out value="${timeFrom}"/>"
                                   data-timeto="<c:out value="${timeTo}"/>"
                                   data-datetimefrom="<c:out value="${dateTimeFrom}"/>"
                                   data-datetimeto="<c:out value="${dateTimeTo}"/>">Create Appointment</a>
                            </div>
                        </div>
                    </c:if>
                </c:forEach>
            </div>
        </c:forEach>
    </div>
</div>

<div id="appointment-modal" class="modal modal-fixed-footer">
</div>