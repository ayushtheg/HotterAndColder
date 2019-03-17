import java.util.Scanner;
public class GuessName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		gesNum(input, "Guess what number I am!");
	}
	public static void gesNum(Scanner console, String prompt) {
		int guess = 0;
		int i = 0;
		int x = (int)(Math.random() * 1000) + 1;	
		System.out.println(x);
		System.out.println(prompt);
		while (guess != x) {
			i++;
			guess = console.nextInt();
			if (guess < x) {
				System.out.println("Hotter");
			} else if (guess > x) {
				System.out.println("Colder");
			}  
		}
		System.out.println("Good job! It only took ya " + i + " times");
	}
}
