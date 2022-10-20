
package javaapplication12;

import java.util.Scanner;

public class JavaApplication12 {

    public static void main(String[] args) {
        int v,c=0;
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<100;i++){
            System.out.println("ingrese la catidad de ventas: ");
            v=sc.nextInt();
            if(v>=1000000 && v<3000000){
                System.out.println("La comision anual que le corresponde es del 3%");
            }if(v>=3000000 && v<5000000){
                System.out.println("La comision anual que le corresponde es del 4%");
            }if(v>=5000000 && v<7000000){
                System.out.println("La comision anual que le corresponde es del 5%");
            }if(v>=7000000){
                System.out.println("La comision anual que le corresponde es del 6%");
        
            }
        
            
        }
    }
    
}
