#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int prefix = 0;

        unordered_map<int,int> mp;
        int maxLen = 0; 
        mp[0] = -1;

        for(int i = 0;i<nums.size(); i++){
            prefix += (nums[i] == 1) ? 1 : -1;

            if(mp.count(prefix)){
                maxLen = max(maxLen, i - mp[prefix]);
            }else{
                mp[prefix] = i;
            }
        }
        return maxLen;
    }
};