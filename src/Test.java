import arbres.BinaryTree;
import arbres.Node;

public class Test {
    public static void main(String[] args) {
        Node node = new Node(9);
        BinaryTree bt = new BinaryTree(node);
        bt.createBinaryTree();
        if(bt.containsNode(7)) {
            System.out.println("l'arbre contient l' élément : " + 7 );
        } else {
            System.out.println("l'arbre ne contient pas l' élément : " + 7 );
        }
/*        if(bt.containsNode(9)) {
            System.out.println("delete " + 9);
            bt.delete(9);
        }
        if(bt.containsNode(9)) {
            System.out.println("l'abre contient encore le noued");
        } else {
            System.out.println("l'arbre ne contient plus le noeud");
        }*/

        System.out.println("traverser in level order");
        bt.traverseLevelOrder();
    }
}
