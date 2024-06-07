import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dragons {

	static class Dragon implements Comparable<Dragon> {
		int x;
		int y;

		public Dragon(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Dragon o) {
			return this.x - o.x;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		ArrayList<Dragon> d = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			d.add(new Dragon(in.nextInt(), in.nextInt()));
		}
		Collections.sort(d);
		boolean winner = true;
		for (Dragon dragon : d) {
			if (s > dragon.x)
				s += dragon.y;
			else
				winner = false;
		}
		if (winner)
			System.out.println("YES");
		else
			System.out.println("NO");
		in.close();

	}

}