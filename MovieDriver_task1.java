/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Sebastian Black
*/

package Movie.java;
import java.util.Scanner;

public class MovieDriver_task1 
{
	public static void main(String[] args)
	{
		try (// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in)) {
				 System.out.println("Please enter the name of a movie");
					String title = keyboard.nextLine();
					System.out.println("What is the rating of this movie");
					String rating = keyboard.nextLine();
					System.out.println("Please enter then number of tickets sold for this movie");
					int soldTickets = keyboard.nextInt();keyboard.nextLine();
					
		}
	 System.out.print("Goodbye!");
	 }
}
