<%@include file="../common/taglib-includes.jsp" %>
<%@ page import="za.co.rettakid.meds.common.MedsConstantes" %>
<c:set var="timeFormat" value="<%=MedsConstantes.TIME_FORMAT%>"/>
<c:set var="dateFormat" value="<%=MedsConstantes.DATE_FORMAT%>"/>
<c:set var="dateTimeFormat" value="<%=MedsConstantes.DATE_TIME_FORMAT%>"/>
<c:set var="dayFormat" value="<%=MedsConstantes.DAY_OF_WEEK_FORMAT%>"/>

<script>
    $(document).ready(function(){
        $("#appointmentForm").submit(function(event){
            event.preventDefault();
            customAjaxCall({
                url: $(this).attr("action"),
                data: $(this).serialize(),
                type: $(this).attr("method"),
                invalid: function(data) {
                    $("#appointment-modal").html(data);
                    console.log("invalid face");
                },
                valid: function(data){
                    window.location.assign("<c:url value="/appointments/doctors/${appointment.doctor.doctorId}?success=true" />");
                    console.log("valid face");
                }
            })
        });
    });
</script>

<c:url var="appointmentUrl" value="/appointments" />
<form:form id="appointmentForm" action="${appointmentUrl}" commandName="appointment" method="POST">
    <div class="modal-content">
        <div class="row">
            <div class="col s12 m8">
                <form:hidden id="doctorId" path="doctor.doctorId"/>
                <form:hidden path="user.userId"/>
                <form:hidden id="expectedFrm" path="expectedFrm"/>
                <input id="appointment-expected-from-time" type="hidden" />
                <h4>Book appointment with <c:out value="${appointment.doctor.user.name}" /></h4>
                <p id="appointment-time-display">00:00 - 01:00</p>

                <div class="row">
                    <div class="input-field col s12">
                        <form:textarea path="note.data" type="text" class="materialize-textarea"
                                       cssErrorClass="materialize-textarea invalid"/>
                        <label for="note.data" class="active">Notes</label>
                    </div>
                </div>
            </div>
            <div id="appointment-view-content" class="col s12 m4">
                <div class="card blue lighten-2">
                    <div class="card-content">
                        <h5 id="appointment-modal-appointment-date-init" class="center-align">date</h5>
                        <p id="appointment-modal-appointment-time-init" class="center-align">from - to</p>
                        <form:hidden id="expectedTo" path="expectedTo"/>
                        <input id="appointment-expected-to-time" type="hidden" value="<c:out value="${effToTime}"/>" />
                    </div>
                </div>
                <a id="appointment-view-add-btn" class="btn-floating" onclick="addAppointment()"><i class="material-icons">add</i></a>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button type="submit" class="waves-effect waves-green btn-flat">Schedule Appointment</button>
    </div>
</form:form>