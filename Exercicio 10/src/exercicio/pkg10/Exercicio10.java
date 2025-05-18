/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg10;

/**
 *
 * @author Usuario
 */
public class Exercicio10 {

    public static boolean ehQuadradoPerfeito(int num) {
        int raiz = (int) Math.sqrt(num);
        return raiz * raiz == num;
    }

    public static boolean ehNumeroFibonacci(int n) {
        if (n < 0) {
            return false;
        }

        int expressao1 = 5 * n * n + 4;
        int expressao2 = 5 * n * n - 4;

        return ehQuadradoPerfeito(expressao1) || ehQuadradoPerfeito(expressao2);
    }
    
    public static void main(String[] args) {
    System.out.println(ehNumeroFibonacci(0));   
        System.out.println(ehNumeroFibonacci(1));   
        System.out.println(ehNumeroFibonacci(2));  
        System.out.println(ehNumeroFibonacci(4));   
        System.out.println(ehNumeroFibonacci(13)); 
        System.out.println(ehNumeroFibonacci(22)); 
    }
}
        
    
    

