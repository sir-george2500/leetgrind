class Solution {
public:
    vector<int> findDegrees(vector<vector<int>>& matrix) {
        int v = matrix.size();

        vector<int> degree(v,0);

        for(int i = 0; i < v; i++){
            for(int j = 0; j < matrix[i].size(); j++){
                if(matrix[i][j] == 1){
                    degree[j]++;
                }
            }
        }

        return degree;
    }
};