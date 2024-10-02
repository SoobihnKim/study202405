package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(int[] num_list) {
        int product = 1;  // 곱을 저장할 변수, 1로 초기화
        int sum = 0;      // 합을 저장할 변수

        // 리스트의 원소들을 순회하면서 곱과 합을 계산
        for (int num : num_list) {
            product *= num;  // 원소들의 곱 계산
            sum += num;      // 원소들의 합 계산
        }

        // 곱이 합의 제곱보다 작으면 1, 크거나 같으면 0 반환
        return product < (sum * sum) ? 1 : 0;
    }
}






