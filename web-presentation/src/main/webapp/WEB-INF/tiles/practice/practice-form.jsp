<%@include file="../common/taglib-includes.jsp" %>
<c:url var="practiceFormUrl" value="/practices"/>
<form:form commandName="practice" method="post" action="${practiceFormUrl}">
    <form:hidden path="practiceId"/>
    <div class="row">
        <div class="col s12 m6">
            <img src="<c:url value="/images/${practice.image.imageId}" />" class="full-width">
            <div class="file-field input-field">
                <div class="btn">
                    <span>File</span>
                    <input type="file">
                </div>
                <div class="file-path-wrapper">
                    <input class="file-path validate" type="text">
                </div>
            </div>
        </div>
        <div class="col s12 m6">
            <div class="row">
                <div class="input-field col s12">
                    <form:input path="name" type="text" class="validate"/>
                    <label for="name" class="active">Name</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s12">
                    <form:input path="email" type="email" class="validate"/>
                    <label for="email" class="active">Email</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s12">
                    <form:input path="phone" type="tel" class="validate"/>
                    <label for="phone" class="active">Phone</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s12">
                    <form:input path="fee" type="text" class="validate"/>
                    <label for="fee" class="active">Fee</label>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <form:textarea path="address" type="text" class="materialize-textarea"/>
            <label for="address" class="active">Address</label>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <form:textarea path="bio.data" type="text" class="materialize-textarea"/>
            <label for="bio" class="active">bio</label>
        </div>
    </div>
</form:form>