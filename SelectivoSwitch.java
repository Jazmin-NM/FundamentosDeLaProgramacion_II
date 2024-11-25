package SelectivoSwitch;
import javax.swing.JOptionPane;
public class SelectivoSwitch {
    public static void main (String [] jaz){
        //declaracion de variables
        byte opcion;
        float a;
        float b;
        float h;
        float r;
        a=0;
        opcion = Byte.parseByte(JOptionPane.showInputDialog("""
            MEN\u00da DE OPCIONES
            1.- TRIANGULO
            2.- RECTANGULO
            3.- CIRCULO
            Escribe el numero de tu elecci\u00f3n"""));
        switch (opcion){
            case 1 -> { 
                System.out.println("Ingresa el valor de la altura");
                h=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor"
                        + " de la altura"));
                System.out.println("Ingresa el valor de la base");
                b=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor"
                        + " de la base"));
                a=(b*h)/2;
            }
            case 2 -> { 
                System.out.println("Ingresa el valor de la altura");
                h=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor"
                        + " de la altura"));
                System.out.println("Ingresa el valor de la base");
                b=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor"
                        + " de la base"));
                a= b*h;
            }
            case 3 -> { 
                System.out.println("Ingresa el valor del radio");
                r=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor"
                        + " del radio"));
                a=(float) Math.PI*(r*r);
            }
            default -> JOptionPane.showMessageDialog(null, """
                Solo es posible seleccionar 1, 2 o 3
                Intente de nuevo"""); 
        }
        JOptionPane.showMessageDialog(null, "El área es: " + a);
    }
}
