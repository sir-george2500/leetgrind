class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if(s.length() < p.length()) return result;


        int[] sCount = new int[26];
        int[] pCount = new int[26];

        for(int i = 0; i<p.length(); i++){
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }

        for(int i = 0; i<=s.length() - p.length(); i++){
            if(agsAreEqual(pCount,sCount)) result.add(i);


            // slide the windows 

            if(i + p.length() < s.length()){
                sCount[s.charAt(i) - 'a']--;
                sCount[s.charAt(i+p.length()) - 'a']++;
            }
        }

        return result;
    }

    public boolean agsAreEqual(int[] arr1 , int[] arr2){

        for(int i = 0; i< arr1.length; i++){
            if(arr1[i] != arr2[i]) return false;
        }

        return true;
    }
}