import java.util.Scanner;

public class Ex01 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 첫번째 수 입력
        System.out.println("첫번째 수 입력 ");
        int number1= scanner.nextInt();

        // 두번째 수 입력
        System.out.println("두번째 수 입력 ");
        int number2= scanner.nextInt();


        int max =(number1 >number2)? number1 :number2 ;
        System.out.println("큰수:"+ max);

    }
}
