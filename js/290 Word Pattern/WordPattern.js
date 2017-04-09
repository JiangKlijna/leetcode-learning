
/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 */
 /**
  * @param {string} pattern
  * @param {string} str
  * @return {boolean}
  */
var wordPattern = function(pattern, str) {
	 const data = str.split(" ");
	 if (pattern.length != data.length)
		 return false;
	 let map = {};
	 for (let i = 0; i < pattern.length; i++) {
		 const key = pattern.charCodeAt(i), s = map[key], data_i = data[i];
		 if (s == null) {
			 for (let k in map)
				 if (map[k] == data_i)
					 return false;
			 map[key] = data_i;
		 } else if (s != data_i) {
			 return false;
		 }
	 }
	 return true;
}
