package myLibreria;

import javax.swing.*;

public class Intro {
    public int pedirInt(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero(int)!!"));
    }

    public float pedirFloat(){
        return Float.parseFloat(JOptionPane.showInputDialog("Introduce "));
    }

    public static int [][] crearBidimensional(){
        int [][] tabla=new int[Integer.parseInt(JOptionPane.showInputDialog("Cunatas Filas?"))][Integer.parseInt(JOptionPane.showInputDialog("Cunatas Columnas?"))];
        for (int fila = 0; fila < tabla.length; fila++) {
            for (int col = 0; col < tabla[fila].length; col++) {
                tabla[fila][col]=Integer.parseInt(JOptionPane.showInputDialog("Introduce valor"));
            }
        }
        return tabla;
    }

    public static void amosarTablaBidimensionalInt(int[][]taboa){
        for (int i = 0; i < taboa.length; i++) {
            System.out.println();
            for (int j = 0; j < taboa[i].length; j++) {
                System.out.printf("pos["+i+"]:["+j+"] --> "+taboa[i][j]+"\t");
            }
        }
    }

}
