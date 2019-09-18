public class Main {
    public static void main(String[] args){
        TreeNode myTree = new TreeNode(5);
        myTree.left = new TreeNode(2);
        myTree.rigth = new TreeNode(23);
        myTree.addNode(72);
        myTree.addNode(25);
        myTree.addNode(9);

        inorder(myTree);
    }

    public static void inorder(TreeNode tree){
        if(tree == null) return;
        inorder(tree.left);
        System.out.println(tree.val);
        inorder(tree.rigth);
    }
}
