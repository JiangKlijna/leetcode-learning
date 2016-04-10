// Source : https://leetcode.com/problems/word-pattern/
// Author : jiangKlijna

/**
*Given a pattern and a string str, find if str follows the same pattern.
*Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
*Examples:
*pattern = "abba", str = "dog cat cat dog" should return true.
*pattern = "abba", str = "dog cat cat fish" should return false.
*pattern = "aaaa", str = "dog cat cat dog" should return false.
*pattern = "abba", str = "dog dog dog dog" should return false.
*Notes:
*You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
*/

public class WordPattern{
	public static void main(String[] args){
		System.err.println(wordPattern("abba", "dog cat cat dog"));
		System.err.println(wordPattern("abba", "dog cat cat fish"));
		System.err.println(wordPattern("aaaa", "dog cat cat dog"));
		System.err.println(wordPattern("abba", "dog dog dog dog"));
	}

	public static boolean wordPattern(String pattern, String str) {
		java.util.HashMap<Character, String> map = new java.util.HashMap<Character, String>();
		String[] data = str.split(" ");

		if(pattern.length() != data.length){
			return false;
		}

		for(int i = 0;i<pattern.length();i++){
			char key = pattern.charAt(i);
			String s = map.get(key);
			if(s == null){
				if(map.containsValue(data[i])){
					return false;
				}
				map.put(key, data[i]);
			}else if(!s.equals(data[i])){
				return false;
			}
		}
		return true;
	}
}