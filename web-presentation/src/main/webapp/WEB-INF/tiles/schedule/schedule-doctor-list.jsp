<%@ include file="../common/taglib-includes.jsp" %>
<div class="container">
    <c:if test="${empty doctors}">
        <jsp:include page="../common/empty-list.jsp" />
    </c:if>
    <c:forEach items="${doctors}" var="doctorSection">
        <div class="row isotope">
            <c:forEach items="${doctorSection}" var="doctor">
                <div class="col s12 m4">
                    <div class="card">
                        <div class="card-image waves-effect waves-block waves-light">
                            <a href="<c:url value="/schedules/${doctor.doctorId}" />">
                                <img src="<c:url value="/images/${doctor.image.imageId}" />"
                                     class="responsive-img wp-post-image" alt="<c:out value="${doctor.user.name}" />">
                            </a>
                        </div>
                        <div class="card-content">
                            <p class="area"><a href="<c:url value="/schedules/${doctor.doctorId}" />"><c:out
                                    value="${doctor.user.name}"/></a></p>
                            <a href="<c:url value="/schedules/${doctor.doctorId}" />">
                                <span class="card-title activator brown-text text-darken-4"><c:out
                                        value="${doctor.user.name}"/></span></a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </c:forEach>
</div>