class Solution {
public:
    int findCenter(vector<vector<int>>& edges) {

        int n = edges.size()+1;
        vector<int>degree(n+1, 0);

        for(auto& edge:edges){
            int a = edge[0];
            int b = edge[1];

            degree[a]++;
            degree[b]++;
        }

        // finding the star 
        for(int s = 1; s <= n; s++){
            if(degree[s] == n-1){
                return s;
            }
        }

        return -1;
    }
};