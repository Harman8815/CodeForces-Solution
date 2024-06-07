import java.util.Scanner;

public class keepItBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int num, flag = 0, first = -1, last = -1;
            while (n-- > 0) {
                num = sc.nextInt();
                if (flag != 0) {
                    if (num >= last && num <= first) {
                        last = num;
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                } else {
                    if (first == -1) {
                        first = num;
                        last = num;
                        System.out.print(1);
                    } else if (num >= last) {
                        last = num;
                        System.out.print(1);
                    } else if (first >= num) {
                        last = num;
                        flag = 1;
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
