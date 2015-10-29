$(document).ready(function(){
    $('.modal-trigger').leanModal();
});

(function($){
  $(function(){

    $('.button-collapse').sideNav();
    $('.parallax').parallax();

  }); // end of document ready
})(jQuery); // end of jQuery name space

function customAjaxCall(ajaxObj) {
  $.ajax(ajaxObj);
}

/*map*/
function initMap(name,latitude,longitude) {
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