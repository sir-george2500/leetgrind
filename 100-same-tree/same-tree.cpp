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
    bool isSameTree(TreeNode* p, TreeNode* q) {
        queue<pair<TreeNode*, TreeNode*>> que;

        que.push({p, q});
        
        while(!que.empty()){
            auto[a, b] = que.front();
            que.pop();
            // solve
            // both are empty 
            if(a == nullptr  &&  b == nullptr) continue;
            // one empty while the other isn't
            if(a == nullptr || b == nullptr) return false;
            if(a->val != b->val) return false;
            // solve end
            que.push({a->left, b->left});
            que.push({a->right, b->right});
        }

        return true;
    }
};