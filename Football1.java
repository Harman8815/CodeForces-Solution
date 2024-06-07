import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Football1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String temp = sc.nextLine();
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        String result = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println(result);
        sc.close();
    }
}
