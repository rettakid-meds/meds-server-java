<%@include file="../common/taglib-includes.jsp" %>
<script>
    var practiceItemUrl = "<c:url value="/practices/{practiceId}" />";
</script>
<script src="<c:url value="/resources/script/practice/practice-script.js" />"></script>
<div class="container">
    <c:forEach items="${practices}" var="practiceSection">
        <div class="row isotope">
            <c:forEach items="${practiceSection}" var="practice">
                <div class="col s12 m4">
                    <div class="card">
                        <div class="card-image waves-effect waves-block waves-light">
                            <a href="<c:url value="/practices/${practice.practiceId}" />">
                                <img src="<c:url value="/images/${practice.image.imageId}" />" class="responsive-img wp-post-image" alt="Pikolo Espresso / Downtown, Montréal" title="Pikolo Espresso / Downtown, Montréal">    </a>
                        </div>
                        <div class="card-content">
                            <p class="area"><a href="http://adbeus.com/coffee/montreal/downtown/"><c:out value="${practice.address}" /></a></p>
                            <a href="http://adbeus.com/montreal/downtown/pikolo-espresso-downtown-montreal/" data-deeplink="adbeus://pikolo-espresso-downtown-montreal">
                                <span class="card-title activator brown-text text-darken-4"><c:out value="${practice.name}" /></span></a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </c:forEach>
</div>