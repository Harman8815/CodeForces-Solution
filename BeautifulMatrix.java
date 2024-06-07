import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int arr[][]=new int[5][5];
        int i = 0, j = 0, temp = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                temp = sc.nextInt();
                if (temp == 1)
                    break;
            }
            if (temp == 1)
                break;
        }
        int ans=Math.abs(i-2)+Math.abs(j-2);
        System.out.println(ans);
        
        sc.close();
        System.gc();
    }
}
