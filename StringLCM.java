import java.util.Scanner;

public class StringLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine(); 
        while (q-- > 0) {
            String s = sc.nextLine();
            String t = sc.nextLine();
            System.out.println(solver(s, t));
        }
        sc.close();
    }

    public static String solver(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int lcmLength = lcm(len1, len2);

        String str1 = generateString(s, lcmLength / len1);
        String str2 = generateString(t, lcmLength / len2);

        if (str1.equals(str2)) {
            return str1;
        } else {
            return "-1";
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static String generateString(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
