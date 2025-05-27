const events = [
    { name: "Concert", date: "2025-07-01", seats: 5 },
    { name: "Workshop", date: "2023-06-01", seats: 0 },
];

events.forEach(event => {
    if (new Date(event.date) > new Date() && event.seats > 0) {
        console.log(`Upcoming Event: ${event.name}`);
    } else {
        console.log(`Event not available: ${event.name}`);
    }
});

try {
    let registrationSeats = -1;
    if (registrationSeats < 0) throw new Error("Invalid seat number");
} catch (error) {
    console.error("Registration failed:", error.message);
}
