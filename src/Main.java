public class Main {
    public static void main(String[] args){
        TreeNode myTree = new TreeNode(5);
        myTree.left = new TreeNode(2);
        myTree.rigth = new TreeNode(23);
        myTree.addNode(72);
        myTree.addNode(25);
        myTree.addNode(9);
        myTree.addNode(1);
        myTree.addNode(4);

        inorder(myTree);
        System.out.println("\n");
        preorder(myTree);
        System.out.println("\n");
        postorder(myTree);
    }

    public static void inorder(TreeNode tree){
        if(tree == null) return;
        inorder(tree.left);
        System.out.println(tree.val);
        inorder(tree.rigth);
    }

    public static void preorder(TreeNode tree){
        if(tree == null) return;
        System.out.println(tree.val);
        preorder(tree.left);
        preorder(tree.rigth);
    }

    public static void postorder(TreeNode tree){
        if(tree == null) return;
        postorder(tree.left);
        postorder(tree.rigth);
        System.out.println(tree.val);
    }
}
