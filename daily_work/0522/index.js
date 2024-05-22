
const fs = require('fs');

const getIndexPage = (req, res)=>{
    res.setHeader('Content-Type', 'text/html');
    const rs = fs.createReadStream(__dirname + '/assets/index.html', 'utf-8');
    rs.pipe(res);
}

module.exports = getIndexPage;
