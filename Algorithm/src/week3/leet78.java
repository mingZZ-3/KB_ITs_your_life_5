package week3;

import java.util.ArrayList;
import java.util.List;

public class leet78 {   // subset
    public static void main(String[] args) {

        int curr = 1;
        String numbers = "17";
        int newValue = curr + (int)((numbers.charAt(1) - '0')*Math.pow(10, 1));
        System.out.println(newValue);
        System.out.println((int)(numbers.charAt(1) - '0'));
    }
}
