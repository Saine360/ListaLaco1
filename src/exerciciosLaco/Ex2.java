
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab01_215
 */
public class Ex2 {
    public static void main(String[] args) {
        int idade =0, cont=0, menores=0;
        while(cont<10){
            idade=Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));    
                if((cont<10)&&(idade<18)){
                    cont=cont+1;                
                    menores=menores+1;
                }
            }
                JOptionPane.showMessageDialog(null,"Número de pessoas menores de idade: "+menores);
    }
}
