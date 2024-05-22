const users = require("./user1");
const hello = require("./app.js");
const person = require("./user2.js")

console.log(users);
hello(users.user3);

console.log(person);
console.log('name>> ' + person.name);
console.log('age>> ' + person.age);
console.log('tel>> ' + person.tel);