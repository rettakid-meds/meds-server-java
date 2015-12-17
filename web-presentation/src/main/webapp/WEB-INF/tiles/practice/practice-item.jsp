<%@include file="../common/taglib-includes.jsp" %>
<%@ page import="za.co.rettakid.meds.common.enums.PermissionEnum" %>
<c:set var="PRACTICE_ITEM_UPDATE" value="<%=PermissionEnum.PRACTICE_ITEM_UPDATE%>"/>
<c:set var="PRACTICE_ITEM_UPDATE_id" value="<%=PermissionEnum.PRACTICE_ITEM_UPDATE%>"/>
<c:set var="PRACTICE_ITEM_UPDATE_id" value="${PRACTICE_ITEM_UPDATE_id}_${practice.practiceId}"/>
<c:set var="PRACTICE_ITEM_DELETE_id" value="<%=PermissionEnum.PRACTICE_ITEM_DELETE%>"/>
<c:set var="PRACTICE_ITEM_DELETE_id" value="${PRACTICE_ITEM_DELETE_id}_${practice.practiceId}"/>
<c:set var="PRACTICE_OVERRIDE" value="<%=PermissionEnum.PRACTICE_OVERRIDE%>"/>

<div class="parallax-container">
    <div class="parallax">
        <img src="<c:url value="/images/${practice.image.imageId}" />">
    </div>
</div>
<div class="container">
    <h1><c:out value="${practice.name}"/></h1>

    <div class="row">
        <div class="col s12 m6">
            <div class="card">
                <div class="card-content">
                    <span class="card-title green-text">Contact Info</span>

                    <p><c:out value="${practice.phone}"/></p>

                    <p><c:out value="${practice.email}"/></p>

                    <p><c:out value="${practice.address}"/></p>

                    <p>R<c:out value="${practice.fee}"/></p>
                </div>
            </div>
            <div class="card">
                <div class="card-content">
                    <span class="card-title blue-text">About Us</span>

                    <p><c:out value="${practice.bio.data}"/></p>
                </div>
            </div>
            <c:if test="${not empty doctorPractice}">
                <div class="card">
                    <div class="card-content">
                        <span class="card-title red-text">Doctors</span>
                        <ul class="collection">
                            <c:forEach var="doctorPractice" items="${doctorPractices}">
                                <li class="collection-item avatar">
                                    <img src="<c:url value="/images/${doctorPractice.doctor.image.imageId}" />"
                                         class="circle">
                        <span class="title"><c:out
                                value="${doctorPractice.doctor.user.name} ${doctorPractice.doctor.user.surname}"/></span>
                                    <br>
                                    <c:forEach var="doctorField"
                                               items="${doctorPractice.doctor.doctorFieldDoctors.doctorFieldList}">
                                        <div class="chip">
                                            <img src="<c:url value="/fields/${doctorField.field.fieldId}/image"/>"
                                                 alt="Field"/>
                                            <c:out value="${doctorField.field.name}"/>
                                        </div>
                                    </c:forEach>
                                </li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>
            </c:if>
        </div>
        <div class="col s12 m6">
            <div class="card">
                <div class="card-content">
                    <span class="card-title orange-text">Trading hours</span>
                    <jsp:include page="../trading-hours/trading-hour-table.jsp"/>
                </div>
            </div>
        </div>
    </div>
    <div class="divider"></div>
    <div class="row">
        <jsp:include page="../map/map-read.jsp">
            <jsp:param name="longitude" value="${practice.longitude}"/>
            <jsp:param name="latitude" value="${practice.latitude}"/>
            <jsp:param name="name" value="${practice.name}"/>
            <jsp:param name="mapsApiWebKey" value="${mapsApiWebKey}"/>
        </jsp:include>
    </div>

</div>

<sec:authorize access="hasAnyAuthority('${PRACTICE_ITEM_UPDATE_id}','${PRACTICE_OVERRIDE}')">
    <!-- floating action button -->
    <div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
        <a class="btn-floating btn-large">
            <i class="large material-icons">mode_edit</i>
        </a>
        <ul>
            <sec:authorize access="hasAnyAuthority('${PRACTICE_ITEM_DELETE_id}','${PRACTICE_OVERRIDE}')">
                <li>
                    <a class="btn-floating red">
                        <i class="material-icons">delete</i>
                    </a>
                </li>
            </sec:authorize>
            <sec:authorize access="hasAnyAuthority('${PRACTICE_ITEM_UPDATE_id}','${PRACTICE_OVERRIDE}')">
                <li>
                    <a class="btn-floating green" href="<c:url value="/practices/${practice.practiceId}/form" />">
                        <i class="material-icons">mode_edit</i>
                    </a>
                </li>
            </sec:authorize>
        </ul>
    </div>
</sec:authorize>