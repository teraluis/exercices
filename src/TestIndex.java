import index.Index;

public class TestIndex {

    public static void main(String[] args) {
        Index index = new Index();

        index.ajoutter("Java", 25);
        index.ajoutter("C#", 45);
        index.ajoutter("java", 12);
        index.ajoutter("objet", 15);
        index.ajoutter("polymorphe", 45);
        index.liste();
    }
}
