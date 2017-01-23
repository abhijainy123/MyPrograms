package Basic;
import java.util.Scanner;
public class UserEntry {

	public static void main(String[] args) {
		
		addition();
	}
		
		public static void addition()
		{
			Scanner keyboard = new Scanner(System.in);
			int Num1;
			int Num2;
			try{
				System.out.println("What is your 1st Number");
				Num1 = keyboard.nextInt();
				System.out.println("What is your 2nd Number");
				Num2 = keyboard.nextInt();
				int Sum = Num1 + Num2;	
				System.out.println("Sum of you number " + Num1 + " & " + Num2 + " is " + Sum);
			}
			catch (Exception ex){
				System.out.println("Input must be an Integer");
			}
			
			keyboard.close();
		}
	
	}
	


