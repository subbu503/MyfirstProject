package programs;

public class StringOperations {

	public static void main(String[] args)
	
	{
		
		String str="GAYATRI GAUHAR";
		
		int stringLength = str.length();   //returns the length includling spaces
		
		System.out.println("string length : " + stringLength);  
		
		char[] ch=str.toCharArray();  // converts the string into character array
		
	    int arrayLenght= ch.length;
	    
	    System.out.println(arrayLenght);
	    
	    for(int i=0;i<arrayLenght;i++)
	    {
	    	System.out.println(ch[i]);
	    }
	    
	    String ss=" w3schools ";
	    String trimmedstring=ss.trim(); //remove the spaces in a string at the begining and ending
	    System.out.println(trimmedstring);
	    
	    char c=str.charAt(13);  //returns the character at specified index
	    System.out.println(c);
	    
	    String concatinaedstring= str.concat(" SUBRAHMANYAM"); //add two strings
	   
	    System.out.println(concatinaedstring);
		
	   boolean b=str.contains("H");  //returns boolean value if the particular character contains thae string
	   
	   System.out.println(b);
	   
	  int indexoffiinrstOccurance= str.indexOf('R'); // returns the index of the character at of first occurance
	  
	  System.out.println(indexoffiinrstOccurance);
		
	  int indexoflasttOccurance= str.lastIndexOf('R'); // returns the index of the character at of last occurance
	  
	  System.out.println(indexoflasttOccurance);
	  
	   String[] split=str.split(" "); //split the string into substrings based on regex
	   
	   for(int i=0;i<split.length;i++)
	   {
		   System.out.println(split[i]);
	   }
	   
	   String newstr=str.replace('R','K'); //replace the old character with new one
	   
	   System.out.println(newstr);
	   
	   String subsring=str.substring(8);
	   
	   System.out.println(subsring);
	   
	   String subsring2= str.substring(8, 14); //returns the substring from specified index to its last index-1
	   System.out.println(subsring2);
	   
	   System.out.println(str.replace("GA", "RG")); 
	  
	}

}

