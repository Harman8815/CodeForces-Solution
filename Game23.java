import java.util.Scanner;

public class Game23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        sc.close();

        if (m % n != 0) {
            System.out.println(-1);
            return;
        }

        long ratio = m / n;
        int moves = 0;

        while (ratio % 2 == 0) {
            ratio /= 2;
            moves++;
        }

        while (ratio % 3 == 0) {
            ratio /= 3;
            moves++;
        }

        if (ratio != 1) {
            System.out.println(-1);
        } else {
            System.out.println(moves);
        }
    }
}
