/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fichariojhadee;

/**
 *
 * @author jhade
 */
import java.util.Scanner;

public class Fichariojhadee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            // Entrada de dados
            System.out.print("Digite o modelo do carro: ");
            String modelo = scanner.nextLine();
            
            System.out.print("Digite o valor da diaria: ");
            double diaria = scanner.nextDouble();
            
            System.out.print("Digite a quantidade de dias de locacao: ");
            int dias = scanner.nextInt();
            
            System.out.print("Digite a quantidade de Km percorridos: ");
            double kmPercorridos = scanner.nextDouble();
            
            // Cálculos
            double custoDiarias = diaria * dias;
            double custoKm = kmPercorridos * 0.20;
            double valorTotal = custoDiarias + custoKm;
            
            // Exibição do resultado
            System.out.println("Modelo do carro: " + modelo);
            System.out.println("Valor total a pagar: R$" + String.format("%.2f", valorTotal));
        }
    }
    
}
