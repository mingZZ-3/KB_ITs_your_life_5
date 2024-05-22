const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout // 표준 출력 스트림 사용
});

const ask_tour = () => {
    return new Promise((resolve, reject) => {
        rl.question('가고 싶은 여행지 입력>> ', (line) => {
            resolve(line)
            rl.close();
        })
    });
}

module.exports = ask_tour;