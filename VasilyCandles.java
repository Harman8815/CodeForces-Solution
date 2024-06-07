import java.util.Scanner;

public class VasilyCandles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int totalHours = 0;
        int burntCandles = 0;

        while (a > 0) {
            totalHours += a;
            burntCandles += a;
            a = burntCandles / b;
            burntCandles %= b;
        }

        System.out.println(totalHours);
    }
}
