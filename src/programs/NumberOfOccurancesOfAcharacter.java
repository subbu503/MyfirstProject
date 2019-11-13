package programs;

import java.util.HashMap;

public class NumberOfOccurancesOfAcharacter {

	    public static void main(String[] args) {
		
		String str="subrahmanyam";
		
		char ch[]=str.toCharArray();
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++)
		{
		   if(map.containsKey(ch[i]))
		   {
			   map.put(ch[i],map.get(ch[i])+1);
		   }
		   else
		   {
			   map.put(ch[i],1);
		   }
		}
		System.out.println(map);
		
		
	}

}
