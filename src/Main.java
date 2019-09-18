import java.util.Stack;

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

        nRinorder(myTree);
        System.out.print("\n");
        inorder(myTree);
        System.out.print("\n");
        preorder(myTree);
        System.out.print("\n");
        postorder(myTree);
    }

    //because recursion could be a burden on the memory i created a non recursive/iteration function
    public static void nRinorder(TreeNode tree){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(!stack.empty() || tree != null){
            //because inorder always goes from left, parent to right we go to the most lefter node and add each (parent)node we find to the stack
            if(tree != null){
                stack.push(tree);
                tree = tree.left;
            }
            //when the node does not exist we pop the stack and go back to the previous node, and instead of staying there we immediately go right. which prevent us from a infinite loop
            else {
                tree = stack.pop();
                System.out.println(tree.value);
                tree = tree.rigth;
            }
        }
    }

    // the inorder traversal of a tree
    public static void inorder(TreeNode tree){
        if(tree == null) return;
        inorder(tree.left);
        System.out.println(tree.value);
        inorder(tree.rigth);
    }

    // the preorder traversal of a tree
    public static void preorder(TreeNode tree){
        if(tree == null) return;
        System.out.println(tree.value);
        preorder(tree.left);
        preorder(tree.rigth);
    }

    // the postorder traversal of a tree
    public static void postorder(TreeNode tree){
        if(tree == null) return;
        postorder(tree.left);
        postorder(tree.rigth);
        System.out.println(tree.value);
    }
}
