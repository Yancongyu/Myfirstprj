/**
 * Created by Administrator on 2017/7/25.
 */
window.onload = function () {
    var provincearr = new Array("河北","吉林","辽宁");
    var citys = new Array();
    citys[0] = new Array("秦皇岛","沧州","邯郸");
    citys[1] = new Array("长春","吉林","通化");
    citys[2] = new Array("大连","沈阳","葫芦岛");
    var province = document.getElementById("province");
    var city = document.getElementById("city");
    initFun(province);
    
    province.onchange = function () {
        var index = province.options[province.selectedIndex].value;
        city.options.length = 1;
        for(var i = 0 ; i < citys[index].length ; i++){
            var p = new Option();
            p.value = i;
            p.text = citys[index][i];
            city.appendChild(p);
        }
    }
    
    function initFun(province) {
        for(var i = 0 ; i < provincearr.length ; i++){
            var p = new Option();
            p.value = i;
            p.text = provincearr[i];
            province.appendChild(p);
        }
    }
}