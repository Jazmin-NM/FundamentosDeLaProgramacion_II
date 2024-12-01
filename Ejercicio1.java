/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YOGA-370
 */
import javax.swing.JOptionPane;
public class Ejercicio1 {
    public static void main (String args []){
        System.out.println("Ingresa tu año de nacimiento");
        short x;
        x=Short.parseShort(JOptionPane.showInputDialog("Ingresa tu año de nacimiento"));
        byte e;
        e=(byte)(2024-x);
        System.out.println(e);
}
}
