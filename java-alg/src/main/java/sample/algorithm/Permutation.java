package sample.algorithm;

public class Permutation {

    public static void main(String[] args) {
        System.out.println(checkPermutation("dog", "cat"));
        System.out.println(checkPermutation("love", "vole"));
    }

    private static boolean checkPermutation(String f, String s) {
        if (f.length() != s.length()) {
            return false;
        }

        // Considering string as ASCII characters
        int[] letters = new int[128];

        char[] chars = f.toCharArray();
        // Incrementing total occurrences of a specific letter in the first string
        for (char c : chars) {
            letters[c]++;
        }

        // Iterate over characters in the second string
        for (int i = 0; i < s.length(); i++) {
            int c = (int) s.charAt(i); // Get the int code (ASCII) of the character
            letters[c]--; // Decrement occurrences of a specific letter
            if (letters[c] < 0) { // If it comes to be negative either the letter does not exists in the first string
                return false;     // or there are more occurrences of the letter in one of the strings
            }
        }

        return true;
    }

}
