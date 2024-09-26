package programmers;

import java.util.Scanner;

public class Main {
    //    public static int main(String[] args) {
    public int solution(int a, int b) {

        int concatenated = Integer.parseInt("" + a + b);

        int product = 2 * a * b;

        return Math.max(concatenated, product);

    }

//    }
}






