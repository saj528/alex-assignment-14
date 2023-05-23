let messageBox = document.getElementById("messageBox")
let messageForm = document.getElementById("messageForm")
let user = JSON.parse(sessionStorage.getItem('user'))


messageBox.addEventListener('click', () =>{

    if(sessionStorage.getItem("message") != null){
        console.log(sessionStorage.getItem("message").toString())
    }
})


messageForm.addEventListener('submit',() => {


    let message = {
        'username' : user.username,
        'message' : messageBox.value,
        'channelId' : user.channelId

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
    sessionStorage.setItem('message',JSON.stringify(message))

})