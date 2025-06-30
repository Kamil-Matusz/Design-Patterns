package iterator.Tree;

public class Main {
    public static void main(String[] args) {
        TreeNode<String> root = new TreeNode<>("A");
        TreeNode<String> b = new TreeNode<>("B");
        TreeNode<String> c = new TreeNode<>("C");
        TreeNode<String> d = new TreeNode<>("D");
        TreeNode<String> e = new TreeNode<>("E");

        root.addChild(b);
        root.addChild(c);
        b.addChild(d);
        b.addChild(e);

        Tree<String> tree = new Tree<>(root);

        System.out.println("DFS:");
        TreeIterator<String> dfs = tree.getIterator("DFS");
        while (dfs.hasNext()) {
            System.out.println(dfs.next());
        }

        System.out.println("\nBFS:");
        TreeIterator<String> bfs = tree.getIterator("BFS");
        while (bfs.hasNext()) {
            System.out.println(bfs.next());
        }
    }
}
