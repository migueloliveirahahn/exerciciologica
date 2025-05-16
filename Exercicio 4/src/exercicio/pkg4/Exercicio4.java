
package exercicio.pkg4;

import java.util.Scanner;


public class Exercicio4 {

    
public static String substituirVogais(String texto) {
  public static int contarVogais(String s) {
          int contador = 0;
        s = s.toLowerCase(); 
        for (char c : s.toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
public static String maisVogais(String[] palavras) {
        String comMaisVogais = "";
        int maxVogais = 0;

        for (String palavra : palavras) {
            int quantidade = contarVogais(palavra);
            if (quantidade > maxVogais) {
                maxVogais = quantidade;
                comMaisVogais = palavra;
            }
        }

        return comMaisVogais;
    }
    public static void main(String[] args) {
        String[] palavras = {"cachorro", "mediocre", "universos", "python", "palavra"};
        String resultado = maisVogais(palavras);
        System.out.println("String com mais vogais: " + resultado);
    }
}
       
