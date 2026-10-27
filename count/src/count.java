public class count {
    static void main(String[] args) {
        int a = 5;
        System.out.println(a++);  // 5 출력 후 증가 → a = 6
        System.out.println(a);    // 6

        int b = 5;
        System.out.println(++b);  // 증가 후 출력 → 6
        System.out.println(b);    // 6
    }
}
