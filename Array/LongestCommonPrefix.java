/*
14. Find the longest common prefix in an array of strings
*/
import java.lang.Math;
class LongestCommonPrefix {
    public static void main(String args[]) {
        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String longestPrefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            String currentString = arr[i];
            int minLength = Math.min(longestPrefix.length(), currentString.length());
            int k = 0;
            while (k < minLength && longestPrefix.charAt(k) == currentString.charAt(k)) {
                k++;
            }
            longestPrefix = longestPrefix.substring(0, k);//new property
            if (longestPrefix.isEmpty()) {
                break;
            }
        }
        System.out.println("Longest Common Prefix: " + longestPrefix);
    }
}
