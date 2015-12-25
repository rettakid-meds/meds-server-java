<%@include file="../common/taglib-includes.jsp" %>
<%@ page import="za.co.rettakid.meds.common.MedsConstantes" %>
<c:set var="dateFormat" value="<%=MedsConstantes.DATE_FORMAT%>"/>
<c:set var="dateTimeFormat" value="<%=MedsConstantes.DATE_TIME_FORMAT%>"/>
<div class="container">
    <h1>${appointment.user.name} ${appointment.user.surname}</h1>

    <div class="row">
        <div class="col s12 m9">
            <div class="row">
                <div class="col s12">
                    <c:url var="appointmentFormUrl" value="/schedules/${appointment.appointmentId}"/>
                    <form:form commandName="appointment" method="post" action="${appointmentFormUrl}">
                        <div class="card">
                            <div class="card-content">
                                <div class="card-title">
                                    <span class="blue-text">Current Appointment</span>
                                </div>
                                <br>
                                <form:hidden path="appointmentId"/>
                                <div class="row">
                                    <div class="input-field col s12 m6">
                                        <fmt:formatDate var="expectedFrm" pattern="${dateTimeFormat}" value="${appointment.expectedFrm}"/>
                                        <form:input path="expectedFrm" value="${expectedFrm}" type="text" class="validate" cssErrorClass="validate invalid"/>
                                        <label for="expectedFrm" class="active">Appointment From</label>
                                    </div>
                                    <div class="input-field col s12 m6">
                                        <fmt:formatDate var="expectedTo" pattern="${dateTimeFormat}" value="${appointment.expectedTo}"/>
                                        <form:input path="expectedTo" value="${expectedTo}" type="text" class="validate" cssErrorClass="validate invalid"/>
                                        <label for="expectedFrm" class="active">Appointment To</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <form:input path="note.data" type="text" class="materialize-textarea" cssErrorClass="materialize-textarea invalid"/>
                                        <label for="expectedFrm" class="active">Note</label>
                                    </div>
                                </div>
                            </div>
                            <div class="card-action">
                                <button class="btn">Submit</button>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
            <div class="row">
                <div class="col s12">
                    <div class="card">
                        <div class="card-content">
                            <div class="card-title">
                                <span class="green-text">Patient</span>
                            </div>
                            <c:url var="userFormUrl" value="/user"/>
                            <form:form commandName="user" method="post" action="${userFormUrl}">
                                <form:hidden path="userId"/>
                                <div class="row">
                                    <div class="input-field col s12 m6">
                                        <form:input path="name" type="text" class="validate" cssErrorClass="validate invalid"/>
                                        <label for="name" class="active">Name</label>
                                    </div>
                                    <div class="input-field col s12 m6">
                                        <form:input path="surname" type="text" class="validate" cssErrorClass="validate invalid"/>
                                        <label for="surname" class="active">Surname</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <form:input path="email" type="text" class="validate" cssErrorClass="validate invalid"/>
                                        <label for="email" class="active">Email</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <form:input path="phone" type="text" class="validate" cssErrorClass="validate invalid"/>
                                        <label for="phone" class="active">Phone</label>
                                    </div>
                                </div>
                            </form:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col s12 m3">
            <div class="card">
                <div class="card-content">
                    <div class="card-title">
                        <span class="red-text">Past Appointment</span>
                    </div>
                    <c:if test="${empty pastAppointments}">
                        <p>No past appointments for this user</p>
                    </c:if>
                    <div class="collection">
                        <c:forEach var="pastAppointment" items="${pastAppointments}">
                            <fmt:formatDate var="expectedFrm" value="${pastAppointment.expectedFrm}" pattern="${dateFormat}"/>
                            <a href="<c:url value="/schedules/${pastAppointment.appointmentId}" />" class="collection-item"><p><c:out
                                    value="${expectedFrm}"/></p></a>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>