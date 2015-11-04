/**
 * Created by Lwazi Prusent on 2015/10/27.
 */
var practiceItem = ".practice-item";
var practiceContent = "#practice-content";
$(document).ready(function(){

    $(practiceItem).click(function(){
        console.log("click");
        var practiceId = $(this).data("id");
        customAjaxCall({
            url: practiceItemUrl.replace("{practiceId}",practiceId),
            success: function(data){
                $(practiceContent).html(data);
            }
        });
    });

});