let submitBtn = document.getElementById("messageBox")
let userField = document.getElementById("userField")

console.log(sessionStorage.getItem("user").at(0))

userField.value = "bob"

submitBtn.addEventListener('submit',() => {
    console.log(submitBtn.value)
})