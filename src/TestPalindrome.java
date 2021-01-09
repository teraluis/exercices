import palindrome.Palindrome;

public class TestPalindrome {

    public static void main(String[] args) {
        java.util.Scanner entree = new java.util.Scanner(System.in);
        String chaine = entree.nextLine();
        Palindrome palindrome = new Palindrome(chaine);
        System.out.println("Is palindrome " + palindrome.isPalindrome());
    }
}
