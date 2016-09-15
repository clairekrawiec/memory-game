
public class Board
	{
		public static String [][] answers= new String[4][6];
		public static void main(String[] args)
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
				
				
				

				

			}
		public static void display()
			{
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
		public static void blankBoard()
			{
				
				System.out.println("     1       2        3         4       5        6");
				System.out.println(" ------------------------------------------------------");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println("A|       |        |        |        |        |        |");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println(" ------------------------------------------------------");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println("B|       |        |        |        |        |        |");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println(" ------------------------------------------------------");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println("C|       |        |        |        |        |        |");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println(" ------------------------------------------------------");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println("D|       |        |        |        |        |        |");
				System.out.println(" |       |        |        |        |        |        |");
				System.out.println(" ------------------------------------------------------");
				
			}

	}
