package D_0621;

public class Subject {
    private String name;
    private int score;

    public Subject() {
    }

    public Subject(String name) {
        this.name = name;
    }

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Subject : ");
        sb.append(name);
        return sb.toString();
    }
}
