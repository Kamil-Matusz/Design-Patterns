package iterator.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    private T value;
    private List<TreeNode<T>> children = new ArrayList<>();

    public TreeNode(T value) {
        this.value = value;
    }

    public void addChild(TreeNode<T> child) {
        children.add(child);
    }

    public T getValue() {
        return value;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }
}
