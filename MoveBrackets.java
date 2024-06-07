import java.util.Scanner;

public class MoveBrackets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String s = input.next();
            int ans = 0, open = 0, close = 0;
            for (int i = 0; i < n; i++) {
                if (i + 1 < n && s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
                    i++;
                    continue;
                }
                if (s.charAt(i) == '(') {
                    open++;
                } else if (s.charAt(i) == ')') {
                    close++;
                    if (open < close) {
                        ans++;
                        close--;
                    }
                }
            }
            System.out.println(ans);
        }
        input.close();
    }
}
