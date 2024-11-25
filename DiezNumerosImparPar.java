import javax.swing.JOptionPane;
public class DiezNumerosImparPar {
    public static void main (String []args){
        byte contador=1;
        while(contador<=10){
            System.out.println("Ingresa un numero");
            byte num;
            byte mod;
            byte asteriscos;
            short x;
            num=Byte.parseByte(JOptionPane.showInputDialog("Ingresa un numero"));
            mod= (byte)(num%2);
            if (mod==0){
                asteriscos=(byte)(num/2);
                asterisco
                for (x=asteriscos;x>0;x=-1){
                    System.out.print("*");
                }
                System.out.println(" ");
            }else{
                System.out.println("Impar");
            }
        }
        contador=+1;
    }
}
