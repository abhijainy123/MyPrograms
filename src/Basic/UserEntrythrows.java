package Basic;
import java.util.Scanner;
public class UserEntrythrows {

	
	public static void main(String[] args) throws Exception{
		UserEntrythrows add = new UserEntrythrows();
		try {
			add.addition();
		}
		catch(Exception ex) {
			System.out.println("Input of Type Integer is allowed. Please provide your number again");
			add. addition();
		}
	}
		
		public void addition() throws Exception
		{
			Scanner keyboard = new Scanner(System.in);
			int Num1;
			int Num2;
			
				System.out.println("What is your 1st Number");
				Num1 = keyboard.nextInt();
				System.out.println("What is your 2nd Number");
				Num2 = keyboard.nextInt();
				int Sum = Num1 + Num2;	
				System.out.println("Sum of you number " + Num1 + " & " + Num2 + " is " + Sum);
				keyboard.close();
		}
	
	}
	


