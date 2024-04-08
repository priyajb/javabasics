

public class count {

	public static void main(String[] args) {

     String str="hihellogoodeveining";
     char ch='i';
     int count =0;
     for(int i=0;i<str.length();i++)
     {
    	 if(ch==str.charAt(i))
    	 {
    		count++; 
    	 }
     }
      System.out.println("count is " +count);
	}

}
