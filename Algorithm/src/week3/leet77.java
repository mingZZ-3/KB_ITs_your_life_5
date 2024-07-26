package week3;

import java.util.*;

public class leet77 {   // Combination - 조합 : 순서상관없이 중복 제외

    List<List<Integer>> result = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> combine(int n, int k) {
        nums = new int[n];
        for (int i = 0; i < n; i++) {  // 1 - n 까지의 데이터셋
            nums[i] = i + 1;
        }

        backtrack(0, new ArrayList<>(), k);
        return result;
    }

    public void backtrack(int start, List<Integer> curr, int k) {
        if (curr.size() == k) {     // k개의 조합인 경우
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(i + 1, curr, k);
            curr.remove(curr.size() - 1);
        }
    }
}