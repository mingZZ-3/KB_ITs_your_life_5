package week4;

import java.util.*;

public class leet322 {

    class Solution {
        public int coinChange(int[] coins, int amount) {
            if (amount == 0) return 0;

            Queue<Entry> que = new LinkedList<>();
            boolean[] visited = new boolean[amount + 1];
            que.add(new Entry(amount, 0));
            while(!que.isEmpty()) {
                Entry curr = que.remove();
                for (int i=0; i < coins.length; i++) {
                    int nextAmount = curr.amount - coins[i];

                    if (nextAmount == 0)
                        return curr.cnt + 1;

                    if (nextAmount > 0 && !visited[nextAmount]) {
                        visited[nextAmount] = true;
                        que.add(new Entry(nextAmount, curr.cnt + 1));
                    }
                }
            }
            return -1;
        }

        class Entry {
            int amount, cnt;

            public Entry(int amount, int cnt) {
                this.amount = amount;
                this.cnt = cnt;
            }
        }
    }
}
