package Huffman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class AlgoHuffman {

    private ArrayList<NoeudHuffman>  listeCaracteres = new ArrayList<NoeudHuffman>();

    public AlgoHuffman(String nomFichier) throws IOException {
        NoeudHuffman racine;
        NoeudHuffman.optionTri = NoeudHuffman.NB_OCC;
        construireListe(nomFichier);
        racine = huffman();
        determinerCodes(racine, new StringBuffer());
        NoeudHuffman.optionTri = NoeudHuffman.CARACTERE;
        Collections.sort(listeCaracteres);
        ecrire();
    }

    public void construireListe(String nomFichier)  throws IOException {
        ScanPlus scan = new ScanPlus(nomFichier);
        char c;

        while((c = scan.nextChar()) != 0)  {
            ajouter(c);
        }
    }

    public void ajouter(char c) {
        NoeudHuffman carTrouve = null;
        for  (NoeudHuffman car : listeCaracteres)
            if (car.getCaractere() == c) {
                carTrouve = car;
                break;
            }
        if (carTrouve == null) listeCaracteres.add(new NoeudHuffman(c, 1, null, null));
        else  carTrouve.incremente();
    }

    public NoeudHuffman huffman() {
        NoeudHuffman  n1,  n2, nouveau;;
        ArrayList<NoeudHuffman> copieListe = (ArrayList<NoeudHuffman>)listeCaracteres.clone();
        while (copieListe.size() > 1)
        {
            n1 = Collections.min(copieListe);
            copieListe.remove(n1);
            n2 = Collections.min(copieListe);
            copieListe.remove(n2);
            nouveau = new NoeudHuffman('_', n1.getNbOcc() + n2.getNbOcc(), n1, n2);
            copieListe.add(nouveau);
        }
        return copieListe.get(0);
    }

    void determinerCodes(NoeudHuffman racine, StringBuffer chaine) {
        if (racine.getFilsG() == null)
        {
            racine.setCode(new String(chaine));
        }
        else {
            chaine.append('0');
            determinerCodes(racine.getFilsG(), chaine);
            chaine.deleteCharAt(chaine.length() - 1);
            chaine.append('1');
            determinerCodes(racine.getFilsD(), chaine);
            chaine.deleteCharAt(chaine.length() - 1);
        }
    }

    void ecrire() {
        for  (NoeudHuffman car : listeCaracteres) {
            System.out.println(car);
        }
    }
}
