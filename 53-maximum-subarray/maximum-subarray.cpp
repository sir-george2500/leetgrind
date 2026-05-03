class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxCurrent = 0;
        int maxSoFar = nums[0];

        int n = nums.size();

        for(int i = 0; i<n; i++){

            if(nums[i] > maxCurrent + nums[i]){
                maxCurrent = nums[i];
            }else{
                maxCurrent += nums[i];
            }

            if(maxCurrent > maxSoFar){
                maxSoFar = maxCurrent;
            }
        }

        return maxSoFar;
    }
};