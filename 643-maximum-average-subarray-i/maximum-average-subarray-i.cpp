#include <bits/stdc++.h>
using namespace std;


class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int window = 0;

        for(int i = 0; i < k; i++) window += nums[i];

        int total = window;

        for(int i = k; i<nums.size(); i++){
            window += nums[i];
            window -= nums[i-k];

            // update 
            total = max(window,total);
        }

        return (double) total/k;
    }
};