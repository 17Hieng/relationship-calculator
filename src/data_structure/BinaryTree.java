package data_structure;

public class BinaryTree {
    private String data;
    private BinaryTree[] array;
    private BinaryTree[] children;

    public BinaryTree(String data) {
        this.data = data;
        this.children = new BinaryTree[2];
    }
    public BinaryTree(String data,BinaryTree[] array) {
        this.data = data;
        this.array = new BinaryTree[2];

        for (int i = 0; i < array.length && i < this.array.length;i++) {
            this.array[i] = array[i];
        }
        this.children = new BinaryTree[2];
    }

    public String getData() {
        return data;
    }

    public void addLeftChild(BinaryTree child) {
        this.children[0] = (child);
    }

    public void addRightChild(BinaryTree child) {
        this.children[1] = (child);
    }

    public BinaryTree getLeft() {
        return children[0];
    }

    public BinaryTree getRight() {
        return children[1];
    }

    public boolean isLeaf() {
        return children[0] == null && children[1] == null;
    }
}
