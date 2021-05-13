package Hilos;
public class Hilo1 extends Thread{
    int num[];

    public void run(){
        double aux=0;

        for(int x=0; x<num.length; x++){
            if(x==0){
               System.out.println("Hilo #1 = " + num[x]);
               aux += num[x]; 
            }else{
               System.out.println("Hilo #1 = " + aux + " + " + num[x]);
               aux += num[x];   
            }
        }
        System.out.println("Suma = "+aux);
        System.out.println();
    }
    public void numeros(int[] num){
        this.num = num;
    }
}
