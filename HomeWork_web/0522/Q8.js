const fsPromises = require('fs').promises;

fsPromises.readdir(process.cwd())
 
// If promise resolved and
// data are fetched
.then(filenames => {
    console.log(filenames)
})

.then( () => {
    console.log('Code is done.');
})

// If promise is rejected
.catch(err => {
    console.log(err)
});

