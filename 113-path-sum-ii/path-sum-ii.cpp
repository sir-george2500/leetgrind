/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        vector<vector<int>> res;
        vector<int> path;
        dfs(res, path, targetSum,0, root);
        return res;
    }

    void dfs(vector<vector<int>> &res, vector<int> &path, int targetSum, int currSum, TreeNode* node){

        if(!node) return;
        
        currSum += node->val;
        path.push_back(node->val);
        // base case
        if(!node->left && !node->right && currSum == targetSum) res.push_back(path);

        if(node->left) dfs(res,path, targetSum, currSum, node->left);
        if(node->right) dfs(res,path, targetSum, currSum, node->right);

        path.pop_back();

    }
};