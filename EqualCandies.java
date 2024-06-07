import java.util.*;

public class EqualCandies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int minCandies = Arrays.stream(arr).min().getAsInt();
            int extraCandies = 0;
            // System.out.println("Array is:-");
            // for (int i:arr) {
            //     System.out.print(i+" ");
            // }
            // System.out.println();
            for (int i = 0; i < n; i++) {
                if (arr[i] >= minCandies) {
                    extraCandies += arr[i] - minCandies;
                }
            }

            System.out.println(extraCandies);
        }
        sc.close();
    }
}
