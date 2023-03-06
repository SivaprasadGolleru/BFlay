import java.util.Scanner;

public class ButterFlayPattern
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter The Size Of The ButterFly To Create");
		int B = scan.nextInt();
		/*Up Pattern*/
		for (int i = 1; i <=B; i++) 
		{
			for (int j = 1; j <=i; j++)
			{
				System.out.print("*");
			}
			for (int j = (B-1); j >=i; j--)
			{
				System.out.print(" ");
			}
			for (int j = (B-1); j >=i; j--)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}



		/*Down Pattern*/

		for (int i = 1; i <=B; i++) 
		{
			for (int j = B; j >=i; j--)
			{
				System.out.print("*");
			}
			for (int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<i; j++)
			{
				System.out.print(" ");
			}

			for (int j=B; j >=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}