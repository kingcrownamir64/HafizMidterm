package string.problems;

public class Palindrome {

    public static void main(String[] args) {



        String One = "dad";
        String Two = "madam";
        String Three = "mom";


        System.out.println(isPalindrome(One));
        System.out.println(isPalindrome(Two));
        System.out.println(isPalindrome(Three));
    }

    public static boolean isPalindrome(String word) {

        String actualWord = word.toLowerCase();
        String reverseWord = "";

        for (int i = actualWord.length() - 1; i>=0; i--){

            reverseWord = reverseWord + actualWord.charAt(i);
        }
        if (actualWord.equals(reverseWord)){
            return true;
        }
        else {
            return false;
        }

    }

}
