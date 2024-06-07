import java.util.Scanner;

public class fillingShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & 1) != 0) {
            System.out.println(0);
        } else {
            System.out.println(1L << (n / 2));
        }
        sc.close();
    }
}
