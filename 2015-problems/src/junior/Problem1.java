package junior;

import java.io.FileReader;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Problem1 find = new Problem1();
		System.out.println(find.special());
	}

	public String special() {
		Scanner in = new Scanner(System.in);
		final int month = in.nextInt();
		final int date = in.nextInt();
		in.close();
		if (month == 2 && date == 18) {
			return "Special";
		} else if ((month < 2) || (month == 2 && date < 18)) {
			return "Before";
		} else {
			return "After";
		}
	}
}