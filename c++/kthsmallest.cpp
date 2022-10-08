class Solution {
public:
    void Smallestkth(TreeNode* root,int &k,int& ans)
    {
        if(root==NULL)
            return ;
        
        Smallestkth(root->left,k,ans);
        
        
        k--;
        if(k==0)
            ans=root->val;
        
        return Smallestkth(root->right,k,ans);
    }
    int kthSmallest(TreeNode* root, int k) {
        int ans=-1;
        Smallestkth(root,k,ans);
        return ans;
    }
};

https://leetcode.com/problems/kth-smallest-element-in-a-bst/
