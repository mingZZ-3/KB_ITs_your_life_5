import readline from 'readline';
import fs from 'fs';

const rl = readline.createInterface({
    input: process.stdin, // 표준 입력 스트림 사용
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

async function makeMovieFile() {
    const tour = await ask_tour();
    const path = 'tour.txt'
    fs.writeFileSync(path, String(tour), {encoding : 'utf8'});
}

makeMovieFile();