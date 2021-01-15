package Huffman;

public class NoeudHuffman implements Comparable<NoeudHuffman> {
    private char caracterere;
    private int nbOcc;
    private NoeudHuffman filsG;
    private NoeudHuffman filsD;
    private String code ;
    public static int CARACTERE = 1, NB_OCC = 2;
    public static int optionTri;

    public NoeudHuffman(char c, int nbOcc, NoeudHuffman filsG, NoeudHuffman filsD) {
        this.caracterere = c;
        this.nbOcc = nbOcc;
        this.filsG = filsG;
        this.filsD = filsD;
    }

    public char getCaractere() {
        return caracterere;
    }

    public int getNbOcc() {
        return nbOcc;
    }


    public NoeudHuffman getFilsG() {
        return filsG;
    }

    public NoeudHuffman getFilsD() {
        return filsD;
    }

    public void setCode(String chaine) {
        this.code = chaine;
    }

    public void incremente() {
        nbOcc ++;
    }


    public String toString() {
        return caracterere + " (" + nbOcc + " fois) : " + code;
    }

    public int compareTo(NoeudHuffman autre) {
        if (optionTri == NB_OCC) {
            if(nbOcc < autre.nbOcc) return -1;
            else if (nbOcc > autre.nbOcc) return 1;
        }
        else if (optionTri == CARACTERE) {
            if(caracterere < autre.caracterere) return -1;
            else if (caracterere > autre.caracterere) return 1;
        }
        return 0;
    }
}
