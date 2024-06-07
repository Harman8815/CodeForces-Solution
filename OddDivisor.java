import java.util.Scanner;

public class OddDivisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            if ((n & 1) == 1) {
                System.out.println("YES");
            } else {
                boolean ok = false;
                long div = n;
                while (div > 2) {
                    div /= 2;
                    if ((div & 1) == 1) {
                        if (n % div == 0) {
                            ok = true;
                            break;
                        }
                    }
                }
                if (ok) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        scanner.close();
    }
}
