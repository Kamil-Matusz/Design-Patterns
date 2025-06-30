package iterator.Tree;

public class Tree<T> {
    private TreeNode<T> root;

    public Tree(TreeNode<T> root) {
        this.root = root;
    }

    public TreeIterator<T> getIterator(String type) {
        if (type.equalsIgnoreCase("DFS")) {
            return new DFSIterator<>(root);
        } else if (type.equalsIgnoreCase("BFS")) {
            return new BFSIterator<>(root);
        }
        throw new IllegalArgumentException("Unknown iterator type: " + type);
    }
}
