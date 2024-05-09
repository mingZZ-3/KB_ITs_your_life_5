var tripTo = '홍콩';
var total_price = 600000;
var cnt = 5;
var date = '2024년 5월 9일';
var phone_num = '010-1234-5678';
var warning = '마카오 방문 희망시 서류 필수 체크';
var more_money = 200000;
var price_per_person = 150000;

var txt = '여행지명 : ' + tripTo +'\n' +
        '여행 경비 : ' + total_price +'\n' +
        '여행 인원 : ' + cnt +'\n' +
        '여행 일정 : ' + date +'\n' +
        '대표 번호 : ' + phone_num +'\n' +
        '예상 추가 경비 : ' + more_money +'\n' +
        '1인 예상 경비 : ' + price_per_person +'\n' +
        '주의 사항 : ' + warning;

window.alert(txt)