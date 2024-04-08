

public class ArrayMerge {

	public static void main(String[] args) {
		int a[]= {2,5,7,0,3};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(b[i] + " ");
		}
	}
}