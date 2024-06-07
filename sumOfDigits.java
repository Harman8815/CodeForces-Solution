import java.util.Scanner;

public class sumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        sc.close();
        
        int count = 0;
        while (num.length() > 1) {
            num = SumOfDigits(num);
            count++;
        }
        
        System.out.println(count);
    }

    private static String SumOfDigits(String num) {
        int sum = 0;
        for (char c : num.toCharArray()) {
            sum += c - '0';
        }
        return Integer.toString(sum);
    }
}
