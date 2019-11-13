package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharactersInAstring {

	public static void main(String[] args)

	{

		String str = "subbu";

		char ch[] = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entries = map.entrySet();

		for (Map.Entry<Character, Integer> entry : entries) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}

	}

}
