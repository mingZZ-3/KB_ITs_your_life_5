package D_0619;

import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        int[] answer = new int[1000];
        int[] myAnswer = new int[1000];
        int cnt = 0;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = new Random().nextInt(4) + 1;
            myAnswer[i] = new Random().nextInt(4) + 1;
        }

        System.out.println("Index       Correct Answer      My Answer");
        for (int i = 0; i < answer.length; i++) {
            System.out.println(i + "\t\t\t" + answer[i] + "\t\t\t\t\t" + myAnswer[i]);
            if (answer[i] == myAnswer[i]) {
                cnt++;
            }
        }
        System.out.println("Correct Answer: " + cnt);
    }
}
