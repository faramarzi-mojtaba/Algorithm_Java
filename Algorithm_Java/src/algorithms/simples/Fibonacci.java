package algorithms.simples;

import java.util.Scanner;
/**
 * <b>Fibonacci Algorithm in a recursive way and a non recursive way with using array.</b>
 * The Fibonacci sequence for 5 is : 1, 2, 3, 5, 8
 * @see <a href ="http://www.en.wikipedia.org/wiki/Fibonacci_number">Fibonacci sequence</a>
 * @author Mojtaba
 */
public class Fibonacci {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Your Number Please:");
			int number = scanner.nextInt();
			System.out.println("Recersive Result:");
			for(int i =1;i <= number; i++){
				if(i != number)
					System.out.print(fibo(i) + ", ");
				else
					System.out.print(fibo(i)+ "\n");
			}
			System.out.println("Non Recursive Result:");
			nonRecursiveFibo(number);
		} catch (Exception e) {
			System.out.println("Fibonacci --> main " + e.getMessage());
		}

	}
	/**
	 * <b>Big o notation is O(2^n) if we use recursive approach</b>
	 * @param n Fibonacci sequence number
	 * @return the result of Fibonacci
	 */
	public static int fibo(int n){	
		if(n == 1 || n == 2)
			return 1;
		else
			return fibo(n - 1) + fibo(n -2);
	}
/**
 * Big O notation will be n if we use array for Fibonacci sequence calculation
 * @param n Fibonacci number
 */
	public static void nonRecursiveFibo(int n){
		try {
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				if(i == 0 || i == 1){
					array[i] = 1;
				}else
					array[i] = array[i - 1] + array[i - 2];
			}
			for (int i = 0; i < array.length; i++) {
				if(i != array.length -1)
					System.out.print(array[i] + ", ");
				else
					System.out.print(array[i]);
			}
		} catch (Exception e) {
			System.out.println("Fibonacci --> nonRecursiveFibo " + e.getMessage());
		}
	}

}
