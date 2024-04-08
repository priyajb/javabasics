import java.util.Scanner;

public class occurances {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		System.out.println("Enter the character you want to find the occurences of: ");
		char cho = sc.next().charAt(0);
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			if(cho == str.charAt(i)) {
				count++;
			}
		}
//		for(char c : str.toCharArray()) {
//			if(cho == c) {
//				count++;
//			}
//		}
		System.out.println("Count of character " + cho + " is " + count);
	}

}
