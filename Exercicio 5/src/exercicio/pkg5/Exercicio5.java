/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg5;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio5 {

public static long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fatorial não é definido para números negativos.");
        }

        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
          int n1 = 5;
        long resultado = fatorial(n1);
        System.out.println("Fatorial de " + 1 + " é: " + resultado);
    }
}
    }
    
}
