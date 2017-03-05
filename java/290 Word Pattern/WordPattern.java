
/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 */
public class Solution {
	public boolean wordPattern(String pattern, String str) {
		String[] data = str.split(" ");
		if (pattern.length() != data.length)
			return false;
        java.util.Map<Character, String> map = new java.util.HashMap<Character, String>();
		for (int i = 0; i < pattern.length(); i++) {
			char key = pattern.charAt(i);
			String s = map.get(key);
			if (s == null) {
				if (map.containsValue(data[i]))
					return false;
				map.put(key, data[i]);
			} else if (!s.equals(data[i])) {
				return false;
			}
		}
		return true;
	}
}
