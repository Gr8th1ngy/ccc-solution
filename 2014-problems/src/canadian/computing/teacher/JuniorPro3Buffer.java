package canadian.computing.teacher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class JuniorPro3Buffer {

	{

		try {
			// Read data from j3.1.in
			//BufferedReader in = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\resource\\j3.1.in"));
			
			BufferedReader in = new BufferedReader(new FileReader("j3.1.in"));
			
			BufferedWriter out = new BufferedWriter(new FileWriter("acb"));
			
			FileWriter d = new FileWriter("acb");
			d.write("hello");
			d.write("happy");
		
			d.write('r');
			d.write("mchesterunit",2,6);
			d.flush();
			d.close();
			
			int sessions = Integer.parseInt(in.readLine().trim());
			System.out.println(sessions);
			
			int player1 = 100;
			int player2 = 100;
			
			int markP1=0;
			int markP2=0;
			
			for (int i = 0; i < sessions; i++) {
				
				StringTokenizer token = new StringTokenizer(in.readLine());
				
				markP1 = Integer.parseInt(token.nextToken());
				markP2 = Integer.parseInt(token.nextToken());
				
				if(markP1>markP2)
					player2= player2 - markP1;
				else
					player1 = player1- markP2;
			}
			
			System.out.println("Player1: " + player1);
			System.out.println("Player2: " + player2);
			
		} catch (NumberFormatException e) {

		} catch (IOException e) {
		}
	}

}
