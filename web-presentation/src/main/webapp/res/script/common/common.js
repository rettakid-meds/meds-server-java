$(document).ready(function () {
    $('.modal-trigger').leanModal();
});

(function ($) {
    $(function () {

        $('.button-collapse').sideNav();
        $('.parallax').parallax();

    }); // end of document ready
})(jQuery); // end of jQuery name space

function customAjaxCall(ajaxObj) {
    $.ajax(ajaxObj);
}

function initToast(toastText) {
    $(document).ready(function () {
        createToast(toastText);
    });
}

function createToast(toastText) {
    if (toastText != null && toastText != "") {
        Materialize.toast(toastText, 4000);
    }
}

/*map*/
function initReadMap(name, latitude, longitude) {
    var myLatLng = {lat: latitude, lng: longitude};

    // Create a map object and specify the DOM element for display.
    var map = new google.maps.Map(document.getElementById('map'), {
        center: myLatLng,
        scrollwheel: false,
        zoom: 12
    });

    // Create a marker and set its position.
    var marker = new google.maps.Marker({
        map: map,
        position: myLatLng,
        title: name
    });
}

function initWriteMap(name, latitude, longitude,callback) {
    var myLatLng = {lat: latitude, lng: longitude};

    // Create a map object and specify the DOM element for display.
    var map = new google.maps.Map(document.getElementById('map'), {
        center: myLatLng,
        scrollwheel: false,
        zoom: 12
    });

    // Create a marker and set its position.
    var marker = new google.maps.Marker({
        map: map,
        position: myLatLng,
        title: name,
        draggable: true,
        animation: google.maps.Animation.DROP
    });

    //adds right click listener
    map.addListener('rightclick', function(e) {
        marker.setPosition(e.latLng);
        marker.setAnimation(google.maps.Animation.BOUNCE);
        callback(e.latLng);
    });

}