let messageBox = document.getElementById("messageBox")
let messageForm = document.getElementById("messageForm")
let messageContainer = document.getElementById("messageContainer")
let user = JSON.parse(sessionStorage.getItem('user'))
let channelId = getCurrentChannelId()

console.log(channelId)
if(!channelId === null){
    setInterval(getMessages, 500)
}





function getMessages() {

    fetch(`http://localhost:8080/get-messages/${channelId}`)
        .then(response => response.json())
        .then(data => {
            messageContainer.innerHTML = ''
            data.forEach(message => {
                messageContainer.innerHTML += `<div>
			  <span>${message.username}: ${message.message}</span>
			</div>`
            })
        })
}

function getCurrentChannelId(){
    const url = window.location.href

    const pattern = /\/chatChannel\/([^/?]+)/


    const matches = url.match(pattern)


    const tempChannelId = matches && matches[1]

    console.log(tempChannelId)
    return tempChannelId
}


messageForm.addEventListener('submit', () => {

    let message = {
        'username': user.username,
        'message': messageBox.value,
        'channelId': channelId

    }


    fetch(`http://localhost:8080/add-message`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(message)
    })
        .then((response) => response.json())
        .then((data) => {
            console.log(data)
        })


})