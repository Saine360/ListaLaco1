/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosLaco;

import javax.swing.JOptionPane;
/**
 *
 * @author Lab01_215
 */
public class Urna {
    public static void main(String[] args) {
        int somaA=0, somaB=0, contA=0, contB=0, voto = 0;
        while(voto!=10){                        
            voto=Integer.parseInt(JOptionPane.showInputDialog("Digite 13 para votar em Haddad. Digite 17 para votar em Bolsonaro."));
            if ((voto!=10)&&(voto!=13)){
            contA=contA+1;
            somaA=contA;
        }
            if((voto!=10)&&(voto!=17)){            
            contB=contB+1;
            somaB=contB;
        }
        }
        JOptionPane.showMessageDialog(null,"Haddad: "+Integer.toString(somaB)+" votos. Bolsonaro: "+Integer.toString(somaA)+" votos.");
        
    }
}
