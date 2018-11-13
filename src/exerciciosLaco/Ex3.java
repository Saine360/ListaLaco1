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
public class Ex3 {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0, resultado=0, operacao = 0;
         while(operacao!=5){
        operacao=Double.parseDouble(JOptionPane.showInputDialog("Escolha a operação matemática \n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão \n 5-Sair"));
        
        num1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número da operação"));
        num2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número da operação"));
        
        if((operacao!=5)&&(operacao==1)){
            resultado=num1+num2;
        }else if((operacao!=5)&&(operacao==2)){
            resultado=num1-num2;
        }else if((operacao!=5)&&(operacao==3)){
            resultado=num1*num2;
        }else if((operacao!=5)&&(operacao==4)){
            resultado=num1/num2;
        }
        
        JOptionPane.showMessageDialog(null,"O resultado é "+resultado);
        
    }
    }   
}
