package switchCondition;

import java.util.Scanner;

public class Ex5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 조건
        System.out.println("시간입력");
        int H = scanner.nextInt();

        //분입력
        System.out.println("분입력");
        int M = scanner.nextInt();

        //온도입력
        System.out.println("요리시간");
        int C = scanner.nextInt();

        M=M+C;

        H=H+M/60;
        H=H%24;
        M=M%60;


        System.out.println(H +" " +M);


    }
}