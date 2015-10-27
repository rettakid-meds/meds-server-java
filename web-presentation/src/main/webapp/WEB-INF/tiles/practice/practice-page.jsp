<%@include file="../common/taglib-includes.jsp" %>
<script>
    var practiceItemUrl = "<c:url value="/practices/{practiceId}" />";
</script>
<script src="<c:url value="/resources/script/practice/practice-script.js" />"></script>
<div class="row">
    <div class="col s12 m3">
        <div class="collection">
            <c:forEach items="${practices}" var="practice">
                <a href="#!" class="practice-item collection-item"
                   data-id="<c:out value="${practice.practiceId}" />"><c:out value="${practice.name}"/></a>
            </c:forEach>
        </div>
    </div>
    <div id="practice-content" class="col s12 m9">
    </div>
</div>