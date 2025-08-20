
/**
 *
 * @author jhade
 */

//-Ler as informações de 40 espectadores (idade e opinião). 

//-quantidade de respostas "ótimo";

//- a média de idade das pessoas que responderam "ruim";

//- a porcentagem de respostas "péssimo".

//-A média geral das notas, considerando que "A = 5", "B = 4", "C = 3", "D = 2", e "E = 1".

import java.util.Scanner;

public class Pesquisacinema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variáveis
        int quantidadeOtimo = 0;
        int quantidadePessimo = 0;
        int quantidadeRuim = 0;
        double somaIdadeRuim = 0;
        int contagemIdadeRuim = 0;
        int somaNotas = 0;
        int idade;
        char opiniao;

        int totalEspectadores = 1;

        while (totalEspectadores <= 40) {

            System.out.println("Telespectador " + totalEspectadores);

            // Entrada da idade
            System.out.print("Insira sua idade: ");
            idade = input.nextInt();

            // Entrada da opinião
            System.out.println("Digite o que achou do filme (A - Otimo, B - Bom, C - Regular, D - Ruim, E - Pessimo):");
            opiniao = input.next().toUpperCase().charAt(0);  // Pega a primeira letra e converte para maiúscula

            // Processa a opinião
            switch (opiniao) {
                case 'A' -> {
                    quantidadeOtimo++;
                    somaNotas += 5;
                }

                case 'B' -> somaNotas += 4;

                case 'C' -> somaNotas += 3;

                case 'D' -> {
                    quantidadeRuim++;
                    somaNotas += 2;
                    somaIdadeRuim += idade;
                    contagemIdadeRuim++;
                }

                case 'E' -> {
                    quantidadePessimo++;
                    somaNotas += 1;
                }

                default -> System.out.println("Opinião inválida, tente novamente.");
            }

            totalEspectadores++;  // Incrementa o contador de espectadores
        }

        // Calcular a média de idade das pessoas que responderam "ruim"
        if (contagemIdadeRuim > 0) {
        double mediaIdadeRuim = somaIdadeRuim / contagemIdadeRuim;
            System.out.println("A media de idade das pessoas que avaliaram como 'ruim': " + mediaIdadeRuim);
        } 
        else {
            System.out.println("Nenhuma pessoa avaliou como 'ruim'.");
        }

        // Calcular a porcentagem de respostas "péssimo"
        double porcentagemPessimo = (double) quantidadePessimo / 40 * 100;
        System.out.println("A porcentagem de respostas 'pessimo': " + porcentagemPessimo + "%");

        // Calcular a média geral das notas
        double mediaGeralNotas = (double) somaNotas / 40;
        System.out.println("A media geral das notas: " + mediaGeralNotas);
        
        // apresentar quantas pessoas responderam "ótimo"
        System.out.println ("Quantidade de respostas 'Otimo': " + quantidadeOtimo);

        input.close();  // Fecha o scanner para evitar vazamento de recursos
    }
}

