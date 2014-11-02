package algorithms.simples;

import java.util.Scanner;
/**
 * <b>371 is a Armestrang number because: 3*3*3+7*7*7+1*1*1 is 371</b>
 * @author Mojtaba
 *
 */
public class ArmstrongNumber {

	public static void main(String args[]) {

		try(Scanner scanner = new Scanner(System.in)) {
			//input number to check if it is an Armstrong number or not
			System.out.println("Please enter a 3 digit number to find if its an Armstrong number:");
			int number = scanner.nextInt();

			//printing result
			if(isArmstrong(number)){
				System.out.println("Number : " + number + " is an Armstrong number");
			}else{
				System.out.println("Number : " + number + " is not an Armstrong number");
			}
		} catch (Exception e) {
			System.out.println("Armstrong --> main "+e.getMessage());
		}
	}
	/**
	 * 
	 * @param number that need to observe 
	 * @return true, if number is Armstrong number otherwise return false
	 */
	private static boolean isArmstrong(int number) {
		try {
			int result = 0;
			int orig = number;
			while(number != 0){
				int remainder = number%10;
				result = result + remainder*remainder*remainder;
				number = number/10;
			}
			//number is Armstrong return true
			if(orig == result){
				return true;
			}
		} catch (Exception e) {
			System.out.println("Armstrong --> isArmstrong "+e.getMessage());
		}
		return false;
	}
}
