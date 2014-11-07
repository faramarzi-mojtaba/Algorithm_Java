package algorithms.simples;
import java.util.Scanner;

public class PrimeCounter {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in) ) {
			System.out.println("Please Enter Your Number :");
			int number = scanner.nextInt();
			int counter = 0;
			for(int i = 2; i < number; i++){
				if(Prime.isPrime(i))
					counter++;
			}
			System.out.println("The number of Prime number less than " + number + " is : "+counter);
			
		} catch (Exception e) {
			System.out.println("PrimeCounter --> main "+e.getMessage());
		}
	}
}
