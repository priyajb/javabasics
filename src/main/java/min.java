
public class min {

	public static void main(String[] args) {
		int a[]= {1,4,5,7};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("minimum number is " + min);

	}

}
