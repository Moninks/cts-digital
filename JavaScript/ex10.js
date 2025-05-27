const event = { name: "Expo", date: "2025-06-12", seats: 50 };
const { name, date } = event;
console.log(name, date);

const eventList = [{ name: "Concert" }];
const newList = [...eventList, { name: "Workshop" }];
console.log(newList);
