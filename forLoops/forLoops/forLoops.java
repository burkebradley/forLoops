package forLoops;

public class forLoops
	{

		public static void main(String[] args)
			{
				showGeniusOne();
				System.out.println();
				showGeniusTwo();
				showGeniusThree();
				showGeniusFour();
				showGeniusFive();
				showGeniusSix();

			}
		public static void showGeniusOne()
			{
			for (int i = 1; i < 6; i++)
				System.out.println(i);
			}
		public static void showGeniusTwo()
			{
			for (int i = 2; i < 11; i=i + 2) 
				{
					System.out.println("I love Mullen");
				}
			}
		public static void showGeniusThree()
			{
			for (int i = 1; i < 6; i++) 
				{ 
					System.out.print(i);
				}
			}
		public static void showGeniusFour()
			{
			for (int i = 10; i > 0; i--)
				{
					System.out.println(i);
				}
			System.out.println("LIFTOFF!");
				
			}
		public static void showGeniusFive()
			{
			for (int i = 5; i < 101; i=i+5)
				{
					System.out.println(i);
				}
			}
		public static void showGeniusSix()
		{
			
		}
	}
