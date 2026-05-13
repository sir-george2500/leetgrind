class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> mp;

        int left = 0;

        int total = 0;

        for(int right = 0; right<s.size(); right++){
            while(mp.count(s[right])){
                mp.erase(s[left]);
                left++;
            }
            mp[s[right]] = right;
            total = max(total,right - left+1);
        }

        return total;
    }
};