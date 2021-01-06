package index;

import java.util.*;

public class Index  {
    private TreeMap <String, TreeSet<Integer>>  index;


    public Index() {
        this.index = new TreeMap<String, TreeSet<Integer>>();
    }

    public void ajoutter(String entree, int numero) {
        TreeSet<Integer> numerosExistants = index.get(entree);
        if (index.get(entree) == null) {
            TreeSet<Integer> numeroNouveauNom = new TreeSet<Integer>();
            numeroNouveauNom.add(numero);
            index.put(entree, numeroNouveauNom);
        } else {
            numerosExistants.add(numero);
            index.put(entree, numerosExistants);
        }
    }

    public void ajoutterPageIndex(String entree) {
        Set<Map.Entry<String, TreeSet <Integer> > > elementsIndex = index.entrySet();
        for(Map.Entry<String, TreeSet<Integer>> elementCourrant : elementsIndex) {
            if(elementCourrant.getKey().equals(entree)) {
                index.put(entree, elementCourrant.getValue());
            }
        }
    }

    public void liste() {
        Set<Map.Entry<String, TreeSet <Integer> > > elementsIndex = index.entrySet();
        for(Map.Entry<String, TreeSet<Integer>> elementCourrant : elementsIndex) {
            String  entreeCourante = elementCourrant.getKey();
            TreeSet<Integer> numeros = elementCourrant.getValue();
            System.out.print(entreeCourante + ":");
            for(int num : numeros) System.out.print(num + " ");
            System.out.println("");
        }
    }
}
