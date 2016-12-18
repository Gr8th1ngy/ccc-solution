package junior;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Problem3 phrase = new Problem3();
		phrase.convert(in.nextLine());
		in.close();
	}

	public void convert(String input) {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u' || input.charAt(i) == ' ') {
				System.out.print(input.charAt(i));
			} else {
				System.out.print(input.charAt(i));
				if (input.charAt(i) == 'c' || input.charAt(i) == 'b') {
					System.out.print('a');
				} else if (input.charAt(i) == 'd' || input.charAt(i) == 'g' || input.charAt(i) == 'f') {
					System.out.print('e');
				} else if (input.charAt(i) == 'h' || input.charAt(i) == 'j' || input.charAt(i) == 'k'
						|| input.charAt(i) == 'l') {
					System.out.print('i');
				} else if (input.charAt(i) == 'm' || input.charAt(i) == 'n' || input.charAt(i) == 'p'
						|| input.charAt(i) == 'q' || input.charAt(i) == 'r') {
					System.out.print('o');
				} else {
					System.out.print('u');
				}
				if (input.charAt(i) == 'd') {
					System.out.print('f');
				} else if (input.charAt(i) == 'h') {
					System.out.print('j');
				} else if (input.charAt(i) == 'n') {
					System.out.print('p');
				} else if (input.charAt(i) == 't') {
					System.out.print('v');
				} else if (input.charAt(i) == 'z') {
					System.out.print('z');
				} else {
					for (int a=0;a<alphabet.length;a++){
						if (input.charAt(i)==alphabet[a]){
							System.out.print(alphabet[a+1]);
						}
					}
				}
			}
		}
	}

}
