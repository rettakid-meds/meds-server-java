<%@include file="../common/taglib-includes.jsp" %>
<c:url var="practiceFormUrl" value="/practices"/>
<form:form commandName="practice" method="post" action="${practiceFormUrl}" cssClass="white padding margin">

    <div class="row">
        <form:hidden path="practiceId"/>
        <div class="input-field col s12">
            <form:input path="name" type="text" class="validate"/>
            <label for="name" class="active">Name</label>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <form:input path="email" type="email" class="validate"/>
            <label for="name" class="active">Email</label>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <form:input path="phone" type="tel" class="validate"/>
            <label for="name" class="active">Phone</label>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <form:input path="fee" type="text" class="validate"/>
            <label for="name" class="active">Phone</label>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <form:textarea path="address" type="text" class="materialize-textarea"/>
            <label for="name" class="active">Address</label>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <form:textarea path="bio" type="text" class="materialize-textarea"/>
            <label for="name" class="active">Address</label>
        </div>
    </div>
</form:form>