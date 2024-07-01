package D_0625;

public class Q1 {
    public static void main(String[] args) {
        Day[] days = new Day[3];
        days[0] = new Day("자바 공부", 10, "강남");
        days[1] = new Day("여행", 15, "강원도");
        days[2] = new Day("운동", 11, "피트니스");

        System.out.println("전체 하는 일의 시간은 : " + Day.total_time);
        System.out.println("평균 하는 일의 시간은 : " + (Day.total_time/Day.total_cnt));
        System.out.println("[ 등록된 매일 하는 일들의 리스트 ]");

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}