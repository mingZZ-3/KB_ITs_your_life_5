
const fs = require('fs');

const getContact = (req, res)=>{
    res.setHeader('Content-Type', 'text/html');
    const rs = fs.createReadStream(__dirname + '/assets/contact.html', 'utf-8');
    rs.pipe(res);
}

module.exports = getContact;
