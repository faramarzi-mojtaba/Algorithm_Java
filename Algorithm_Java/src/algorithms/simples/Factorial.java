package algorithms.simples;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			int input = scanner.nextInt();
			if(input > 0){
			System.out.println("Recursive approach:");
			System.out.println(recursiveFactorial(input));
			
			System.out.println("Non Recursive approach:");
			System.out.println(nonRecursive(input));
			}else{
				System.out.println("Please enter proper number!");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	public static int recursiveFactorial(int n){
		if(n != 1)
			return recursiveFactorial(n - 1) * n;
		else
			return 1;
	}
	public static long nonRecursive(int num){
        int result = 1;
        if (num == 1)
            result = 1;
        else
        {
            for(int i = num; i > 0; i--){
                result *= num;
                num--;
            }
        }
        return result;
    }

}
