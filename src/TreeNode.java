public class TreeNode {
    //creating a node with a possible neighbor node
    int value;
    TreeNode left;
    TreeNode rigth;

    //sets its value
    public TreeNode(int i){
        value = i;
    }

    //this function makes it possible to add more nodes to an existing tree
    public void addNode(int i){
        //tracks which node is the node we are on and which is its parent
        TreeNode current = this;
        TreeNode parent = this;

        //finds the spot for the new node
        while(current != null) {
            if (i > current.value) {
                parent = current;
                current = current.rigth;
            } else if (i < current.value) {
                parent = current;
                current = current.left;
            }
        }
        //add the node to the right side of the parent
        if (i > parent.value) parent.rigth = new TreeNode(i);
        else if (i < parent.value) parent.left = new TreeNode(i);
    }
}
