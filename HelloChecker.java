import java.util.Scanner;

public class HelloChecker {
    public static boolean canSayHello(String s) {
        String hello = "hello";
        int j = 0;

        for (int i = 0; i < s.length() && j < hello.length(); i++) {
            if (s.charAt(i) == hello.charAt(j)) {
                j++;
            }
        }

        return j == hello.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        if (canSayHello(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
