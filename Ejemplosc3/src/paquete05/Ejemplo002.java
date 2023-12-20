/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;
/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        // declaro el arrelgo y los valores que tendra
        int[][] arreglo = {{10, 1, 1}, {41, 2, 12}, {40, 3, 4}};
        // creo una variable suma que inicia en 0 y acumula la suma de los 
        // arreglos
        int suma = 0;
        // se suman los valores de los arreglos de los elementos seleccionados
        suma = suma + arreglo[0][0] + arreglo[1][1] + arreglo[2][2];
        // presento la suma total
        System.out.printf("%d\n", suma);
        /*
          Para resolver este ejercicio primero creamos un arreglo y le damos sus
          respectivos valores, posteriormente creamos una variable suma que 
          guarde la suma de los elementos del arreglo en la posición deseada
          y presentamos en pantalla
        */
    }
}
