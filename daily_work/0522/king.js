const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin, // 표준 입력 스트림 사용
    output: process.stdout // 표준 출력 스트림 사용
});

const ask_movie = () => {
    return new Promise((resolve, reject) => {
        rl.question('보고 싶은 영화 입력>> ', (line) => {
            resolve(line)
            rl.close();
        })
    });
}

module.exports = ask_movie;