import java.util.InputMismatchException;
import java.util.Scanner;

public class DogTest {

	public static void main(String[] args) {
		Dog dog =new Dog();
		System.out.println(" ‰»Îπ∑µƒƒÍ¡‰:");
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		try {
			dog.setAge(age);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("fjjf");
		}
		
		System.out.println(dog.getAge());
	}
}
