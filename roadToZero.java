import java.util.Scanner;

public class roadToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (x > y) {
                long temp = x;
                x = y;
                y = temp;
            }

            long cost;
            if (b < 2 * a) {
                cost = x * b + (y - x) * a;
            } else {
                cost = (x + y) * a;
            }

            System.out.println(cost);
        }

        sc.close();
    }
}
