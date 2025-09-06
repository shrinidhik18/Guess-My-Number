import java.util.*;

public class GuessMyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random rand = new Random();
		int compno = rand.nextInt(10);
		while(true)
		{
			System.out.println("enter one number btween 1 and 10:");
			int myguess = sc.nextInt();
			if (myguess==compno)
			{
				System.out.println("Your guess no:"+myguess+"is correct");
				break;
			}
			if(myguess<compno)
			{
				System.out.println("your guess no:"+myguess+"is lower");
			}
			else
				System.out.println("your guess no:"+myguess+"is higher");
			}
		sc.close();
		}

	}



