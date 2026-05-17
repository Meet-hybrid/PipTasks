const prompt = require("prompt-sync")();

function createEvent(name, startDate, endDate, startTime, endTime) {
  return {
    name,
    startDate,
    endDate,
    startTime,
    endTime
  };
}

function createUser(username, password) {
  return {
    username,
    password,
    events: []
  };
}

function addEvent(user, event) {
  user.events.push(event);
  console.log(`Event "${event.name}" added for ${user.username}.`);
}

function showEvents(user) {
  console.log(`Events for ${user.username}:`);
  if (user.events.length === 0) {
    console.log("No events yet. Try adding one!");
  } else {
    user.events.forEach(e => console.log(eventToString(e)));
  }
}

function deleteEvent(user, name) {
  const before = user.events.length;
  user.events = user.events.filter(e => e.name !== name);

  if (user.events.length < before) {
    console.log(`Event "${name}" deleted.`);
  } else {
    console.log(`No event found with the name "${name}".`);
  }
}

function eventToString(event) {
  return `${event.name} (From ${event.startDate} ${event.startTime} To ${event.endDate} ${event.endTime})`;
}

const users = {};
let currentUser = null;

function login() {
  const username = prompt("Enter username: ");
  const password = prompt("Enter password: ");

  if (!users[username]) {
    users[username] = createUser(username, password);
    console.log(`Welcome, ${username}! Your account has been created.`);
  } else {
    if (users[username].password !== password) {
      console.log("Wrong password. Access denied.");
      return false;
    }
    console.log(`Welcome back, ${username}!`);
  }

  currentUser = users[username];
  return true;
}

function switchUser() {
  const username = prompt("Enter username: ");
  const password = prompt("Enter password: ");

  if (!users[username]) {
    users[username] = createUser(username, password);
    console.log(`New user ${username} created.`);
  } else {
    if (users[username].password !== password) {
      console.log("Wrong password. Cannot switch.");
      return;
    }
    console.log(`Switched to ${username}.`);
  }

  currentUser = users[username];
}

function menu() {
  let running = true;

  while (running) {
    console.log(`
Current user: ${currentUser.username}

What would you like to do?

1. Add event
2. View events
3. Delete event
4. Switch user
5. Exit
`);

    const choice = prompt("Choose option (1-5): ");

    if (choice === "1") {
      const name = prompt("Event name: ");
      const startDate = prompt("Start date (DD-MM-YYYY): ");
      const startTime = prompt("Start time (HH:MM): ");
      const endTime = prompt("End time (HH:MM): ");

      let endDateChoice = prompt("Do you want to add a different end date? (yes/no): ");
      let endDate;

      if (endDateChoice.toLowerCase() === "yes") {
        endDate = prompt("End date (DD-MM-YYYY): ");
      } else {
        endDate = startDate;
      }

      addEvent(currentUser, createEvent(name, startDate, endDate, startTime, endTime));
    } else if (choice === "2") {
      showEvents(currentUser);
    } else if (choice === "3") {
      const name = prompt("Enter event name to delete: ");
      deleteEvent(currentUser, name);
    } else if (choice === "4") {
      switchUser();
    } else if (choice === "5") {
      console.log("Goodbye!");
      running = false;
    } else {
      console.log("Invalid option. Please try again.");
    }
  }
}

if (login()) {
  menu();
}
