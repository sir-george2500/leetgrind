class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i < n - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int target = -nums[i];
            Set<Integer> seen = new HashSet<>();

            for(int j = i+1; j < n; j++){
                int complement = target - nums[j];

                if(seen.contains(complement)){
                    list.add(Arrays.asList(nums[i], complement, nums[j]));

                    while(j + 1 < n && nums[j] == nums[j + 1]) j++;
                }

                seen.add(nums[j]);
            }
        
        } 

        return list;
    }
}