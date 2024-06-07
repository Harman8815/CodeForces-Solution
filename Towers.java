import java.util.Scanner;
import java.util.TreeMap;

public class Towers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = helper(arr);
        System.out.println(result[0] + " " + result[1]);
        sc.close();
    }

    public static int[] helper(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int maxFrequency = 0;
        int uniqueLengths = 0;

        for (Integer value : map.values()) {
            if (value > maxFrequency) {
                maxFrequency = value;
            }
            uniqueLengths++;
        }

        return new int[]{maxFrequency, uniqueLengths};
    }
}
