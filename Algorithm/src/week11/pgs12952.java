package week11;

public class pgs12952 { // N-Queen

    class Solution {
        boolean[] colCheck, leftDCheck, rightDCheck;

        public int solution(int n) {
            colCheck = new boolean[n];
            leftDCheck = new boolean[2*n-1];
            rightDCheck = new boolean[2*n-1];

            return placeQueen(n, 0);
        }

        int placeQueen(int n, int row) {    // row 현재 보는 라인
            if (row == n) return 1;

            int sum = 0;
            for (int col=0; col<n; col++) {
                if (checkBoard(row, col, n)) {
                    colCheck[col] = true;
                    leftDCheck[row - col + n - 1] = true;
                    rightDCheck[row+col] = true;

                    sum += placeQueen(n, row+1);

                    colCheck[col] = false;
                    leftDCheck[row - col + n - 1] = false;
                    rightDCheck[row+col] = false;
                }
            }
            return sum;
        }

        boolean checkBoard(int row, int col, int n) {
            return (!colCheck[col] && !leftDCheck[row - col + n - 1] && !rightDCheck[row+col]);
        }
    }
}
