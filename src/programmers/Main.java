package programmers;

import java.util.Scanner;

public class Main {
    public int solution(int[] num_list) {
        int oddsum = 0;
        int evensum = 0;

        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {
                oddsum += num_list[i];
            } else {
                evensum += num_list[i];
            }
        }

        return Math.max(oddsum, evensum);
    }
}






