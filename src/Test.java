import arbres.BinaryTree;
import arbres.Node;

public class Test {
    public static void main(String[] args) {
        Node node = new Node(8);
        BinaryTree bt = new BinaryTree(node);
        bt.createBinaryTree();
        if(bt.containsNode(7)) {
            System.out.println("l'arbre contient l' élément : " + 7 );
        } else {
            System.out.println("l'arbre ne contient pas l' élément : " + 7 );
        }
    }
}
