package junior;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Problem4 message = new Problem4();
		message.time();
	}

	public void time() {
		char number;
		int time = 1;
		int storage;
		boolean had = false;
		Scanner in = new Scanner(System.in);
		storage = in.nextInt();
		char[][] record = new char[storage][2];
		int[][] result = new int[storage][2];
		for (int i = 0; i < storage; i++) {
			record[i][0] = in.next().charAt(0);
			record[i][1] = (char) in.nextInt();
		}
		in.close();
		for (int i = 0; i < storage; i++) {
			if (record[i][0] == 'R') {
				number = record[i][1];
				for (int a = i + 1; a < storage; a++) {
					if (record[a][0] == 'W') {
						time = time + (int) record[a][1];
					}
					if (record[a][0] == 'R' && record[a + 1][1] == record[a][1] && record[a + 1][0] == 'S') {
						time++;
					}
					if (record[a][0] == 'S' && record[a][1] == number) {
						for (int b = 0; b < storage; b++) {
							if (result[b][0] == number) {
								result[b][1] = result[b][1] + time;
							} else if (result[b][0] == 0) {
								result[i][0] = number;
								result[i][1] = time;
								b = storage;
							}
						}
						had = true;
					}
					if (had = false) {
						result[i][0] = number;
						result[i][1] = -1;
					}
				}
				time = 1;
			}
		}
		for (int i = 0; i < storage; i++) {
			if (result[i][0] != 0) {
				System.out.println(result[i][0] + " " + result[i][1]);
			} else {
				i = storage;
			}
		}
	}
}
