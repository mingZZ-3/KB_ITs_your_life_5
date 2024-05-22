
const fs = require('fs');

const getHome = (req, res)=>{
    res.setHeader('Content-Type', 'text/html');
    const rs = fs.createReadStream(__dirname + '/assets/home.html', 'utf-8');
    rs.pipe(res);
}

module.exports = getHome;
