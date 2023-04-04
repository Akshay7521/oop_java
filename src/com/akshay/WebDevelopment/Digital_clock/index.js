const hourEl = document.getElementById("Hour")
const minutesEl=document.getElementById("Minutes")
const secondsEl=document.getElementById("Seconds")
const ampmEl=document.getElementById("AMPM")
function UpdateClock(){
    let h = new Date().getHours()
    let m = new Date().getMinutes()
    let s = new Date().getSeconds()
    let AMPM = "AM"
    if(h > 12){
        h=h-12
        ampm = "PM"
    }
    h = h < 10 ? "0" + h : h;    
    m = m < 10 ? "0" + m : m;
    s = s < 10 ? "0" + s : s;
    
    hourEl.innerText = h;
    minutesEl.innerText = m;
    secondsEl.innerText = s;
    ampmEl.innerText = ampm;
    setTimeout(()=>{
        UpdateClock()

    }, 1000)
}
UpdateClock();
