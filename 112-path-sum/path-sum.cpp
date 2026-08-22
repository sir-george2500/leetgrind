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
    bool hasPathSum(TreeNode* root, int targetSum) {

       if(!root) return false;


       queue<pair<TreeNode*,int>> que;
       que.push({root,targetSum - root->val});

       while(!que.empty()){
        auto[node, rem] = que.front();
        que.pop();

        if(!node->left && !node->right){
            if(rem == 0) return true;
        }

        if(node->left) que.push({node->left, rem - node->left->val});
        if(node->right) que.push({node->right, rem - node->right->val});
       }

       return false;

       
    }
};