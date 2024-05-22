// 동기방식 파일 생성

const fs = require('fs');
const path = require('path');

const path1 = 'me.txt';
const text1 = '오늘은 에어컨이 차가워.\n밖에 날씨는 매우 좋아.\n';
fs.writeFileSync(path1, text1, {encoding:'utf8'});

const readData = fs.readFileSync(path1, {encoding:'utf8'});
console.log(readData);

if (fs.existsSync(path1)){
    const content = text1 + '************\n나는별이야\n제일 빛나\n************\n';
    fs.writeFileSync('you.txt', content, {flag : 'a'});
}