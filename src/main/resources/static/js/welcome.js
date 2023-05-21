let username = window.prompt("What's your name")
let channelLink = document.getElementById("channel1")
let channelNum;

switch (channelLink.id){
    case 'channel1':
        channelNum = 1
        break;
    case 'channel2':
        channelNum = 2
        break;
}

let ChatUser = {
    'chatUsername' : username,
    'chatChannel' : channelNum
}

channelLink.addEventListener('click', () => {

    fetch(`http://localhost:8080/welcome`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(ChatUser)
    })
/*        .then((response) => response.json())
        .then((data) => {
            console.log(data)
        })*/
})