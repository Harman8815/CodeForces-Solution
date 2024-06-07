import java.util.Scanner;

public class cAPSlOCK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        boolean c = true;
        char[] result = new char[s.length()];

        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                c = false;
            }
        }

        if (c) {
            for (int j = 0; j < s.length(); j++) {
                char u;
                if (Character.isLowerCase(s.charAt(j))) {
                    u = Character.toUpperCase(s.charAt(j));
                } else {
                    u = Character.toLowerCase(s.charAt(j));
                }
                result[j] = u;
            }
            System.out.println(result);
        } else {
            System.out.println(s);
        }
        scanner.close();
    }
}
