<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<li><a href="<c:url value="/practices" />" class="white-text">Practices</a></li>
<li><a href="<c:url value="/fields" />" class="white-text">Fields</a></li>
<sec:authorize access="isAnonymous()">
    <li><a href="<c:url value="/login" />" class="waves-effect waves-light btn">Login / Sing up</a></li>
</sec:authorize>