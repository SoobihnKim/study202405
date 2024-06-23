package backjoon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 오븐시계
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int min = 60 * A + B; // 분
        min += C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}
