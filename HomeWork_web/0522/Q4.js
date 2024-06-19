const http = require('http');

// http 라우팅 메인
const server = http.createServer((req, res) => {
    // 요청 메소드, url 가져오기
    const {url, method} = req;

    // 수동 라우팅
    if (method == 'GET') {
        res.setHeader('Content-Type', 'text/html');
        res.end('<h1>Hello Node</h1>');
    } else {
        res.setHeader('Content-Type', 'text/html');
        res.end('<h1>Error!</h1>');
    }

});

server.listen(3000, '127.0.0.1', () => {
    console.log('Listening on 127.0.0.1:3000');
});