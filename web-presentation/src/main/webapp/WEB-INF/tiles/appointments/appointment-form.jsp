<%@include file="../common/taglib-includes.jsp" %>
<%@ page import="za.co.rettakid.meds.common.MedsConstantes" %>
<c:set var="timeFormat" value="<%=MedsConstantes.TIME_FORMAT%>"/>
<c:set var="dateFormat" value="<%=MedsConstantes.DATE_FORMAT%>"/>
<c:set var="dateTimeFormat" value="<%=MedsConstantes.DATE_TIME_FORMAT%>"/>
<c:set var="dayFormat" value="<%=MedsConstantes.DAY_OF_WEEK_FORMAT%>"/>

<c:if test="${not empty medsErrorToasts}">
    <script>
        <c:forEach var="toastText" items="${medsToasts}" >initToast("<c:out value="${toastText}" />");
        </c:forEach>
        <c:forEach var="toastText" items="${medsErrorToasts}" varStatus="loop" >initErrorToast("<c:out value="${toastText}" />", ${loop.index});
        </c:forEach>
    </script>
</c:if>
<script>
    $(document).ready(function () {
        $("#appointmentForm").submit(function (event) {
            event.preventDefault();
            customAjaxCall({
                url: $(this).attr("action"),
                data: $(this).serialize(),
                type: $(this).attr("method"),
                invalid: function (data) {
                    $("#appointment-modal").html(data);
                    console.log("invalid face");
                },
                valid: function (data) {
                    window.location.assign("<c:url value="/appointments/doctors/${appointment.doctor.doctorId}?success=true" />");
                    console.log("valid face");
                }
            })
        });
    });
</script>

<c:url var="appointmentUrl" value="/appointments"/>
<form:form id="appointmentForm" action="${appointmentUrl}" commandName="appointment" method="POST">
    <div class="modal-content">
        <div class="row">
            <div class="col s12">
                <form:hidden path="doctor.doctorId"/>
                <form:hidden path="user.userId"/>
                <form:hidden path="expectedFrm"/>
                <form:hidden path="expectedTo"/>

                <input id="appointment-expected-from-time" type="hidden"/>
                <h4>Book appointment with <c:out value="${appointment.doctor.user.name}"/></h4>
                <fmt:formatDate var="expectedFrm" pattern="${timeFormat}" value="${appointment.expectedFrm}"/>
                <fmt:formatDate var="expectedTo" pattern="${timeFormat}" value="${appointment.expectedTo}"/>
                <p id="appointment-time-display"><c:out value="${expectedFrm}"/> - <c:out value="${expectedTo}"/></p>

                <div class="row">
                    <div class="input-field col s12">
                        <form:textarea path="note.data" type="text" class="materialize-textarea"
                                       cssErrorClass="materialize-textarea invalid"/>
                        <label for="note.data" class="active">Notes</label>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button type="submit" class="waves-effect waves-green btn-flat">Schedule Appointment</button>
    </div>
</form:form>