import java.util.ArrayList;

public class findoddandeven {

	public static void main(String[] args) {
	 int a[]= {1,3,5,8,2,9,0,45,78};
	 ArrayList<Integer> array1=new ArrayList<Integer>();
	 ArrayList<Integer> array2=new ArrayList<Integer>();
	 
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]%2==0)
		 {
			 array1.add(a[i]);
		 }
		 else
		 {
			 array2.add(a[i]);
		 }
	 }
	 System.out.println("even numbers are:");
	 for(int number:array1)
	 {
		
		 System.out.println(number);
	 }
	 System.out.println("\n");
	 System.out.println("odd numbers are:");
	 for(int number:array2)
	 {
		
		 System.out.println(number);
	 }

	}

}
