/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg8;

/**
 *
 * @author Usuario
 */
public class Exercicio8 {

     public static int[] inverterArray(int[] arrayOriginal) {
        if (arrayOriginal == null) {
            return null;
        }

        int[] arrayInvertido = new int[arrayOriginal.length];
        int j = 0;

        for (int i = arrayOriginal.length - 1; i >= 0; i--) {
            arrayInvertido[j] = arrayOriginal[i];
            j++;
        }

        return arrayInvertido;
    }
    public static void main(String[] args) {
          int[] numeros = {1, 2, 3, 4, 5};
        int[] invertido = inverterArray(numeros);

        System.out.print("Array invertido: ");
        for (int num : invertido) {
            System.out.print(num + " ");
        }
    }
}
    
    

