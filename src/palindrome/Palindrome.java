package palindrome;

public class Palindrome {
    private String palindrome;

    public Palindrome(String palindrome) {
        this.palindrome = palindrome;
    }

    public boolean isPalindrome() {
        return this.palindrome.length() == this.inverse().length() && this.inverse().equals(this.palindrome);
    }

    private String inverse() {
        StringBuilder inverse = new StringBuilder();;
        for (int i = palindrome.length() - 1 ; i >= 0 ; i--) {
            inverse.append(palindrome.charAt(i));
        }
        return inverse.toString();
    }
}
