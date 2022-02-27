import java.util.*;

class Sahan {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("---- Grade displayer----");// program name
		System.out.print("Enter your student name : ");
		String s_name = input.nextLine();// get student name
		System.out.print("Enter your marks: ");
		int s_mark = input.nextInt();// student marks are must integer

		System.out.println("-----------------------");
		System.out.println("student name is : " + s_name);
		System.out.print("Your final grade is : ");

		if (s_mark >= 100) {
			System.out.println("invalid marks");// marks cannot over 100
		} else if (s_mark >= 75) {
			System.out.println("A");
		} else if (s_mark >= 65) {
			System.out.println("B");
		} else if (s_mark >= 55) {
			System.out.println("c");
		} else if (s_mark >= 40) {
			System.out.println("D");
		} else if (s_mark > 0) {
			System.out.println("F");
		} else {
			System.out.println("Invalid mark");// marks cannot be minus
		}

	}
}
