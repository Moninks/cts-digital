document.getElementById("registerBtn").onclick = () => alert("Registered!");

document.getElementById("searchBox").onkeydown = event => {
    console.log("Searching: " + event.target.value);
};
