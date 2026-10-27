package loopTest1;
public class Ex2 {
    static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");

            int j = 10;
            while (j > 0) {
                System.out.print(i + " ");
                j -= 3;
            }

        }
    }
}

