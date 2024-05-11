var selectedSeats = Array();
var occupiedSeats = [14, 23, 31];
const price = 5000;

function seatNumber(num) {
    if (selectedSeats.includes(num) == false) {
        selectedSeats.push(num);
        seatsSort();
        sumPrice();
        document.getElementById('picked').innerHTML = selectedSeats.sort();
    } else {
        alert('이미 고른 좌석 입니다 !');
    }
}

function noticeSelected() {
    alert('이미 선택된 좌석입니다 ㅜ,ㅜ');
}

function addSeat() {
    let data = Number(document.getElementById('inputValue').value);

    if (data >= 1 && data <= 40) {
        if (occupiedSeats.includes(data) == true) {
            alert('이미 선택된 좌석입니다 ㅜ,ㅜ');
            document.getElementById('inputValue').value = '';
        } else if (selectedSeats.includes(data) == false) {
            selectedSeats.push(data);
            seatsSort();
            sumPrice();

            document.getElementById('picked').innerHTML = selectedSeats;
            document.getElementById('inputValue').value = '';
        } else {
            alert('이미 고른 좌석 입니다 !');
            document.getElementById('inputValue').value = '';
        }
    } else {
        alert('!!! 없는 좌석입니다 !!!');
        document.getElementById('inputValue').value = '';
    }
}

function clearSeats() {
    selectedSeats = []
    document.getElementById('picked').innerHTML = selectedSeats;
    sumPrice();
}

function done() {
    alert('결제 금액은 ' + (price*selectedSeats.length) +'원으로 신청이 완료됐습니다 !\n좌석에 반영은 아직 안됩니다 하하 !')
}

function sumPrice() {
    document.getElementById('total_price').innerHTML = price * selectedSeats.length;
}

function seatsSort() {
    selectedSeats.sort(function(a, b)  {
        if(a > b) return 1;
        if(a === b) return 0;
        if(a < b) return -1;
      });
}