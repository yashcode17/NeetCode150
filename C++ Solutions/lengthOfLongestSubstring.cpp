class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if (s.empty()) {
            return 0;
        }
        vector<bool> bitSet(256, 0);
        int result = 0;
        int left = 0, right = 0;

        while (left < s.size()) {
            if (right < s.size() && bitSet[s[right]] == 0) {
                // Mark the corresponding character as 1
                bitSet[s[right]] = 1;
                right++;
            } else {
                // Mark the corresponding character as 0
                bitSet[s[left]] = 0;
                left++;
            }
            result = max(result, right - left);
        }
        return result;
    }
};
