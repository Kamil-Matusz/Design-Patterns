package iterator.Tree;

import java.util.List;
import java.util.Stack;

public class DFSIterator<T> implements TreeIterator<T> {
    private Stack<TreeNode<T>> stack = new Stack<>();

    public DFSIterator(TreeNode<T> root) {
        if (root != null) stack.push(root);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public T next() {
        TreeNode<T> node = stack.pop();
        // Dodajemy dzieci w odwrotnej kolejności, aby były przeglądane w dobrej kolejności
        List<TreeNode<T>> children = node.getChildren();
        for (int i = children.size() - 1; i >= 0; i--) {
            stack.push(children.get(i));
        }
        return node.getValue();
    }
}
