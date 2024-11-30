/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YOGA-370
 */
import javax.swing.JOptionPane;
public class Nota {
    public static void main(String args[]){
        System.out.println("Ingresa tu nota obtenida");
        byte n;
        n=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu nota obtenida"));
        if(n>=19 && n<=20){
            JOptionPane.showMessageDialog(null,"Tu nota es A");
        }else if(n>=16 && n<=18){
            JOptionPane.showMessageDialog(null,"Tu nota es B");
        }else if(n>=13 && n<=15){
            JOptionPane.showMessageDialog(null,"Tu nota es C");
        }else if(n>=10 && n<=12){
            JOptionPane.showMessageDialog(null,"Tu nota es D");
        }else if(n>=1 && n<=9){
            JOptionPane.showMessageDialog(null,"Tu nota es E");
        }
    }
}
