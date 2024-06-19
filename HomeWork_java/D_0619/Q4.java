package D_0619;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        String[] classList = {"국어", "영어", "수학", "컴퓨터", "회화"};
        int[] scores_1 = {44, 66, 22,99, 100};
        int[] scores_2 = Arrays.copyOf(scores_1, scores_1.length);
        scores_2[0] = 22;
        scores_2[2] = 88;

        System.out.println("1학기 성적 : " + Arrays.toString(scores_1));
        System.out.println("2학기 성적 : " + Arrays.toString(scores_2));

        int cnt_sameScore = 0;
        int cnt_greaterScore = 0;
        ArrayList greaterClassList = new ArrayList();

        for (int i = 0; i < scores_1.length; i++) {
            if (scores_1[i] == scores_2[i]) {
                cnt_sameScore++;
            }
            if (scores_1[i] < scores_2[i]) {
                cnt_greaterScore++;
                greaterClassList.add(classList[i]);
            }
        }
        System.out.println("1학기와 2학기 성적이 동일한 과목 수 : " + cnt_sameScore);
        System.out.println("1학기보다 성적이 오른 과목 수 : " + cnt_greaterScore);
        System.out.println("성적이 오른 과목명 : " + greaterClassList);
    }
}
