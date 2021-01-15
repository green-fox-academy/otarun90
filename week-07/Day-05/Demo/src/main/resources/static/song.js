function play() {
    var myAudio = document.getElementById("myAudio");
    return myAudio.paused ? myAudio.play() : myAudio.pause();
}