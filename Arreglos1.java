import javax.swing.JOptionPane;
public class Arreglos1 {
    public static void main(String[]args){
        //declaracion de variables
        String materias[]={"CalcDif","MateDis","FundPro","FundInv","Quimica",
            "DesSust"};
        String encabezado[]={"Materia","U1","U2","U3","U4","U5","Promedio"};
        float calificaciones[][]=new float[7][6];
        byte x,y;
        float prom=0;
        float sumCal=0;
        float semestral=0;
        float sumaPro=0;
        //Ingresar calificaciones
        for(x=0;x<=5;x++){
            //filas_materia
            for(y=0;y<5;y++){
                //columna_unidad
                calificaciones[x][y]=Byte.parseByte(JOptionPane.showInputDialog("Ingresa "
                    + "calificaciones de "+materias[x]+" UNIDAD "+(y+1)));
            }
        }
        //Imprension de calificaciones
        for(x=0;x<=6;x++){
            System.out.print(encabezado[x]+"\t");
        }
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------");
        sumaPro=0;
        for(x=0;x<=5;x++){
            //filas_materia
            sumCal=0;
            System.out.print(materias[x]+"\t");
            for(y=0;y<5;y++){
                //columna_unidad
                System.out.print(calificaciones[x][y]+"\t");
                sumCal+=calificaciones[x][y];
            }
            prom=(sumCal/5);
            sumaPro+=prom;
            System.out.println(prom);
        }
        semestral=(sumaPro/6);
        System.out.println("Promedio semestral "+semestral);
    }
}

