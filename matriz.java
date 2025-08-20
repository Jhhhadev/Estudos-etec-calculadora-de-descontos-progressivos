/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichariojhadee;

/**
 *
 * @author jhade
 */

import java.util.Scanner;
public class matriz {

    public static void main(String[] args) {
        // Criação de uma matriz 3x3
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        // Inserir valores
        System.out.println("Digite os elementos da matriz 3x3:");

        // Laço para preencher a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt(); // Leitura do valor
                soma += matriz[i][j]; // Soma dos elementos
            }
        }
        // Exibe o resultado
        System.out.println("A soma de todos os elementos da matriz 3x3: " + soma);

        scanner.close();
    }
}
