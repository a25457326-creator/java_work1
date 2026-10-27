import java.util.Scanner;

public class EX6 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 조건
        System.out.println("주사위1");
        int A = scanner.nextInt();

        System.out.println("주사위2");
        int B = scanner.nextInt();

        System.out.println("주사위3");
        int C = scanner.nextInt();
        int result;

        if (A==B && B==C){
            result = 10000 +A *1000;
        }else if (A==B || A==C) {
            result = 1000+A*100;
        } else if (B==C) {
            result = 1000+B*100;
        }else {
            int Max = Math.max(A,Math.max(B,C));
            result = Max * 100;
        }
        System.out.println("상금 : " + result);
    }
}