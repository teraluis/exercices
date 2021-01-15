package treeSet;

import java.util.TreeMap;
import java.util.TreeSet;

public class Index {
    TreeMap<String, TreeSet<Integer>> index;
    public Index() {
        index = new TreeMap<String, TreeSet<Integer>>();
    }
    public void ajoutter(String entree, int numero) {
        TreeSet<Integer> numExistants = index.get(entree);
    }
}
