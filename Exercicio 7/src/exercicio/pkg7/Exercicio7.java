/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg7;

/**
 *
 * @author Usuario
 */
public class Exercicio7 {


    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); 
    }
    
    public static void main(String[] args) {
        System.out.println(calcularMDC(65, 32)); 
        System.out.println(calcularMDC(101, 103)); 
        System.out.println(calcularMDC(58, 18)); 
    }
}
    
    

