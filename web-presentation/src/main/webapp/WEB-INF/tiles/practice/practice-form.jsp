<%@include file="../common/taglib-includes.jsp" %>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/ThirdParty/cropit/cropit.css" />"/>
<script type="text/javascript" src="<c:url value="/resources/ThirdParty/cropit/cropit.js" />"></script>
<script>
    $(document).ready(function () {
        $("#practice").submit(function () {
            $("#imageFile").val($('.image-editor').cropit('export'));
            customAjaxCall({
                url: $(this).attr("action"),
                method: "POST",
                data: $(this).serialize(),
                success: function (data) {
                    $('#practiceContent').html(data);
                }
            });
        });
    });
</script>
<c:url var="practiceFormUrl" value="/practices/${practice.practiceId}"/>
<form:form commandName="practice" method="post" action="${practiceFormUrl}">
    <div id="practiceContent" class="modal-content">
        <form:hidden path="practiceId"/>
        <div class="row">
            <div class="col s12 m6">
                <jsp:include page="../common/image-crop.jsp">
                    <jsp:param name="cropitUrl" value="/images/${practice.image.imageId}"/>
                </jsp:include>
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
    </div>
    <div class="modal-footer">
        <button class="waves-effect waves-green btn-flat" type="submit">Submit</button>
    </div>
</form:form>