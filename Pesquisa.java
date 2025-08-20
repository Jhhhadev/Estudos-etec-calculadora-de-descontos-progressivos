/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhade
 */ 
// O programa deve solicitar  a digitação do nome, idade e opinião do entrevistado sobre o atendimento prestado, 
// sendo: 1-EXCELENTE, 2-BOM ou 3-RUIM. A pesquisa deve ser feita com 10 entrevistados e o no final, o programa deverá exibir na tela:
//a. quantidade de respostas “EXCELENTE”
//b. quantidade de respostas “RUIM

import java.util.Scanner;

public class Pesquisa {
    
    public static void main (String []args){
      
        Scanner input = new Scanner (System.in);
        
        int quantidadeExcelente = 0;
        int quantidadeRuim = 0;
        
        for (int i = 1; i <=10; i++) {
            System.out.println("Entrevistado" + i);
            
            //coleta de dados 
            
            System.out.print ("Insira seu nome: ");
            String nome = input.next ();
            
            System.out.print ("Insira sua idade: ");
            int idade = input.nextInt ();
            
            //Coleta da avaliação
            
            System.out.println("O que achou do nosso atendimento? (1-EXCELENTE, 2-BOM, 3-RUIM): ");
            int opiniao = input.nextInt ();
            
            //estrutura de decisão para contabilizar respostas 
            
            if (opiniao ==1) {
            quantidadeExcelente++;
           
            }else if (opiniao ==3) {
            quantidadeRuim++;   
            }
            
            System.out.println ();
            
        }
         
        //Exibir resultado da pesquisa
        
        System.out.println ("Quantidade de respostas 'Excelente': " + quantidadeExcelente);
        System.out.println ("Quantidade de respostas 'Ruim': " + quantidadeRuim); 
    }
}