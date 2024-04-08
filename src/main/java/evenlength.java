
public class evenlength {

	public static void main(String[] args) {
		String str="hi hello good afternoon";
		
		String[] words=str.split(" ");
		for(String word:words)
		{
			if(word.length()%2==0)
			{
				System.out.println(word);
			}
		}

	}

}
