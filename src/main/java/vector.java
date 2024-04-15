import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    
//		Vector<Integer> vector=new Vector<Integer>();
//		vector.add(2);
//		vector.add(9);
//		vector.add(3);
//		vector.add(8);
//		
//	int n=Collections.max(vector);
//	Collections.sort(vector);
//	int index=Collections
//	.binarySearch(vector,3);
//	System.out.println("element found at "+index);
//	
//	System.out.println("Maximum value in this vector list is "+n);
		
		
//		LinkedList<Integer> list=new LinkedList<Integer>();
//		list.add(67);
//		list.add(3456);
//		list.add(90);
//		list.add(34);
//		list.add(56);
//		
//		System.out.println(list);
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println("elements in this list is "+list.get(i));
//		}
//		System.out.println("before");
//		String players[]= {"sachin","dhoni","raina","samson"};
//		System.out.println(Arrays.toString(players));
//		System.out.println("after");
//		List pllist=Arrays.asList(players);
////		System.out.println(pllist);
//		List<Integer> list=new LinkedList<Integer>();
//		list.add(9);
//		list.add(9);
//		list.add(9);
//		list.add(9);
//		int n=Collections.min(list);
//		int m=Collections.max(list);
//		if(n==m)
//			{
//			System.out.println("all elements are equal");
//			}
//		else
//		{
//			System.out.println("minimum value is " +n);
//			System.out.println("maxmimum value is " +m);
//		}
//
//}}
		
//		
//		List<String> list=new ArrayList<String>();
//		list.add("dhoni");
//		list.add("raina");
//		list.add("virat");
//		list.add("pandya");
//		System.out.println("elements in the list are:" +list);
//		Collections.reverse(list);
//		System.out.println("reverse of the elements: "+list);
		
//    Map<String, String> map=new HashMap<String, String>();
//    map.put("1", "hi");
//    map.put("2", "hello");
//    map.put("3","good");
//    map.put("4", "evening");
//    System.out.println(map);
//    
//    for(Map.Entry<String, String> set:map.entrySet()) {
//    	System.out.println(set.getKey()+ "="+set.getValue()	);
		
		ArrayList<Integer> arli=new ArrayList<Integer>();
		arli.add(1);//1,5,9,6,3,2
		arli.add(5);
		arli.add(9);
		arli.add(6);
		arli.add(3);
		arli.add(2);
		
		System.out.println(arli);
		
		List<Integer> list=arli.subList(1, 4);
		System.err.println(list);
    }
    }
