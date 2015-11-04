<%@include file="../common/taglib-includes.jsp" %>
<link type="text/css" rel="stylesheet" href="<c:url value="/res/ThirdParty/cropit/cropit.css" />"/>
<script type="text/javascript" src="<c:url value="/res/ThirdParty/cropit/cropit.js" />"></script>
<img class="full-width image-editor-preview" src="<c:url value="${param.cropitUrl}" />" />
<input id="imageFile" name="imageFile" type="hidden" />
<div class="image-editor">
    <div class="image-editor-core">
        <div class="cropit-image-preview-container">
            <div class="cropit-image-preview"></div>
        </div>
        <input type="range" class="cropit-image-zoom-input">
        <button class="export">Export</button>
    </div>
    <div class="file-field input-field">
        <div class="btn">
            <span>File</span>
            <input type="file" class="cropit-image-input">
        </div>
        <div class="file-path-wrapper">
            <input class="file-path validate" type="text">
        </div>
    </div>
</div>