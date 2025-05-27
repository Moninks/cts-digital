function addEvent(name, date, seats) {
    return { name, date, seats };
}

function registerUser(event) {
    if (event.seats > 0) {
        event.seats--;
        console.log(`Registered for ${event.name}, Seats Left: ${event.seats}`);
    } else {
        console.log("No seats available.");
    }
}

function filterEvents(events, callback) {
    return events.filter(callback);
}

const musicEvents = filterEvents(events, e => e.name.includes("Concert"));
console.log(musicEvents);
