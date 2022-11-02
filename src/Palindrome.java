public class Palindrome {
    static boolean isPalindrome(String word) {
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            String sub = word.substring(i, i+1);
            if(!(sub.equals(" ") || sub.equals(".") || sub.equals(",") || sub.equals("?") || sub.equals("'"))) {
                newWord += sub;
            }
        }
        int length = newWord.length();
        newWord = newWord.toLowerCase();
        System.out.println(newWord);
        for (int i = 0; i < length/2; i++) {
            System.out.println(newWord.substring(i, i+1) + " " + newWord.substring(length-i-1, length-i));
            if(newWord.charAt(i) != newWord.charAt(length-i-1)) {
                return false;
            }
        }
        return true;
    }
}
