package algorithms.simples;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Your First Number:");
			int p = scanner.nextInt();
			System.out.println("Enter Your Second Number:");
			int q = scanner.nextInt();
			System.out.println("Recursive Approach Result:");
			System.out.println(recursiveGcd(p, q));
			System.out.println("Non Recursive Approach Result:");
			System.out.println(nonRecursiveGcd(p, q));
			
		} catch (Exception e) {
			System.out.println("GreatestCommonDivisor --> main " + e.getMessage());
		}
	}
	
	public static int recursiveGcd(int p, int q){
		if(q == 0) return p;
		else return recursiveGcd(q, p % q);
	}
	
	public static int nonRecursiveGcd(int p, int q){
		try {
			while(q != 0){
				int temp = q;
				q = p % q;
				p = temp;
			}
		} catch (Exception e) {
			System.out.println("GreatestCommonDivisor --> nonRecursiveGcd " + e.getMessage());
		}
		return p;
	}
}
