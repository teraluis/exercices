package arbres;

public class Node {
    Node left, right;
    int value;
    public Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public void setLeft(Node node) {
        this.left = node;
    }

    public  void setRight(Node node) {
        this.right = node;
    }

}
