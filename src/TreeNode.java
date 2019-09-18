public class TreeNode {
    int val;
    TreeNode left;
    TreeNode rigth;
    public TreeNode(int i){
        val = i;
    }
    public void addNode(int i){
        TreeNode current = this;
        TreeNode parrent = this;
        while(current != null) {
            if (i > current.val) {
                parrent = current;
                current = current.rigth;
            } else if (i < current.val) {
                parrent = current;
                current = current.left;
            }
        }
        if (i > parrent.val) parrent.rigth = new TreeNode(i);
        else if (i < parrent.val) parrent.left = new TreeNode(i);
    }
}
