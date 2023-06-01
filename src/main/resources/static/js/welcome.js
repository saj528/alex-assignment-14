let username
let channelLink = document.getElementById("channel1")
let channelNum;
let user

if (sessionStorage.getItem('user') === null) {
    username = window.prompt("What's your name")

} else {
    username = JSON.parse(sessionStorage.getItem('user')).username
}

switch (channelLink.id) {
    case 'channel1':
        channelNum = 1
        break;
    case 'channel2':
        channelNum = 2
        break;
}

user = {
    'username': username,
    'channelId': channelNum
}
sessionStorage.setItem('user', JSON.stringify(user))


/*
fetch('/are-there-users-check')
    .then(response => response.json())
    .then(data => {
        console.log(data)
        if (data) {
            sessionStorage.clear()
        }
    })
    .catch(error => {
        console.error('Error:', error);
    });
*/


/*

fetch('/does-username-exist', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: sessionStorage.getItem('user')
})
    .then(response => response.json())
    .then(data => {
        if (data) {
            console.log('true');
        } else {
            sessionStorage.clear()
        }
    })
    .catch(error => {
        console.error('Error:', error);
    });
*/


channelLink.addEventListener('click', () => {

    fetch(`http://localhost:8080/add-user`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(user)
    })
        .then((response) => response.json())
        .then((data) => {
            console.log(data)
        })

})


