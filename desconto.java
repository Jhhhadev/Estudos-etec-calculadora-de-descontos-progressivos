/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichariojhadee;

/**
 *
 * @author jhade
 */
//sistema de desconto progressivo
//Se o valor total da compra for < do que R$ 200,00, o cliente recebe um desconto de 5%.
//Se o valor total da compra for >  = a R$ 200,00 && < que R$ 300,00, o cliente recebe um desconto de 10%.
//Se o valor total da compra for > ou = a R$ 300,00, o cliente recebe um desconto de 15%.

import javax.swing.JOptionPane;

public class desconto {
    public static void main (String []args){
        
        //Solicitar valor total 
        String EntradaValorTotal = JOptionPane.showInputDialog("Insira o valor total da compra");
        double ValorTotal = Double.parseDouble (EntradaValorTotal);
        
        //Variavel p/ armazenar valor do desconto 
        
        double desconto = 0;
                               
                
        // Regras do desconto
        
        if (ValorTotal < 200) {
       desconto = ValorTotal * 0.05;
       
}       else if (ValorTotal >= 200 && ValorTotal < 300) {
       desconto = ValorTotal * 0.10;
       
}       else if (ValorTotal >= 300){
       desconto = ValorTotal * 0.15;
}
        
        // calcular valor total após aplicar o desconto 
        
        double ValorApagar = ValorTotal - desconto;
        
        // valor do desconto e o valor total a pagar 
        
        JOptionPane.showMessageDialog(null,"Desconto aplicado é R$" + desconto + "\nValor total após o desconto: R$" + ValorApagar);
        
   } 
}
