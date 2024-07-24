package week3;

import java.util.*;

public class leet46 {   // permutations  - 순열
    // https://leetcode.com/problems/permutations/description/

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        backtrack(new ArrayList<Integer>(), nums, visited);
        return result;
    }

    public void backtrack(List<Integer> crr, int[] nums, boolean[] visited) {
        if (crr.size() == nums.length) {
            result.add(new ArrayList<>(crr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i])
                continue;

            crr.add(nums[i]);
            visited[i] = true;
            backtrack(crr, nums, visited);
            crr.remove(crr.size() - 1);
            visited[i] = false;
        }
    }
}
