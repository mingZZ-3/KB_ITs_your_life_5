
const express = require('express');
const app = express();

app.use(express.static('public'));
app.set("view engine", "ejs");
app.set('views', __dirname + '/views');
app.use(express.json());
app.use(express.urlencoded());

const port = 3000;

app.get(['/',  '/index', '/home'], (req, res) => {
    res.status(200);
    res.render('home');
});

app.get(['/login'], (req, res) => {
    res.status(200);
    res.render('login');
});

app.get(['/company'], (req, res) => {
    res.status(200);
    res.render('company');
});

app.get(['/location'], (req, res) => {
    res.status(200);
    res.render('location');
});

app.listen(port, () => {
    console.log(`${port}번으로 서버 실행 중`)
});
