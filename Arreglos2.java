import javax.swing.JOptionPane;
public class Arreglos2 {
    public static void main(String []args){
        //declaracion de variables
        /*Byte cuadros[]={0,1,2};
        Byte columnas[]={0,1,2};
        Byte filas[]={0,1,2};*/
        short multiplicacion=0;
        byte tablas[][][]=new byte[3][3][3];
        byte z,x,y;
        //Pedir numeros
        for(z=0;z<2;z++){//tabla
           for(x=0;x<3;x++){//columna
                for(y=0;y<3;y++){//filas
                    tablas[z][x][y]=Byte.parseByte(JOptionPane.showInputDialog("Ingresa "
                        + "un numero en la casilla "+(y+1)+" fila " + (x+1)+ " tabla "+(z+1)));
                }
            } 
        }
        
        //Impresion de los numeros
        for(z=0;z<2;z++){//tabla
           for(x=0;x<3;x++){//columna
                for(y=0;y<3;y++){//filas
                    System.out.print(tablas[z][x][y]+"\t");
                    
                }
                System.out.println();
            } 
            System.out.println("---------------------");
        }
        /*multiplicacion=(short) ((tablas[z][x][y])*(tablas[(z+1)][(x+2)][y+2]));
        System.out.print(multiplicacion);*/
    }
}
