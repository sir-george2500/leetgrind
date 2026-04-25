class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] sMap = new int[256];
        int[] tMap = new int[256];

        for(int i = 0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(sMap[c1] == 0 && tMap[c2] == 0){
                sMap[c1] = c2;
                tMap[c2] = c1;
            }else{
                if(sMap[c1] != c2 || tMap[c2] != c1) return false;
            }
        }
        return true;
    }
}