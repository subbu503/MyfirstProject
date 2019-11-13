package programs;

import java.util.ArrayList;

public class CompareTwoStrings {

	public static void main(String[] args)

	{

		String s1 = "ASPIRE";
		String s2 = "SYSTEMS";

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		
		ArrayList<Character> arr = new ArrayList<>();

		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if (ch1[i] == ch2[j]) {
					if (!arr.contains(ch1[i])) 
					{
					  	arr.add(ch1[i]);
					}
				}
			}
		}

		System.out.println(arr);

	}
}
