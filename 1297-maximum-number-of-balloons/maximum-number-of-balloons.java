class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> textCount = new HashMap<>();

        for(char c: text.toCharArray()){
            textCount.merge(c,1,Integer::sum);
        } 

        String target = "balloon";

        Map<Character, Integer> targetCount = new HashMap<>();

        for(char c : target.toCharArray()){
            targetCount.merge(c,1,Integer::sum);
        }

        int result = Integer.MAX_VALUE;

        for(Map.Entry<Character,Integer> entry:targetCount.entrySet()){
            int supply = textCount.getOrDefault(entry.getKey(),0);
            int demand = entry.getValue();

            result = Math.min(result, supply / demand);
        }

        return result;
    }
}