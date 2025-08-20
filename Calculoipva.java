/**
 *
 * @author jhade
 */
import javax.swing.JOptionPane;

public class Calculoipva {
    
public static void main (String []args){
    
    //variavel 
    int Placa;
    
    //entrada e conversão de dados 
    
    Placa = Integer.parseInt(JOptionPane.showInputDialog ("Informe o número final da placa"));
    
    //Processar dados 
    
    switch (Placa){
        case 1 -> JOptionPane.showMessageDialog(null,"O pagamento do IPVA deverá ser realizado até dia 30/04");
        
        case 2 -> JOptionPane.showMessageDialog(null,"O pagamento do IPVA deverá ser realizado até dia 31/05");
        
        case 3 -> JOptionPane.showMessageDialog(null,"O pagamento do IPVA deverá ser realizado até dia 30/06");
        
        case 4 -> JOptionPane.showMessageDialog(null,"O pagamento do IPVA deverá ser realizado até dia 31/07");
        
        case 5 -> JOptionPane.showMessageDialog(null,"O pagamento do IPVA deverá ser realizado até dia 31/08");
        
        case 6 -> JOptionPane.showMessageDialog(null,"O pagamento do IPVA deverá ser realizado até dia 30/09");    
            
        case 7 -> JOptionPane.showMessageDialog(null,"O pagamento do IPVA deverá ser realizado até dia 31/10");  
        
        case 8 -> JOptionPane.showMessageDialog(null,"O pagamento do IPVA deverá ser realizado até dia 30/11");
        
        case 9, 0 -> JOptionPane.showMessageDialog(null,"O pagamento do IPVA deverá ser realizado até dia 31/12");
        
        default -> JOptionPane.showMessageDialog(null,"O valor digitado está incorreto. Por favor, insira um número válido."); 
        } //fim do switch-case
      }
}


