package week2;

import java.util.*;
import java.util.stream.Collectors;

public class pgs60057 {
    public static void main(String[] args) {
        int answer = solution("abcabcdede");
        System.out.println(answer);
    }

    // stack
    public static int solution(String s) {
        int result = s.length();
        for (int i = 1; i <= s.length()/2; i++) {
            List<String> arrays = new ArrayList<>();
            for (int j = 0; j < s.length(); j += i) {
                arrays.add(s.substring(j, Math.min(s.length(), j+i)));
            }
            Stack<SData> stack = new Stack<>();
            String prev = "";
            for (String str : arrays) {
                if (prev.equals(str)) {
                    SData sData = stack.pop();
                    stack.push(new SData(sData.cnt + 1, sData.word));
                } else {
                    prev = str;
                    stack.push(new SData(1, str));
                }
            }
            String newWord = stack.stream().map(SData::toString).collect(Collectors.joining());
            System.out.println(newWord);
            result = Math.min(result, newWord.length());
        }

        return result;
    }

    static class SData {
        int cnt;
        String word;

        public SData(int cnt, String word) {
            this.cnt = cnt;
            this.word = word;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            if (cnt == 1)
                sb.append(word);
            else
                sb.append(cnt).append(word);
            return sb.toString();
        }
    }

    // 구현
    public int solution2(String s) {
        int result = 0;

        return result;
    }
}
