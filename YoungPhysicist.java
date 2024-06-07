import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = 0, Y = 0, Z = 0;
        while (n-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            X += x;
            Y += y;
            Z += z;
        }
        if (X == 0 && Y == 0 && Z == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}