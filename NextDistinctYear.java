import java.util.Scanner;

public class NextDistinctYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        while (true) {
            year++;
            String yearString = String.valueOf(year);
            if (hasDistinctDigits(yearString)) {
                System.out.println(year);
                break;
            }
        }
    }

    private static boolean hasDistinctDigits(String year) {
        boolean[] seen = new boolean[10];
        for (char c : year.toCharArray()) {
            int digit = c - '0';
            if (seen[digit]) {
                return false;
            }
            seen[digit] = true;
        }
        return true;
    }
}
