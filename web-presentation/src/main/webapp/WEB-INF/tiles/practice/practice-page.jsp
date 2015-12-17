<%@include file="../common/taglib-includes.jsp" %>
<%@ page import="za.co.rettakid.meds.common.enums.PermissionEnum" %>
<c:set var="PRACTICE_ITEM_ADD" value="<%=PermissionEnum.PRACTICE_ITEM_ADD%>"/>
<div class="container">
    <c:forEach items="${practices}" var="practiceSection">
        <div class="row isotope">
            <c:forEach items="${practiceSection}" var="practice">
                <div class="col s12 m4">
                    <div class="card">
                        <div class="card-image waves-effect waves-block waves-light">
                            <a href="<c:url value="/practices/${practice.practiceId}" />">
                                <img src="<c:url value="/images/${practice.image.imageId}" />" class="responsive-img wp-post-image" alt="Pikolo Espresso / Downtown, Montr�al" title="Pikolo Espresso / Downtown, Montr�al">    </a>
                        </div>
                        <div class="card-content">
                            <p class="area"><c:out value="${practice.address}" /></p>
                            <a href="<c:url value="/practices/${practice.practiceId}" />">
                                <span class="card-title activator brown-text text-darken-4"><c:out value="${practice.name}" /></span></a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </c:forEach>
</div>

<sec:authorize access="hasAuthority('${PRACTICE_ITEM_ADD}')">
    <!-- floating action button -->
    <div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
        <a href="<c:url value="/practices/new/form" />" class="btn-floating btn-large">
            <i class="large material-icons">add</i>
        </a>
    </div>
</sec:authorize>