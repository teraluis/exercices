package Huffman;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ScanPlus {
    Scanner scanner;
    String ligne = "";
    int indice = 0;
    boolean debut = true;
    public ScanPlus(String nomFichier) throws IOException {
        scanner = new Scanner(new File(nomFichier));
    }

    public char nextChar() {
        char c;

        if (debut){
            indice = 0;
            ligne = scanner.nextLine();
            debut = false;
        }
        if (indice == ligne.length())  {
            if (scanner.hasNext()) {
                indice = 0;
                ligne = scanner.nextLine();
                return '\n';
            }
            else return 0;
        }
        c = ligne.charAt(indice);
        indice ++;
        return c;
    }

    public static void main(String[] arg) throws IOException {
        ScanPlus scan = new ScanPlus(arg[0]);
        char c;
        while ((c = scan.nextChar()) != 0) System.out.print(c);
        System.out.println();
    }
}
