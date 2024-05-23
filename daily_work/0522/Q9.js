const fsPromises = require('fs').promises;

async function readFunc(){
    try {
        const data = await fsPromises.readdir(process.cwd());
        console.log(data);
        console.log('Code is done.');
    } catch(err) {
        console.err(err);
    }
}

readFunc()