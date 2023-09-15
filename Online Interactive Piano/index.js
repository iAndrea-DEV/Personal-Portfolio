var keys = document.querySelectorAll("key");

//Key press with mouse click
// for(var key of keys){
//     key.addEventListener("click", function(){
//         makeSound(this.innerHTML)
//         //buttonAnimation(this.innerHtml)
//     });
// }


//Button press
var keys = document.querySelectorAll(".key");

    for(var key of keys) {
        key.addEventListener("click", function() {
            makeSound(this.innerText);
            buttonAnimation(this.innerText);
            
        });
}
//Keyboard press

document.addEventListener("keydown", function(event) {
    makeSound(event.key)
    buttonAnimation(event.key)
});

function makeSound(keyValue) {
    switch(keyValue) {
        case "Z":
            var audio = new Audio("./notes/A0.mp3")
            audio.play();
            break;
        case "X":
            var audio = new Audio("./notes/B0.mp3")
            audio.play();
            break;
        case "C":
            var audio = new Audio("./notes/C1.mp3")
            audio.play();
            break;
        case "V":
            var audio = new Audio("./notes/D1.mp3")
            audio.play();
            break;
        case "B":
            var audio = new Audio("./notes/E1.mp3")
            audio.play();
            break;
        case "N":
            var audio = new Audio("./notes/F1.mp3")
            audio.play();
            break;
        case "M":
            var audio = new Audio("./notes/G1.mp3")
            audio.play();
            break;
        case "z":
            var audio = new Audio("./notes/A1.mp3")
            audio.play();
            break;
        case "x":
            var audio = new Audio("./notes/B1.mp3")
            audio.play();
            break;
        case "c":
            var audio = new Audio("./notes/C2.mp3")
            audio.play();
            break;
        case "v":
            var audio = new Audio("./notes/D2.mp3")
            audio.play();
            break;
        case "b":
            var audio = new Audio("./notes/E2.mp3")
            audio.play();
            break;
        case "n":
            var audio = new Audio("./notes/F2.mp3")
            audio.play();
            break;
        case "m":
            var audio = new Audio("./notes/G2.mp3")
            audio.play();
            break;
        case "A":
            var audio = new Audio("./notes/A2.mp3")
            audio.play();
            break;
        case "S":
            var audio = new Audio("./notes/B2.mp3")
            audio.play();
            break;
        case "D":
            var audio = new Audio("./notes/C3.mp3")
            audio.play();
            break;
        case "F":
            var audio = new Audio("./notes/D3.mp3")
            audio.play();
            break;
        case "G":
            var audio = new Audio("./notes/E3.mp3")
            audio.play();
            break;
        case "H":
            var audio = new Audio("./notes/F3.mp3")
            audio.play();
            break;
        case "J":
            var audio = new Audio("./notes/G3.mp3")
            audio.play();
            break;
        case "K":
            var audio = new Audio("./notes/A3.mp3")
            audio.play();
            break;
        case "L":
            var audio = new Audio("./notes/B3.mp3")
            audio.play();
            break;
        case "a":
            var audio = new Audio("./notes/C4.mp3")
            audio.play();
            break;
        case "s":
            var audio = new Audio("./notes/D4.mp3")
            audio.play();
            break;
        case "d":
            var audio = new Audio("./notes/E4.mp3")
            audio.play();
            break;
        case "f":
            var audio = new Audio("./notes/F4.mp3")
            audio.play();
            break;
        case "g":
            var audio = new Audio("./notes/G4.mp3")
            audio.play();
            break;
        case "h":
            var audio = new Audio("./notes/A4.mp3")
            audio.play();
            break;
        case "j":
            var audio = new Audio("./notes/B4.mp3")
            audio.play();
            break;
        case "k":
            var audio = new Audio("./notes/C5.mp3")
            audio.play();
            break;
        case "l":
            var audio = new Audio("./notes/D5.mp3")
            audio.play();
            break;
        case "Q":
            var audio = new Audio("./notes/E5.mp3")
            audio.play();
            break;
        case "W":
            var audio = new Audio("./notes/F5.mp3")
            audio.play();
            break;
        case "E":
            var audio = new Audio("./notes/G5.mp3")
            audio.play();
            break;
        case "R":
            var audio = new Audio("./notes/A5.mp3")
            audio.play();
            break;
        case "T":
            var audio = new Audio("./notes/B5.mp3")
            audio.play();
            break;
        case "Y":
            var audio = new Audio("./notes/C6.mp3")
            audio.play();
            break;
        case "U":
            var audio = new Audio("./notes/D6.mp3")
            audio.play();
            break;
        case "I":
            var audio = new Audio("./notes/E6.mp3")
            audio.play();
            break;
        case "O":
            var audio = new Audio("./notes/F6.mp3")
            audio.play();
            break;
        case "P":
            var audio = new Audio("./notes/G6.mp3")
            audio.play();
            break;
        case "q":
            var audio = new Audio("./notes/A6.mp3")
            audio.play();
            break;
        case "w":
            var audio = new Audio("./notes/B6.mp3")
            audio.play();
            break;
        case "e":
            var audio = new Audio("./notes/C7.mp3")
            audio.play();
            break;
        case "r":
            var audio = new Audio("./notes/D7.mp3")
            audio.play();
            break;
        case "t":
            var audio = new Audio("./notes/E7.mp3")
            audio.play();
            break;
        case "y":
            var audio = new Audio("./notes/F7.mp3")
            audio.play();
            break;
        case "u":
            var audio = new Audio("./notes/G7.mp3")
            audio.play();
            break;
        case "i":
            var audio = new Audio("./notes/A7.mp3")
            audio.play();
            break;
        case "o":
            var audio = new Audio("./notes/B7.mp3")
            audio.play();
            break;
        case "p":
            var audio = new Audio("./notes/C8.mp3")
            audio.play();
            break;
        case "!":
            var audio = new Audio("./notes/Bb0.mp3")
            audio.play();
            break;
        case "@":
            var audio = new Audio("./notes/Db1.mp3")
            audio.play();
            break;
        case "#":
            var audio = new Audio("./notes/Eb1.mp3")
            audio.play();
            break;
        case "$":
            var audio = new Audio("./notes/Gb1.mp3")
            audio.play();
            break;
        case "%":
            var audio = new Audio("./notes/Ab1.mp3")
            audio.play();
            break;
        case "^":
            var audio = new Audio("./notes/Bb1.mp3")
            audio.play();
            break;
        case "&":
            var audio = new Audio("./notes/Db2.mp3")
            audio.play();
            break;
        case "*":
            var audio = new Audio("./notes/Eb2.mp3")
            audio.play();
            break;
        case "-":
            var audio = new Audio("./notes/Gb2.mp3")
            audio.play();
            break;
        case "+":
            var audio = new Audio("./notes/Ab2.mp3")
            audio.play();
            break;
        case "1":
            var audio = new Audio("./notes/Bb2.mp3")
            audio.play();
            break;
        case "2":
            var audio = new Audio("./notes/Db3.mp3")
            audio.play();
            break;
        case "3":
            var audio = new Audio("./notes/Eb3.mp3")
            audio.play();
            break;
        case "4":
            var audio = new Audio("./notes/Gb3.mp3")
            audio.play();
            break;
        case "5":
            var audio = new Audio("./notes/Ab3.mp3")
            audio.play();
            break;
        case "6":
        var audio = new Audio("./notes/Bb3.mp3")
            audio.play();
            break;
        case "7":
            var audio = new Audio("./notes/Db4.mp3")
            audio.play();
            break;
        case "8":
            var audio = new Audio("./notes/Eb4.mp3")
            audio.play();
            break;
        case "9":
            var audio = new Audio("./notes/Gb4.mp3")
            audio.play();
            break;
        case "0":
            var audio = new Audio("./notes/Ab4.mp3")
            audio.play();
            break;
        case "[":
            var audio = new Audio("./notes/Bb4.mp3")
            audio.play();
            break;
        case "]":
            var audio = new Audio("./notes/Db5.mp3")
            audio.play();
            break;
        case "\\":
            var audio = new Audio("./notes/Eb5.mp3")
            audio.play();
            break;
        case ";":
            var audio = new Audio("./notes/Gb5.mp3")
            audio.play();
            break;
        case "'":
            var audio = new Audio("./notes/Ab5.mp3")
            audio.play();
            break;
        case ",":
            var audio = new Audio("./notes/Bb5.mp3")
            audio.play();
            break;
        case ".":
            var audio = new Audio("./notes/Db6.mp3")
            audio.play();
            break;
        case "/":
            var audio = new Audio("./notes/Eb6.mp3")
            audio.play();
            break;
        case ":":
            var audio = new Audio("./notes/Gb6.mp3")
            audio.play();
            break;
        case '"':
            var audio = new Audio("./notes/Ab6.mp3")
            audio.play();
            break;
        case "?":
            var audio = new Audio("./notes/Bb6.mp3")
            audio.play();
            break;
        case "~":
            var audio = new Audio("./notes/Db7.mp3")
            audio.play();
            break;
        case "`":
            var audio = new Audio("./notes/Eb7.mp3")
            audio.play();
            break;
        case "Ctrl":
        case "Control":
            var audio = new Audio("./notes/Gb7.mp3")
            audio.play();
            break;
        case "Esc":
        case "Escape":
            var audio = new Audio("./notes/Ab7.mp3")
            audio.play();
            break;
        case "Enter":
            var audio = new Audio("./notes/Bb7.mp3")
            audio.play();
            break;
        default:
            console.log("Other keys")

        
        
    }
}

function buttonAnimation(currentKey) {
    if(currentKey === "Escape") {
        var activeKey = keys[keys.length-2]
    }
    else if(currentKey === "Control") {
        var activeKey = keys[keys.length-3] 
    }
    else{
        for(key of keys){
            if(key.innerText === currentKey){
                var activeKey = key;
                break;
            }
        }
    }
    
    activeKey.classList.add("pressed");
    setTimeout(function(){
        activeKey.classList.remove("pressed")
    },100);
}