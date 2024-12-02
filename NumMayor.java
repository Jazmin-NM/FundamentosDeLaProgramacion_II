


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YOGA-370
 */
import javax.swing.JOptionPane;
public class NumMayor {
    public static void main (String args[]){
        System.out.println("Introduzca un valor");
        short a;
        a=Short.parseShort(JOptionPane.showInputDialog ("Introduzca un valor"));
        System.out.println("Introduzca un valor distinto al primero");
        short b;
        b=Short.parseShort(JOptionPane.showInputDialog ("Introduzca un valor distinto al primero"));
        if(a==b){
            JOptionPane.showMessageDialog(null, "Son iguales");
        }else if(a>b){
            JOptionPane.showMessageDialog(null, a + " es mayor");
        }else {
            JOptionPane.showMessageDialog(null, b + " es mayor");
        }
    }
}
