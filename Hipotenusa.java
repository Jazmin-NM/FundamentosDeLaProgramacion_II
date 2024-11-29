/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YOGA-370
 */
import javax.swing.JOptionPane;
public class Hipotenusa {
    public static void main (String args []){
        System.out.println("Ingresa la medida del cateto A");
        byte CatA;
        CatA=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la medidad del cateto A"));
        System.out.println("Ingresa la medida del cateto B");
        byte CatB;
        CatB=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la medida del cateto B"));
        byte Hip;
        Hip=(byte)(Math.sqrt((CatA*CatA)+(CatB*CatB)));
        JOptionPane.showMessageDialog(null,"La hipotenusa es " + Hip);
    }
}
