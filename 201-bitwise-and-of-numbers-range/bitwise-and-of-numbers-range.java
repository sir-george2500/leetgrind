class Solution {
    public int rangeBitwiseAnd(int left, int right) {

        // try find the common prefix
        int shift = 0;



       while(left != right){
            left >>=1;
            right >>= 1;

            shift++;
       }

       // shifting left once I find the prefix 
       return left << shift++;

    }
}