package Hilos;
public class Hilo2 extends Thread{
    int num[];
    
    public void run(){
        double aux=0;
        
        for(int x=0; x<num.length; x++){
            if(x==0){
               aux += Math.pow(num[x], 2);  
               System.out.println("Hilo #2 = "+aux);
               
            }else{
               System.out.println("Hilo #2 = "+aux+" + "+Math.pow(num[x], 2));
               aux += Math.pow(num[x], 2);
            }
                    
        }
        
        System.out.println("Suma de los cuadrados = " + aux);
        System.out.println();
    }
    public void numeros(int[] num){
        this.num = num;
    }
}
