
public class max {

	public static void main(String[] args) {
		int a[] ={1,3,66,77,2};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
			
		}
		System.out.println("maximum number is " +max );
	}
	

}
