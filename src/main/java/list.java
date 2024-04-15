import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		List<String> ls=new ArrayList<String>();
		ls.add("priya");
		ls.add("1");
		ls.add(null);
		ls.add("0");
		System.out.println(ls);
		System.out.println(ls.get(2));
		System.out.println(ls.remove(0));
		System.out.println(ls);
		System.out.println(ls.contains("0"));

	}

}
