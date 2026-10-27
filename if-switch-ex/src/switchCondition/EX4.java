package switchCondition;

import java.util.Scanner;

public class EX4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시간입력
        System.out.println("시간입력");
        int H = scanner.nextInt();

        //분입력
        System.out.println("분입력");
        int M = scanner.nextInt();

        M = M-45;

        if (M<0) {
            M=M+60;
            H=H-1;
        }
        if (H<0){
            H=H+24;
        }

        System.out.println(H + " "
        + M);


    }
}
