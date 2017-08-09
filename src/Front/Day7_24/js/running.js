/**
 * Created by Administrator on 2017/7/24.
 */
window.onload = function () {
    var arr = new Array('RUNNER0.JPG','RUNNER1.JPG','RUNNER2.JPG','RUNNER3.JPG','RUNNER4.JPG','RUNNER5.JPG');
    var startBtn = document.getElementById("start");
    var stopBtn = document.getElementById("stop");
    var index = 0;
    var img = document.getElementsByTagName("img")[0];
    var speed = document.getElementById("speed");
    var objc;
    function run() {
        index++;
        if(index >= arr.length){
            index = 0;
        }
        img.src="../img/" + arr[index];
    }
    speed.onchange=function () {
        var sd = this.options[this.selectedIndex].value;
        clearInterval(objc);
        objc = setInterval(function () {
            run();
        },sd)
    }
    startBtn.onclick = function () {
        objc = setInterval(function () {
            run();
        },500);
    }
    stopBtn.onclick=function () {
       clearInterval(objc);
    }
}