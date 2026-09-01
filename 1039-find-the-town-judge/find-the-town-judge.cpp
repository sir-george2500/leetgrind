class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
        vector<int> outdegree(n+1, 0);
        vector<int> indegree(n+1, 0);

        for(auto& edge:trust){
            int a = edge[0];
            int b = edge[1];

            outdegree[a]++;
            indegree[b]++;
        }

        for(int p = 1; p <=n; p++){
            if(indegree[p] == n-1 && outdegree[p] == 0) return p;
        }

        return -1;
    }
};