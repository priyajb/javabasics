

public class ArrayMerge {

	public static void main(String[] args) {
		int a[]= {2,1,3,5,0,1,0};
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[j]+" ");
				}
			}
		}
	}
	
	
}