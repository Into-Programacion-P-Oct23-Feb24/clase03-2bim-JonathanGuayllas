/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        // creación del arreglo
        int[][] arreglo = {{10, 1, 1}, {41, 2, 12}, {40, 3, 4}};
        int suma = 0;
        suma = suma + arreglo[0][0] + arreglo[1][1] + arreglo[2][2];
        System.out.printf("%d\n", suma);
    }
}
