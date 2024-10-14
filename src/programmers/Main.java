package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(String num_str) {
        int sum = 0;
        for (int i = 0; i < num_str.length(); i++) {
            sum += Character.getNumericValue(num_str.charAt(i));
        }
        return sum;
    }
}






