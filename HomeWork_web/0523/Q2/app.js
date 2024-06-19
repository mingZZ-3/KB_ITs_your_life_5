
const express = require('express');
const app = express();

app.use(express.static('public'));
app.set("view engine", "ejs");
app.set('views', __dirname + '/view');
app.use(express.json());
app.use(express.urlencoded());

const port = 3000;

app.use('/', require('./routes/getJson'));
app.use('/', require('./routes/getHtml'));

app.listen(port, () => {
    console.log(`${port}번으로 서버 실행 중`)
});
