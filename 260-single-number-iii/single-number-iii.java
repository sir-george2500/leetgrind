class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num: nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        int[] result = new int[2];
        int idx = 0;

        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            if(entry.getValue() == 1){
                result[idx++] = entry.getKey();
            }
        }

        return result;
    }
}