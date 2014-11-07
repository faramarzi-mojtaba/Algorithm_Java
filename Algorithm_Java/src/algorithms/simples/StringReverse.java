package algorithms.simples;
import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please Enter Your String ");
			String str = scanner.nextLine();
			System.out.println("Recursive Approach Result:");
			System.out.println(recursiveReverse(str));
			System.out.println("Non Recursive Approach Result:");
			System.out.println(nonRecursiveReverse(str));
		} catch (Exception e) {
			System.out.println("StringReverse --> main " + e.getMessage());
		}
	}
	public static String recursiveReverse(String str){
		if(str.length() < 2) return str;
		else return recursiveReverse(str.substring(1)) + str.charAt(0);
	}
	public static String nonRecursiveReverse(String str){
		String result = "";
		try {
			for(int i = str.length() - 1; i >= 0; i--){
				result += str.charAt(i);
			}
		} catch (Exception e) {
			System.out.println("StringReverse --> nonRecursiveReverse " + e.getMessage());
		}
		return result;
	}

}
