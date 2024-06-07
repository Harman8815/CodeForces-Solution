import java.util.*;

public class AlmostLuckyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        if (isAlmostLucky(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isAlmostLucky(int n) {
        List<Integer> luckyNumbers = generateLuckyNumbers(n);
        
        for (int lucky : luckyNumbers) {
            if (n % lucky == 0) {
                return true;
            }
        }
        return false;
    }

    public static List<Integer> generateLuckyNumbers(int n) {
        List<Integer> luckyNumbers = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("4");
        queue.add("7");
        
        while (!queue.isEmpty()) {
            String luckyStr = queue.poll();
            int luckyNumber = Integer.parseInt(luckyStr);
            
            if (luckyNumber > n) {
                continue;
            }
            
            luckyNumbers.add(luckyNumber);
            queue.add(luckyStr + "4");
            queue.add(luckyStr + "7");
        }
        
        return luckyNumbers;
    }
}
