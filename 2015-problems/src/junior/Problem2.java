package junior;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		Problem2 check = new Problem2();
		System.out.println(check.emotion());
		long finish=System.currentTimeMillis();
		System.out.println(finish-start);
	}

	public String emotion() {
		int happy = 0;
		int sad = 0;
		char char1;
		char char2;
		char char3;
		Scanner in = new Scanner(System.in);
		final String input = in.nextLine();
		for (int i = 0; i < input.length() - 2; i++) {
			char1 = input.charAt(i);
			char2 = input.charAt(i + 1);
			char3 = input.charAt(i + 2);
			if (char1 == ':' && char2 == '-' && char3 == ')') {
				happy++;
			} else if (char1 == ':' && char2 == '-' && char3 == '(') {
				sad++;
			}
		}
		if (happy == 0 && sad == 0) {
			return "none";
		} else if (happy == sad) {
			return "unsure";
		} else if (happy > sad) {
			return "happy";
		} else {
			return "sad";
		}
	}

}
