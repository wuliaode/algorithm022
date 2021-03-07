 //105. 从前序与中序遍历序列构造二叉树
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return create(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode create(int[] preorder,int l1,int r1,int[] inorder,int l2,int r2){
        if(l1>r1) return null;
        int val = preorder[l1], i=0;
        TreeNode node = new TreeNode(val);
        while(inorder[l2+i]!=val) i++;
        node.left = create(preorder,l1+1,l1+i,inorder,l2,l2+i-1);
        node.right = create(preorder,l1+i+1,r1,inorder,l2+i+1,+r2);
        return node;
    }
}
