/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg9;

/**
 *
 * @author Usuario
 */
public class Exercicio9 {

    public static double calcularPorcentagem(double valorTotal, double porcentagem) {
        return (valorTotal * porcentagem) / 100.0;
    }

    
    public static void main(String[] args) {
    double valorTotal = 250.0;
        double porcentagem = 12.5;

        double resultado = calcularPorcentagem(valorTotal, porcentagem);

        System.out.printf("Resultado: %.2f%% de %.2f é %.2f\n", porcentagem, valorTotal, resultado);
    }
}        
