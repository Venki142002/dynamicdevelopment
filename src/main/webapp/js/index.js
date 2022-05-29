document.getElementById('heading').setAttribute("class", "container-fluid p-3 bg-primary  text-left");
function changeColor() {
    document.body.style.background = "black";
    document.body.style.color = "white";
    document.getElementById('heading').setAttribute("class", "container-fluid p-3  text-left");
    document.getElementById('tableconent').style.color="white";
}
function changeColor2() {
    document.body.style.background = "white";
    document.getElementById('tableconent').style.color="black";
    document.body.style.color = "black";
    document.getElementById('heading').setAttribute("class", "container-fluid p-3 bg-primary text-left");
}



