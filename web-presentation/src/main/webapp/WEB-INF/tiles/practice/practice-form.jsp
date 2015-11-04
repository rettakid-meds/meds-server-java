<%@include file="../common/taglib-includes.jsp" %>
<script>
    $(document).ready(function () {
        $("#practice").submit(function () {
            $("#imageFile").val($('.image-editor').cropit('export'));
        });
    });
</script>
<div class="container">
    <c:url var="practiceFormUrl" value="/practices/${practice.practiceId}"/>
    <form:form commandName="practice" method="post" action="${practiceFormUrl}">
        <form:hidden path="practiceId"/>
        <div class="row">
            <div class="col s12">
                <jsp:include page="../common/image-crop.jsp">
                    <jsp:param name="cropitUrl" value="/images/${practice.image.imageId}"/>
                </jsp:include>
            </div>
        </div>
        <div class="row">
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
            <div class="col s12 m6">
                <div class="row">
                    <div class="input-field col s12">
                        <form:textarea path="bio.data" type="text" class="materialize-textarea"/>
                        <label for="bio.data" class="active">bio</label>
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
            <div class="input-field col s12 m6">
                <form:input path="longitude" type="text" class="validate"/>
                <label for="longitude" class="active">Longitude</label>
            </div>
            <div class="input-field col s12 m6">
                <form:input path="latitude" type="text" class="validate"/>
                <label for="latitude" class="active">Latitude</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s12 m6">
                <jsp:include page="../map/map-write.jsp">
                    <jsp:param name="name" value="${practice.name}"/>
                    <jsp:param name="latitude" value="${practice.latitude}"/>
                    <jsp:param name="longitude" value="${practice.longitude}"/>
                </jsp:include>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s12 m6">
                <button class="waves-effect waves-green btn" type="submit">Submit</button>
            </div>
        </div>
    </form:form>
</div>