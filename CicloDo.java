import javax.swing.JOptionPane;
public class CicloDo {
    public static void main (String[] args){
        float estatura;
        float peso;
        float imc = 0;
        byte resp;
        do {
            peso=Short.parseShort(JOptionPane.showInputDialog("Capturar "
                   + "peso"));
            estatura=Float.parseFloat(JOptionPane.showInputDialog("Captura"
                   + " tu estatura en formato de metros"));
            imc= (float) (peso/(estatura*estatura));
            if(imc<18.49){
                JOptionPane.showMessageDialog(null, "Peso bajo");
            }else if(imc>=18.50 && imc<=24.99){
                JOptionPane.showMessageDialog(null , "Peso normal");
            }else if(imc>=25 && imc<=29.99){
                JOptionPane.showMessageDialog(null, "Sobrepeso");
            }else if(imc>=30 && imc<=34.99){
                JOptionPane.showMessageDialog(null, "Obesidad leve");
            }else if(imc>=35 && imc<=39.99){
                JOptionPane.showMessageDialog(null, "Obesidad media");
            }else{
                JOptionPane.showMessageDialog(null, "Obesidad morbida");
            }
            resp=Byte.parseByte(JOptionPane.showInputDialog("Capaturar 1 "
                    + "si desea hacer otro calculo"));
        }
        while(resp==1);
    }
}