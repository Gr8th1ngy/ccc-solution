package canadian.computing.junior;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		int a;
		int d;
		Problem3 dice= new Problem3();
		//Scanner in= new Scanner(new FileReader("j3.1.in"));
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		
		int sessions=Integer.parseInt(in.readLine());
		for (int i=0; i<sessions; i++){
			BufferedReader playTimes= new BufferedReader(new InputStreamReader(System.in));
			
			StringTokenizer token = new StringTokenizer(playTimes.readLine());
			
			a=Integer.parseInt(token.nextToken());
			d=Integer.parseInt(token.nextToken());
			dice.result(a, d);
		}
		System.out.println(dice.getAntonia());
		System.out.println(dice.getDavid());
	}

}


class Problem3 {
	private int finalAntonia;
	private int finalDavid;

	public Problem3() {
		finalAntonia = 100;
		finalDavid = 100;
	}

	public void result(int a, int d) {
		if (a < d) {
			finalAntonia = finalAntonia - d;
		} else if (a > d) {
			finalDavid = finalDavid - a;
		} else {
		}
	}

	public int getAntonia() {
		return finalAntonia;
	}

	public int getDavid() {
		return finalDavid;
	}
}