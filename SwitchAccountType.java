
import java.util.Scanner;

public class SwitchySwitch {
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your role: ");
		
		
		for (int chance = 0; chance<3 ; chance ++){
			String user_role = keyboard.next();
		switch (user_role) {
		case "administrator":
			System.out.print("Welcome Administrator");
			break;
		case "faculty":
			System.out.print("Welcome Faculty");
			break;
		case "student":
			System.out.print("Welcome Student");
			break;
		case "staff":
			System.out.print("Welcome Staff");
			break;
		case "guest" :
			System.out.print("Welcome Guest");
			break;
		
			default:
				System.out.print("Invalid Role \n" +
			                       "Enter the correct Role \n");
				break;
			
		}		
		}		
	keyboard.close();

	}	
}

