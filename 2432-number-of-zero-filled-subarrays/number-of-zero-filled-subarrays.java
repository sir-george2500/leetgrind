class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;

        int consecutiveZeros = 0; 

        for(int num: nums){
            if(num == 0){
                consecutiveZeros++;
            }else{
                consecutiveZeros = 0;
            }

            count += consecutiveZeros;
        }

        return count;
    }
}