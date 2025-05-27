fetch("https://mock-api.com/register", {
    method: "POST",
    body: JSON.stringify({ name: "John", email: "john@example.com" }),
})
.then(response => response.json())
.then(data => console.log("Registration success:", data))
.catch(error => console.error("Registration failed:", error));
