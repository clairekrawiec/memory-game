import java.util.Scanner;
import java.util.ArrayList;
public class MemoryRunner
	{
		public static String [][] answers= new String[4][6];
		public static void main(String[] args)
			{
			game();

			}
		public static void display()
			{
				for(int row = 0; row < answers.length; row++)
					{
						
							for(int col = 0; col < answers[0].length; col++)
								{
									answers[row][col] = "   ";
								}
					}
				System.out.println("     1       2        3         4       5        6");
				System.out.println(" ------------------------------------------------------");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println("A|"+ answers[0][0] + "   |"+ answers[0][1] + "    | "+ answers[0][2] + "   |"+ answers[0][3] + "    |"+ answers[0][4] + "    |"+ answers[0][5] +"    |");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println(" ------------------------------------------------------");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println("B|"+ answers[1][0] + "   |"+ answers[1][1] + "    |"+ answers[1][2] + "    |"+ answers[1][3] + "    |"+ answers[1][4] + "    |"+ answers[1][5] + "    |");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println(" ------------------------------------------------------");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println("C|"+ answers[2][0] + "   |"+ answers[2][1] + "    |"+ answers[2][2] + "    |"+ answers[2][3] + "    |"+ answers[2][4] + "    |"+ answers[2][5] + "    |");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println(" ------------------------------------------------------");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println("D|"+ answers[3][0] + "   |"+ answers[3][1] + "    |"+ answers[3][2] + "    |"+ answers[3][3] + "    |"+ answers[3][4] + "    |"+ answers[3][5] + "    |");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println(" ------------------------------------------------------");
			}
		public static void game()
		{
			answers [0][0] = "duck";
			answers [0][1] = "lion";
			answers [0][2] = "wolf";
			answers [0][3] = "seal";
			answers [0][4] = "bear";
			answers [0][5] = "bull";
			answers [1][0] = "buck";
			answers [1][1] = "deer";
			answers [1][2] = "oxen";
			answers [1][3] = "mole";
			answers [1][4] = "cats";
			answers [1][5] = "dogs";
			answers [2][0] = "bear";
			answers [2][1] = "oxen";
			answers [2][2] = "dogs";
			answers [2][3] = "duck";
			answers [2][4] = "deer";
			answers [2][5] = "bull";
			answers [3][0] = "lion";
			answers [3][1] = "seal";
			answers [3][2] = "cats";
			answers [3][3] = "mole";
			answers [3][4] = "wolf";
			answers [3][5] = "buck";
			display();
			
			System.out.println("please type a location");
			System.out.println("for example A1");
			Scanner userInput = new Scanner(System.in);
			String bwa = userInput.nextLine();
			switch (bwa.substring(0,1))
				{
				case "a":
				case "A":
					rowChoice = 0;
					break;
				case "b":
				case "B":
					rowChoice = 1;
					break;
				case "c":
				case "C":
					rowChoice = 2;
					break;
				case "d":
				case "D":
					rowChoice = 3;
					break;
				}
			int colChoice=Integer.parseInt(bwa.substring(1))-1;
			System.out.println(answers[rowChoice][colChoice]);
			display();
		}
		
	}
	
