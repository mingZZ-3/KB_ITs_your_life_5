const fs = require('fs');
const ask_movie = require('./king.js');
const ask_tour = require('./tour.js');

async function main() {
    const movie = await ask_movie();
    const path1 = 'movie.txt';
    fs.writeFileSync(path1, movie, {encoding:'utf8'});

    const readData = fs.readFileSync(path1, {encoding:'utf8'});
    console.log(readData);
    
    if (fs.existsSync(movie)) {
        const tour = await ask_tour();
        const path2 = 'tour.txt';
        fs.writeFileSync(path2, tour, {encoding:'utf8'});

        const readData2 = fs.readFileSync(path2, {encoding:'utf8'});
        console.log(readData2);

        if (fs.existsSync(path2)) {
            console.log('보고 싶은 영화는 ' + movie + '이고\n' + '가고 싶은 여행지는 ' + tour);
        }
    }
    
}

main();