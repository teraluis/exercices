import strings.ListeTriee;

public class TestListeTrie {
    public static void main(String[] args) {
        ListeTriee liste = new ListeTriee();
        liste.ajoute("c");
        liste.ajoute("b");
        liste.ajoute("d");
        liste.ajoute("f");
        liste.ajoute("g");
        liste.ajoute("e");
        liste.affiche();
    }
}
