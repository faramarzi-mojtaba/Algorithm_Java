package algorithms.simples;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please Enter Your Number :");
			int number = scanner.nextInt();
			System.out.println("Recursive Approach Result:");
			System.out.println("2 ^ "+ number + " is : " +recursivePower(number));
			System.out.println("Non Recursive Aproach Result:");
			System.out.println("2 ^ "+ number + " is : " +nonRecursivePower(number)); 
			
		} catch (Exception e) {
			System.out.println("PowerOfTwo --> main " + e.getMessage());
		}
		
	}
	public static long recursivePower(int n){
		if(n == 0) return 1;
		else if(n == 1) return 2;
		else return recursivePower(n -1) * 2;
	}
	public static long nonRecursivePower(int n){
		int[] array =new int[n + 1];
		try {
			array[0] = 1;
			for(int i = 1; i <= n; i++){
				array[i] = array[i - 1] * 2;
			}
		} catch (Exception e) {
			System.out.println("PowerOfTwo --> nonRecursivePower " + e.getMessage());
		}
		return array[n];
	}

}
