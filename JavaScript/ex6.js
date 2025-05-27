let events = [];
events.push({ name: "Workshop", category: "Education" });

const musicEvents = events.filter(e => e.category === "Music");
console.log(musicEvents);

const formattedEvents = events.map(e => `${e.name} Event`);
console.log(formattedEvents);
