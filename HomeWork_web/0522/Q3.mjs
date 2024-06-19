import fs from 'fs';

function print() {
    if (fs.existsSync('movie.txt') && fs.existsSync('tour.txt')) {
        const movie_readData = fs.readFileSync('movie.txt', {encoding:'utf8'});
        const tour_readData = fs.readFileSync('tour.txt', {encoding:'utf8'});

        console.log('===================');
        console.log(`보고 싶은 영화는 ${movie_readData}이고,\n가고 싶은 여행지는 ${tour_readData}`);
        console.log('===================');
    }
}

print();