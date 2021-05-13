package Hilos;
import java.util.*;
public class Main {
        
    public static void main(String [] Args) {
        Scanner leer = new Scanner(System.in);
        Hilo1 Suma = new Hilo1();
        Hilo2 SumaCuadrados = new Hilo2(); 
        Hilo3 Media = new Hilo3();
        
        System.out.println("Arreglo:");
        int tamaño=100;
        int num[] = new int[tamaño]; 
        
        for(int x=0; x<num.length; x++){
            num[x] = (int) (Math.random()*100)+1;
            System.out.println("# "+(x+1)+ " =  "+num[x]);
        }
        
        System.out.println();
        
        Suma.numeros(num);
        SumaCuadrados.numeros(num);
        Media.numeros(num);
        
        Suma.start();
        SumaCuadrados.start();
        Media.start();
    }
}
