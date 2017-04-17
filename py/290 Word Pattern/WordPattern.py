
# Given a pattern and a string str, find if str follows the same pattern.
# Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
class Solution(object):
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        data = str.split(' ')
        if len(pattern) != len(data):
            return False
        map = {}
        for key, data_i in zip(pattern, data):
            s = map.get(key)
            if s == None:
                if data_i in map.values():
                    return False
                map[key] = data_i
            elif not s == data_i:
                return False
        return True
