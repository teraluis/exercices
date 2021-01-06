package strings;

public class Voyelles {

    public String mot;
    private char [] voyelles = {'a','e','i','o','u'};

    public Voyelles(String mot) {
        this.mot = mot.toLowerCase();
    }

    public int countVoyelles() {

        int count = 0;
        for(int i = 0; i < mot.length(); i++) {
            if(isVoyelle(mot.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public Boolean isVoyelle(char a) {
        for(int i = 0; i<voyelles.length; i++) {
            if(voyelles[i] == a) {
                return true;
            }
        }
        return false;
    }

}
