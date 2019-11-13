package programs;

import java.util.HashSet;

public class RemoveDuplicatesFromString {

	static String str1=" ";
	public static void main(String[] args) 
	
	{
       String str="subbu";
      
       HashSet<Character> set=new HashSet<>();
       
       for(int i=0;i<str.length();i++)
       {
    	  // System.out.println(str.charAt(i));
    	   
    	   if(!set.contains(str.charAt(i)))
    			   {
    		            set.add(str.charAt(i));
    		         
    			   }
       }
       
       System.out.println(set);
	
	}

}
