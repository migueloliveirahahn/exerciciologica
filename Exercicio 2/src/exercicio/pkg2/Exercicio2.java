/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio2 {
    public static String substituirVogais(String texto) {
   char[] caracteres = new char[texto.length()];
   
    for (int i = 0; i < texto.length(); i++) {
    char c = texto.charAt(i);
   if (c == 'a' || c == 'A' ||
       c == 'e' || c == 'E' ||
       c == 'i' || c == 'I' ||
       c == 'o' || c == 'O' ||
       c == 'u' || c == 'U') { 
       caracteres[i] = '*';
   } else {
       caracteres [i] = c;
   }
}
    
   String resultado = "";
  for (int i = 0; i < caracteres.length; i++) { {
    resultado += caracteres[i];
}
   return resultado;
}
    }
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String entrada = ler.nextLine();

        String modificada = substituirVogais(entrada);

        System.out.println("Frase com vogais substituídas: " + modificada);
        ler.close();
    }
}



    



