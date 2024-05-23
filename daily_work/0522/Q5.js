const http = require('http');
const getIndexPage = require('./index.js');
const getHome = require('./home.js');
const getContact = require('./contact.js');

// http 라우팅 메인
const server = http.createServer((req, res) => {
    // 요청 메소드, url 가져오기
    // console.log(req);
    const {url, method} = req;
    console.log('url : ' + url + ', method : ' + method);

    // 수동 라우팅
    if(url === '/' || url === '/index') {
        getIndexPage(req, res);
    } else if(url.includes('contact') && method == 'GET') {
        getContact(req, res);
    } else if(url.includes('home') && method == 'GET') {
        getHome(req, res);
    } else {
        res.setHeader('Content-Type', 'text/html');
        res.end('<h1>Error!</h1>');
    }

});

server.listen(3000, '127.0.0.1', () => {
    console.log('Listening on 127.0.0.1:3000');
});