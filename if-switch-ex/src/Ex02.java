import java.util.Scanner;

public class Ex02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //첫번째 수 입력
        System.out.println("첫번째 수 입력 :");
        int a = scanner.nextInt();

        //두번째 수 입력
        System.out.println("두번째 수 입력 :");
        int b =scanner.nextInt();

        System.out.println("a = " + a  + "b = " + b);

        int temp = b;
        a=temp;
        b=a;

        System.out.println("a = "+ a + "b + " + b);

    }
}
