class Event {
    constructor(name, date, seats) {
        this.name = name;
        this.date = date;
        this.seats = seats;
    }

    checkAvailability() {
        return this.seats > 0 ? "Seats available" : "Sold out";
    }
}

const concert = new Event("Rock Night", "2025-07-10", 10);
console.log(concert.checkAvailability());
