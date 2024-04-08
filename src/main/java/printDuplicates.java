
public class printDuplicates {

	public static void main(String[] args) {
		int a[]= {1,2,3,3,4,4,5,2,6,7,8,9};
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[j] +" ");	
				}
				
			}
			
		}
	}
}