import java.util.Scanner;

public class DreamoonandStairs {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int minMoves = (n + 1) / 2;
    while (minMoves % m != 0) minMoves++;
    if (minMoves > n) {
      System.out.println(-1);
    } else {
      System.out.println(minMoves);
    }
    sc.close();
  }
}
