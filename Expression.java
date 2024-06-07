import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int result1 = a + b + c;
        int result2 = a * b * c;
        int result3 = (a + b) * c;
        int result4 = a * (b + c);
        
        int maxResult = Math.max(Math.max(result1, result2), Math.max(result3, result4));
        
        System.out.println(maxResult);
    }
}
