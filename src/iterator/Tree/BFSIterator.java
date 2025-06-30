package iterator.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSIterator<T> implements TreeIterator<T> {
    private Queue<TreeNode<T>> queue = new LinkedList<>();

    public BFSIterator(TreeNode<T> root) {
        if (root != null) queue.offer(root);
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public T next() {
        TreeNode<T> node = queue.poll();
        for (TreeNode<T> child : node.getChildren()) {
            queue.offer(child);
        }
        return node.getValue();
    }
}
