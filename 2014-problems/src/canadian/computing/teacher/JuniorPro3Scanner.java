package canadian.computing.teacher;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JuniorPro3Scanner {
	{
		try {

			// Read data from j3.1.in
			Scanner in = new Scanner(new FileReader("j3.1.in"));

			int sessions = in.nextInt();
			System.out.println(sessions);

			int player1 = 100;
			int player2 = 100;

			int markP1 = 0;
			int markP2 = 0;

			for (int i = 0; i < sessions; i++) {

				markP1 = in.nextInt();
				markP2 = in.nextInt();

				if (markP1 > markP2)
					player2 = player2 - markP1;
				else
					player1 = player1 - markP2;
			}

			System.out.println("Player1: " + player1);
			System.out.println("Player2: " + player2);
			
			FileWriter wFile = new FileWriter("j3.1.out");

			/*wFile.write(player1);
			wFile.write(player2);*/
			
			wFile.write("Player1: " + player1 + "\n");
			wFile.write("Player2: " + player2 + "");
			wFile.flush();
			wFile.close();

			
	
		} catch (NumberFormatException e1) {

		} catch (IOException e) {
		}
	}

}
