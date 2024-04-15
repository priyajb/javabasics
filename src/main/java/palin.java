
public class palin {

	public static void main(String[] args) {
//		String str="malayalam";
//		String reverse="";
//		String copy=str;
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			reverse=reverse+str.charAt(i);
//		}
//		System.out.println(reverse);
//		if(copy.equals(reverse))
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
		
		int n=141,sum=0,copy=n,reminder;
		while(n>0) {
			reminder=n%10;
			sum=(sum*10)+reminder;
			n=n/10;
		}
		if(copy==sum)
		{
			System.out.println("palin");
		}
		else
			
		{
			System.out.println("not palin");
		}
		
	}
	
}