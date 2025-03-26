package designgurus;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Palindrome Check using Queue (easy)
 * 
 * Given a string s, determine if that string is a palindrome using a queue data structure. Return true
 * if the string is a palindrome. Otherwise, return false.
 * 
 * A palindrome is a word, number, phrase, or other sequence of characters that reads the same forward
 * and backward, ignoring spaces, punctuation, and capitalization.
 */
public class PalindromeCheckUsingQueue {

    public static boolean checkPalindrome(String s) {
        Deque<Character> dequeue = new LinkedList<>();
        char charA = 'A';
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                if (c >= charA) {
                    c -= charA;
                }
    
                dequeue.addFirst(c);
            }
        }
    
        while (dequeue.size() > 1) {
            if (dequeue.removeFirst() !=  dequeue.removeLast()) {
                return false;
            }                
        }
    
        return true;
    }
}
