
public class revstring {

	public static void main(String[] args) {
	String str="priya";
	String rev=" ";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println("reverse of a given string is " +rev);

	}

}
