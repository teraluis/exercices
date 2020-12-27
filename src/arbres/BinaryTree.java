package arbres;


public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if(value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exits
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public void createBinaryTree() {
        BinaryTree bt = new BinaryTree(this.root);
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
    }

    // trouver un élément

    private boolean containsNodeRecursive(Node current, int value) {
        if(current == null) {
            return false;
        }
        if(value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }
}
