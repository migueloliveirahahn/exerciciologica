/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg6;

/**
 *
 * @author Usuario
 */
public class Exercicio6 {

 
    public static boolean isPalindromo(String str) {
        if (str == null) {
            return false;
        }

        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromo("radar")); 
        System.out.println(isPalindromo("deified")); 
        System.out.println(isPalindromo("Hello")); 
        System.out.println(isPalindromo("A man a plan a canal Panama")); 
    }
}
