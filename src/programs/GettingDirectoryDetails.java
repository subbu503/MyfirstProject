package programs;

public class GettingDirectoryDetails {

	public static void main(String[] args) 
	
	{
		String currentDirectory = System.getProperty("user.dir");
	    System.out.println("The current working directory is " + currentDirectory);
		
	}

}
