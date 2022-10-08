class Solution {
public:
    
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
          if(!root || !p || !q) return nullptr;
        
        if(root==p || root==q) return root;
        
        TreeNode* left = lowestCommonAncestor(root->left, p, q);
        TreeNode* right = lowestCommonAncestor(root->right, p, q);
        
        // p and q exists in left/right subtree separatedly.
        if(left && right) return root;
        
        // If only one is true, both node exists in that subtree, hence the ancestor
        return left?left:right;
        
    }
};
https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
