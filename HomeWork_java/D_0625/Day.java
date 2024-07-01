package D_0625;

public class Day {
    private String todo;
    private String place;
    private int time;
    static int total_time;
    static int total_cnt;

    static {
        total_time = 0;
        total_cnt = 0;
    }

    public Day() {
        total_cnt++;
    }

    public Day(String todo, int time, String place) {
        this.todo = todo;
        this.place = place;
        this.time = time;
        total_cnt++;
        total_time += this.time;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        total_time -= this.time;
        this.time = time;
        total_time += this.time;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Day{");
        sb.append("todo='").append(todo).append('\'');
        sb.append(", place='").append(place).append('\'');
        sb.append(", time=").append(time);
        sb.append('}');
        return sb.toString();
    }
}
