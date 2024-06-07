import java.util.Scanner;

public class raiseBacteria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long x = scanner.nextLong();
    int count = 0;

    while (x / 2 != 0) {
      if (x % 2 == 1) {
        count++;
      }
      x = x / 2;
    }

    System.out.println(count + 1);
    scanner.close();
  }
}
