<%@include file="../common/taglib-includes.jsp" %>
<script>
    $(document).ready(function () {
        $("#practice").submit(function () {
            $("#imageFile").val($('.image-editor').cropit('export'));
        });

        $('.datepicker').pickadate({
            selectMonths: true, // Creates a dropdown to control month
            selectYears: 15 // Creates a dropdown of 15 years to control year
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
            <div class="col s12 m12">
                <div class="divider"></div>
                <h2>Practice info</h2>
            </div>
        </div>
        <div class="row">
            <div class="col s12 m6">
                <div class="row">
                    <div class="input-field col s12">
                        <form:input path="name" type="text" class="validate" cssErrorClass="validate invalid"/>
                        <label for="name" class="active">Name</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <form:input path="email" type="email" class="validate" cssErrorClass="validate invalid"/>
                        <label for="email" class="active">Email</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <form:input path="phone" type="tel" class="validate" cssErrorClass="validate invalid"/>
                        <label for="phone" class="active">Phone</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <form:input path="fee" type="text" class="validate" cssErrorClass="validate invalid"/>
                        <label for="fee" class="active">Fee</label>
                    </div>
                </div>
            </div>
            <div class="col s12 m6">
                <div class="row">
                    <div class="input-field col s12">
                        <form:textarea path="bio.data" type="text" class="materialize-textarea"
                                       cssErrorClass="materialize-textarea invalid"/>
                        <label for="bio.data" class="active">bio</label>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col s12 m12">
                <div class="divider"></div>
                <h2>Location</h2>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s12">
                <form:textarea path="address" type="text" class="materialize-textarea"
                               cssErrorClass="materialize-textarea invalid"/>
                <label for="address" class="active">Address</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s12 m6">
                <form:input path="longitude" type="text" class="validate" cssErrorClass="validate invalid"/>
                <label for="longitude" class="active">Longitude</label>
            </div>
            <div class="input-field col s12 m6">
                <form:input path="latitude" type="text" class="validate"  cssErrorClass="validate invalid"/>
                <label for="latitude" class="active">Latitude</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s12">
                <jsp:include page="../map/map-write.jsp">
                    <jsp:param name="name" value="${practice.name}"/>
                    <jsp:param name="latitude" value="${practice.latitude}"/>
                    <jsp:param name="longitude" value="${practice.longitude}"/>
                    <jsp:param name="mapsApiWebKey" value="${mapsApiWebKey}"/>
                    <jsp:param name="mapsApiServiceKey" value="${mapsApiServiceKey}"/>
                </jsp:include>
            </div>
        </div>
        <div class="row">
            <div class="col s12 m12">
                <div class="divider"></div>
                <h2>Trading hours</h2>
            </div>
        </div>
        <div class="row">
            <div class="col s12 m12">
                <jsp:include page="../trading-hours/trading-hour-table.jsp">
                    <jsp:param name="write" value="true"/>
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