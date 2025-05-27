async function fetchEvents() {
    const response = await fetch("https://mock-api.com/events");
    const data = await response.json();
    console.log(data);
}

fetchEvents();
