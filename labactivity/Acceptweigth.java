import java.util.Scanner;

public class Acceptweigth {
	public static void display() {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Weight");
			int weight = s.nextInt();
			if(weight<20)
			

			try
			{
					throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println(" allowed only 20kg..");
			}
			else
			{
				System.out.println(" not allowed above 20kg..");
			}
		}
			public static void main(String args[])
			{
			Acceptweigth aw=new Acceptweigth();
			aw.display();
			}
			}