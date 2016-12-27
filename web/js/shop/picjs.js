/**
 * Created by dell on 2016/4/25.
 */
var file_count=0;
$(document).ready(function(){
    $(".file_item input[type='file']").bind("change",addFile);
    $(".file_item .file_head .cancel").bind("click",removeFile);
});

function addFile () {
    var file_items=$(".file_item input[type='file']");
    var file=this.files[0];
    var imageType = /image.*/;
    var count=0;
    for(var i=0; i< file_items.length;i++){
        var file_item = file_items[i];
        if(file_item.files.length>0) {
            if ((file_item.files[0].name == file.name)&&(file_item.files[0].size == file.size)) {
                count++;
            }
        }
    }
    if(file.type.match(imageType)&&count==1){
        var $file_item=$(this).parent();
        var reader = new FileReader();
        reader.onload = (function(aDiv){
            return function(e){
                aDiv.css("background","url("+e.target.result+") no-repeat center");
                aDiv.css("background-size","cover");
                var file_foot = aDiv.children(".file_foot");
                if(file_foot.length==0){
                    $(aDiv).children("input[type='file']").attr("name","Picture");
                    file_count++;
                    aDiv.append("<div class='file_head'> <span class='cancel'></span> </div>");
                    aDiv.append("<div class='file_foot'> <span></span> </div>");
                    aDiv.children(".file_head").children(" .cancel").bind("click",removeFile);
                    var after_div=document.createElement("div");
                    $(after_div).addClass("file_item");
                    $(after_div).append("<input type='file'>");
                    $(after_div).children("input[type='file']").bind("change",addFile);
                    aDiv.after(after_div);
                }
                aDiv.children(".file_foot").children("span").text(file.name);
            };
        })($file_item);
        reader.readAsDataURL(file);
    }
}
function removeFile () {
    $(this).parent().parent().remove();
}
