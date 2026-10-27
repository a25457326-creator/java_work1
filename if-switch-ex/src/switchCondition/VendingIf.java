package switchCondition;

import java.util.Scanner;

public class VendingIf {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffeePrice = 1500;
        int juicePrice = 1000;
        int waterPrice = 500;
        System.out.println("투입 금액을 입력하세요");
        int money = sc.nextInt();

        System.out.println("====================");
        if (money >= coffeePrice) {
            System.out.println("커피,주스,물 모두 구매 가능합니다.");
        } else if (money >= juicePrice) {

            System.out.println("주스, 물 구매 가능합니다.");
            {
        else (money >= waterPrice) ;
                System.out.println("물 구매 가능합니다.");
        else{
                System.out.println("잔액이 부족합니다");

            }
            }
