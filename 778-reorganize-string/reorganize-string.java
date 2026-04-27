class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[26];

        for(char c : s.toCharArray()){
             freq[c - 'a']++;
        }

        // find the max Frequency Character 

        int maxFreq = 0 , maxChar = 0;

        int n = s.length();

        for(int i = 0; i<26; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                maxChar = i;
            }
        }

        if(maxFreq > (n+1)/2) return "";

        char[] result = new char[n];
        int idx = 0;

        while(freq[maxChar] > 0){
            result[idx] = (char) (maxChar + 'a');
            freq[maxChar]--;
            idx += 2;
        }

        for(int i = 0; i<26; i++){
            while(freq[i]>0){
                if(idx >= n) idx = 1;
                result[idx] = (char)(i + 'a');
                freq[i]--;
                idx += 2;
            }
        }

        return new String(result);


    }
}