import java.util.Scanner;
public class CustomAdventure {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your username: ");
	String user = sc.next();
	
	System.out.println("Welcome to "+user+"'s adventure!");
	
	System.out.println("For this adventure, you can choose between being the resident assistant at one of the fraternity houses "
			+ "on campus or one of the residents in the freshman dorm. Enter RA to be the resident assistant or R to be the resident");
	user = sc.next();
	if (user.equals("RA"))
	{
		System.out.println("Wise choice.");
		System.out.println("Upon being placed in the frat house, you immediately begin calculating whether you can live without the financial "
				+ "benefits of being an RA. Enter N if you do not want to transfer and Y if you do want to transer ");
		user=sc.next();
		if (user.equals("Y"))
		{
			System.out.println("Nice try, you aren't going anywhere.");
			System.out.println();
			System.out.println("You meet your residents and they seem like nice enoug people. Enter A to give them a fake phone number, "
					+ "B to give them a fake name, and C to give them actual contact information.");
			user=sc.next();
			if (user.equals("A"))
				System.out.println("Nice. The one bad part about this is those guys definitely need help not doing stupid stuff.");
			else if (user.equals("B"))
				System.out.println("You gave them the name of your brother who goes to school out of state.");
			else if (user.equals("C"))
			{
				System.out.println("I see that you want to actually do your job. Very well.");
				System.out.println();
			}
		}
		else if (user.equals("N"))
		{
			System.out.println("Get comfy and try to fly under the radar this year.");
			System.out.println();
			System.out.println("The frat members are determined to their hazing ritual despite that being such a bad idea. "
					+ "They offer you three bottles of gin and entrance to any of their activities. Enter Y for yes or N for no.");
			user=sc.next();
			if (user.equals("Y"))
			{
				System.out.println("Bad news: the minute you walked into the first party of the year, someone "
						+ "took a picture of you and sent it to your boss. So you're no longer an RA :(");
			}
			else if (user.equals("N"))
			{
				System.out.println("Since you were a buzzkill, the fraternity brothers planted many bad things "
						+ "in your room and called the police. You're actually in prison now.");
			}
			
		}
	}
	else if (user.equals("R"))
	{
		System.out.println("Sorry, freshmen are irrelevant.");
	}
}
}
