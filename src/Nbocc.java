import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Nbocc {
    public static void main (String[] argv) throws IOException
    {
        int nombre=0;
        String ligne;
        StringTokenizer st;
        String mot= new String("fois");
        BufferedReader entree =new BufferedReader
                (new FileReader("src/huffman.txt"));

        while((ligne=entree.readLine())!=null)
        {
            st = new StringTokenizer(ligne,".;() =[]");
            while(st.hasMoreTokens())
                if (mot.equals(st.nextToken())) nombre++;
        }
        System.out.println("Le mot "+mot+" figure "+nombre+" fois");
    }
}
