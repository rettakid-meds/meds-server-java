/**
 * Created by Lwazi Prusent on 2015/11/01.
 */
$(function () {
    $('.image-editor').cropit({
        exportZoom: 1.25,
        imageBackground: true,
        imageBackgroundBorderWidth: 20
    });

    $('.export').click(function () {
        var imageData = $('.image-editor').cropit('export');
        window.open(imageData);
    });

    $('.cropit-image-input').on("change", function () {
        $('.image-editor-preview').hide();
        $('.image-editor-core').show();
    });

});