var successString = "<SUCCESS>d8087287-ae6f-46ad-9761-66c4f165cf5d</SUCCESS>";

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

    if (ajaxObj.error == null) {
        ajaxObj.error = function (data, status, error) {
            console.error("There was an error", status, error);
        }
    }

    if (ajaxObj.timeout == null) {
        ajaxObj.timeout = 30000;
    }

    if (ajaxObj.statusCode == null) {
        ajaxObj.statusCode = {
            200: function () {
                if (ajaxObj.valid != null) {
                    ajaxObj.success = ajaxObj.valid;
                }
                console.log("valid");
                ajaxObj.success();
            },
            203: function (data) {
                ajaxObj.invalid(data);
            },
            412: function (data) {
                ajaxObj.invalid(data);
            },
            404: function () {
                window.location.assign("/meds/presentation/error/404");
            },
            403: function () {
                window.location.assign("/meds/presentation/error/403");
            },
            500: function () {
                window.location.assign("/meds/presentation/error/500");
            }
        };
    }

    $.ajax(ajaxObj);
}

function initToast(toastText) {
    $(document).ready(function () {
        createToast(toastText);
    });
}

function initErrorToast(toastText, index) {
    $(document).ready(function () {
        setTimeout(function () {
            createErrorToast(toastText, index);
        }, index * 1000)
    });
}

function createToast(toastText) {
    if (toastText != null && toastText != "") {
        Materialize.toast(toastText, 4000);
    }
}

function createErrorToast(toastText, index) {
    if (toastText != null && toastText != "") {
        Materialize.toast(toastText, 8000, "red darken-4");
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

var mapMarkers = [];
function initReadMultiMap(latitude, longitude, markers, findLocation) {
    var myLatLng = {lat: latitude, lng: longitude};

    // Create a map object and specify the DOM element for display.
    var map = new google.maps.Map(document.getElementById('map'), {
        center: myLatLng,
        scrollwheel: false,
        zoom: 12
    });

    // Create a marker and set its position.
    var marker, i;
    for (i = 0; i < markers.length; i++) {
        marker = new google.maps.Marker({
            map: map,
            position: markers[i].markerLatLng,
            title: markers[i].markerName,
            icon: markers[i].markerIcon,
            label: markers[i].markerName
        });

        mapMarkers[i] = marker;

        google.maps.event.addListener(marker, 'click', (function (marker, i) {
            return function () {
                window.open(markers[i].markerUrl);
            }
        })(marker, i));
    }

    if (findLocation)   {
        // Try HTML5 geolocation.
        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(function (position) {
                var pos = {
                    lat: position.coords.latitude,
                    lng: position.coords.longitude
                };
                map.setCenter(pos);
                var marker = new google.maps.Marker({
                    map: map,
                    position: pos,
                    title: "My Location"
                });
            }, function () {
                handleLocationError(true, infoWindow, map.getCenter());
            });
        } else {
            // Browser doesn't support Geolocation
            handleLocationError(false, infoWindow, map.getCenter());
        }

        function handleLocationError(browserHasGeolocation, infoWindow, pos) {
            infoWindow.setPosition(pos);
            infoWindow.setContent(browserHasGeolocation ?
                'Error: The Geolocation service failed.' :
                'Error: Your browser doesn\'t support geolocation.');
        }
    }
}

function initWriteMap(name, latitude, longitude, callback) {
    var myLatLng = {lat: latitude, lng: longitude};

    // Create a map object and specify the DOM element for display.
    var map = new google.maps.Map(document.getElementById('map'), {
        center: myLatLng,
        scrollwheel: false,
        zoom: 12,
        disableDoubleClickZoom: true
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
    map.addListener('dblclick', function (e) {
        marker.setPosition(e.latLng);
        marker.setAnimation(google.maps.Animation.BOUNCE);
        callback(e.latLng);
    });

}