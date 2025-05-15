
package exercicio.pkg3;

public class Exercicio3 {
    
    public static int gaveta(int [] numeros) {
     int maior = 0;
     
     for (int numero : numeros) {
      int valorAbsoluto = Math.abs(numero);
       if (valorAbsoluto > maior) {
           maior = valorAbsoluto;
       }
     }
     
    return maior;
    
    }
    public static void main(String[] args) {
     int[] array = { 30 , 700 , 1324 , 1421 , 9};
     int resultado = gaveta(array);
        System.out.println("Maior valor absoluto: " + resultado);
    }
    
}
