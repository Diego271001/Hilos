package Hilos;
public class Hilo3 extends Thread{
    int num[];
    public void run(){
        double aux=0;
                for(int x=0; x<num.length; x++){
                    if(x==0){
                      System.out.println("Hilo #3 = "+ num[x]);
                      aux += num[x];
                    }else{
                      System.out.println("Hilo #3 = " + aux + " + " + num[x]);
                      aux += num[x];
                    }   
                }
                
        
        System.out.println("Hilo #3 = " + aux + " / " + num.length);
        System.out.println("Media = " + aux/num.length);
        System.out.println();
    }
    public void numeros(int[] num){
        this.num = num;
    }
}