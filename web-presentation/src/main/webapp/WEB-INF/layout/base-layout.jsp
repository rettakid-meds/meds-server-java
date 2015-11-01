<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@include file="../tiles/common/taglib-includes.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
    <title>Meds</title>
    <title></title>
    <!--Import css-->
    <link type="text/css" rel="stylesheet" href="<c:url value="/resources/ThirdParty/font/material/icons/icon.css" />" />
    <link type="text/css" rel="stylesheet" href="<c:url value='/resources/ThirdParty/materialize/css/materialize.min.css'/>" media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="<c:url value='/resources/style/common.css'/>"/>

    <!--Import script-->
    <script type="text/javascript" src="<c:url value='/resources/ThirdParty/jquery/jquery-2.1.1.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/ThirdParty/materialize/js/materialize.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/ThirdParty/cropit/jquery.cropit.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/script/common/common.js'/>"></script>

    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</head>
<body class="grey lighten-5">

<c:if test="${not empty toastText}">
    <script>
        initToast("<c:out value="${toastText}" />");
    </script>
</c:if>

<tiles:insertAttribute name="nav"/>

<tiles:insertAttribute name="body"/>

<tiles:insertAttribute name="footer"/>

</body>
</html>
