<%@ include file="../common/taglib-includes.jsp" %>
<%@ page import="za.co.rettakid.meds.common.enums.PermissionEnum" %>
<c:set var="DOCTOR_ITEM_ADD" value="<%=PermissionEnum.DOCTOR_ITEM_ADD%>"/>
<div class="container">
    <c:forEach items="${doctors}" var="doctorSection">
        <div class="row isotope">
            <c:forEach items="${doctorSection}" var="doctor">
                <div class="col s12 m4">
                    <div class="card">
                        <div class="card-image waves-effect waves-block waves-light">
                            <a href="<c:url value="/doctors/${doctor.doctorId}" />">
                                <img src="<c:url value="/images/${doctor.image.imageId}" />"
                                     class="responsive-img wp-post-image" alt="<c:out value="${doctor.user.name}" />">
                            </a>
                        </div>
                        <div class="card-content">
                            <p class="area"><a href="<c:url value="/doctors/${doctor.doctorId}" />"><c:out
                                    value="${doctor.user.name}"/></a></p>
                            <a href="<c:url value="/doctors/${doctor.doctorId}" />">
                                <span class="card-title activator brown-text text-darken-4"><c:out
                                        value="${doctor.user.name}"/></span></a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </c:forEach>
</div>

<sec:authorize access="hasAuthority('${DOCTOR_ITEM_ADD}')">
    <!-- floating action button -->
    <div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
        <a href="<c:url value="/doctor/new/form" />" class="btn-floating btn-large">
            <i class="large material-icons">add</i>
        </a>
    </div>
</sec:authorize>

<button type="button" class="btn" onclick="sendToAll()">Send To All</button>
<button type="button" class="btn" onclick="sendToUser()">Send To User</button>