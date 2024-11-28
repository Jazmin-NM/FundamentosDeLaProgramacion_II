import javax.swing.JOptionPane;
public class PresupuestoActividadesCul {
    public static void main (String args []){
        float monto= 189000;
        System.out.println("Ingresa el nombre del taller");
        String taller;
        taller=(JOptionPane.showInputDialog("Ingresa el nombre del taller"));
        float porcentaje=0;
        int montA=0;
        if (taller.equals("Basquetboll")){
            montA=9000;
            porcentaje=(montA*100)/monto;
        } else if (taller.equals("Voleibol")||taller.equals("Futbol")){
            montA=15000;
            porcentaje=(montA*100)/monto;
        } else if (taller.equals("Artes")||taller.equals("Taiwando")){
            montA=50000;
            porcentaje=(montA*100)/monto;
        } else if (taller.equals("Ajedrez")) {
            montA=25000;
            porcentaje=(montA*100)/monto;
        } else if (taller.equals("Musica")) {
            montA=12000;
            porcentaje=(montA*100)/monto;
        } else if (taller.equals("Atletismo")) {
            montA=13000;
            porcentaje=(montA*100)/monto;
        }
        JOptionPane.showMessageDialog(null, taller + " monto asiganado: " + 
                "$"+ montA + " corresponde al: " + porcentaje + "%");
    }
}
