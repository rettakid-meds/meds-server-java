<%@include file="../common/taglib-includes.jsp" %>
<%@ page import="za.co.rettakid.meds.common.MedsConstantes" %>
<c:set var="timeFormat" value="<%=MedsConstantes.TIME_FORMAT%>"/>
<c:set var="dateFormat" value="<%=MedsConstantes.DATE_FORMAT%>"/>
<c:set var="dateTimeFormat" value="<%=MedsConstantes.DATE_TIME_FORMAT%>"/>
<c:set var="dayFormat" value="<%=MedsConstantes.DAY_OF_WEEK_FORMAT%>"/>
<script>
    $(document).ready(function () {
        $('.datepicker').pickadate({
            selectMonths: true, // Creates a dropdown to control month
            selectYears: 15 // Creates a dropdown of 15 years to control year
        });

        $(".schedule-item-edit").click(function(){
            var appointmentId = $(this).data("id");
            window.location.assign("<c:url value="/schedules/{appointmentId}" />".replace("{appointmentId}",appointmentId));
        });

        $(".schedule-item-new").click(function(){
            var expectedFrm = $(this).data("frm");
            var expectedTo = $(this).data("to");
            window.location.assign("<c:url value="/schedules/new?doctorId=${doctor.doctorId}&expectedFrm={expectedFrm}&expectedTo={expectedTo}" />".replace("{expectedFrm}",expectedFrm).replace("{expectedTo}",expectedTo));
        });

    });
</script>
<style>
    .schedule-item:hover {
        border: 2px solid black;
    }
</style>
<div class="container">
    <input type="date" class="datepicker">
    <br>

    <div class="row">
        <table class="centered bordered">
            <c:forEach var="scheduleHour" items="${schedule}">
                <tr>
                    <fmt:formatDate var="hourStart" pattern="${timeFormat}" value="${scheduleHour[0].effFrm}"/>
                    <td class="width-20">
                        <c:out value="${hourStart}"/>
                    </td>
                    <c:forEach var="scheduleItem" items="${scheduleHour}">
                        <c:choose>
                            <c:when test="${scheduleItem.appointmentAvailability.available}">
                                <td class="schedule-item schedule-item-new tooltipped grey lighten-3" data-position="bottom"
                                    data-delay="50" data-tooltip="availible for booking"
                                    data-frm="${scheduleItem.effFrm.time}"
                                    data-to="${scheduleItem.effTo.time}" >

                                </td>
                            </c:when>
                            <c:when test="${scheduleItem.appointmentAvailability.appointment == null}">
                                <td class="schedule-item schedule-item-new tooltipped grey lighten-2 width-40" data-position="bottom"
                                    data-delay="50" data-tooltip="off trading hours"
                                    data-frm="${scheduleItem.effFrm.time}"
                                    data-to="${scheduleItem.effTo.time}" >

                                </td>
                            </c:when>
                            <c:otherwise>
                                <td class="schedule-item schedule-item-edit tooltipped blue lighten-3 width-40"
                                    data-position="bottom" data-delay="50"
                                    data-id="<c:out value="${scheduleItem.appointmentAvailability.appointment.appointmentId}"/>"
                                    data-tooltip="booked for ${scheduleItem.appointmentAvailability.appointment.user.name} ${scheduleItem.appointmentAvailability.appointment.user.surname}">
                                    <c:out value="${scheduleItem.appointmentAvailability.appointment.user.name} ${scheduleItem.appointmentAvailability.appointment.user.surname}"/>
                                </td>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </tr>
            </c:forEach>
        </table>
    </div>

    <div id="schedule-modal" class="modal modal-fixed-footer">
        <div class="modal-content">
            <div class="row">
                <div class="col s12 m8">
                    <h4>Modal Header</h4>

                    <p>A bunch of text</p>
                </div>
                <div class="col s12 m4">
                    <div class="card blue lighten-2">
                        <div class="card-content">
                            <h5 id="schedule-modal-appointment-date-init" class="center-align">date</h5>

                            <p id="schedule-modal-appointment-time-init" class="center-align">from - to</p>
                        </div>
                    </div>
                    <a class="btn-floating"><i class="material-icons">add</i></a>
                </div>
            </div>
        </div>
        <div class="modal-footer">
            <a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat ">Schedule Appointment</a>
        </div>
    </div>
</div>