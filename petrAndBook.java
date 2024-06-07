import java.util.Scanner;

public class petrAndBook {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[7];

    for (int i = 0; i < 7; i++) arr[i] = sc.nextInt();

    int index = 0;

    while (n > 0) {
      n -= arr[index];
      if (n <= 0) break;

      index++;
      if (index == 7) index = 0;
    }

    System.out.println(index + 1);

    sc.close();
  }
}
