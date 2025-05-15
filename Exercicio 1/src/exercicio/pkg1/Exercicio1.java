package exercicio.pkg1;

import java.util.Scanner;

public class Exercicio1 {
    
    public static boolean Perfeito(int num) {
    int soma = 0;
     for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        
        
        return soma == num;
    }


    public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro para verificar se é perfeito:");
        int numero = ler.nextInt();

        
        if (Perfeito(numero)) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }  
    }
    
}
