// Source : https://leetcode.com/problems/compare-version-numbers/
// Author : jiangKlijna
/**
*165. Compare Version Numbers My Submissions QuestionEditorial Solution
*Compare two version numbers version1 and version2.
*If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
*
*You may assume that the version strings are non-empty and contain only digits and the . character.
*The . character does not represent a decimal point and is used to separate number sequences.
*For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
*
*Here is an example of version numbers ordering:
*0.1 < 1.1 < 1.2 < 13.37
*/
public class CompareVersionNumbers{

	public static void main(String[] args){
		System.out.println(compareVersion("1.1", "1.10"));//-1
		System.out.println(compareVersion("01", "1"));//0
		System.out.println(compareVersion("1.0", "1"));//0
		System.out.println(compareVersion("1.2", "1.2.5"));//-1
		System.out.println(compareVersion("1.5", "1.5.0"));//0
		System.out.println(compareVersion("6.2", "6"));//1
	}

	public static int compareVersion(String version1, String version2) {
		version1 = remove_start0(version1.trim());
		version2 = remove_start0(version2.trim());
		String[] version1s = version1.split("\\.");
		String[] version2s = version2.split("\\.");
		int i = 0;
		for(;i<version1s.length;i++){
			version1s[i] = remove_start0(version1s[i]);
			if(version2s.length == i){
				for(;i<version1s.length;i++){
					if(!"0".equals(remove_start0(version1s[i]))){
						return 1;
					}
				}
				return 0;
			}
			version2s[i] = remove_start0(version2s[i]);
			int v1length = version1s[i].length();
			int v2length = version2s[i].length();

			if(v1length > v2length){
				return 1;
			}else if(v1length < v2length){
				return -1;
			}else{
				int tag = compareNumber(version1s[i], version2s[i]);
				if(tag != 0){
					return tag;
				}
			}
		}
		for(;i<version2s.length;i++){
			if(!"0".equals(remove_start0(version2s[i]))){
				return -1;
			}
		}
		return 0;
	}
	/**
	*str1.length() == str2.length()
	*If str1 > str2 return 1, if str1 < str2 return -1, otherwise return 0.
	*/
	public static int compareNumber(String str1, String str2){
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		for(int i = 0;i<ch1.length;i++){
			if(ch1[i] > ch2[i]){
				return 1;
			}else if(ch1[i] < ch2[i]){
				return -1;
			}
		}
		return 0;
	}

	public static String remove_start0(String s){
		if(s.length()>1 && s.startsWith("0")){
			String[] ss = s.split("^[0]+");
			if(ss.length <= 1){
				return "0";
			}
			s = ss[1];
			if(s.startsWith(".")){
				s = "0" + s;
			}
		}
		return s;
	}

	public static String remove_end0(String s){
		if(s.length()>1 && s.endsWith("0")){
			String[] ss = s.split("[0]+$");
			s = ss[0];
			if(s.endsWith(".")){
				s = s + "0";
			}
		}
		return s;
	}
}