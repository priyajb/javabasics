
public class countCharacter {

	public static void main(String[] args) {
		String string="hi hello good evening";
		int count=0;
		for(int i=0;i<string.length();i++)
		{
		if(string.charAt(i)!=' ')
		{
			count++;
		}
			
		}
		System.out.println("count is " +count);

	}

}

