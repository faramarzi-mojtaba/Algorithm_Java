package algorithms.simples;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please Enter Your Number :");
			int number = scanner.nextInt();
			System.out.println("Your Number Is Prime Number : " + isPrime(number));
		} catch (Exception e) {
			System.out.println("Prime --> isPrime " + e.getMessage());
		}
		
	}
	public static boolean isPrime(int number){
		try {
			for(int i = 2; i * i < number; i++){
				if(number % i == 0)
					return false;
			}
		} catch (Exception e) {
			System.out.println("Prime --> isPrime " + e.getMessage());
		}
		return true;
	}

}
