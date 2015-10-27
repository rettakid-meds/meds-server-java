<%@include file="../common/taglib-includes.jsp" %>
<div class="row">
    <div class="col s4">
        <div class="collection">
            <c:forEach items="${fields}" var="field">
                <a href="#!" class="collection-item"><c:out value="${field.name}"/></a>
            </c:forEach>
        </div>
    </div>
    <div class="col s8">

    </div>
</div>