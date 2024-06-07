import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String situation = sc.nextLine();
        boolean isDangerous = isDangerous(situation);
        System.out.println(isDangerous ? "YES" : "NO");
        sc.close();
    }

    public static boolean isDangerous(String situation) {
        int count = 1;
        char prev = situation.charAt(0);

        for (int i = 1; i < situation.length(); i++) {
            char curr = situation.charAt(i);
            if (curr == prev) {
                count++;
                if (count == 7) {
                    return true;
                }
            } else {
                count = 1;
                prev = curr;
            }
        }

        return false;
    }
}
