
package javaapplication13;

import java.util.Scanner;

public class JavaApplication13 {

    public static void main(String[] args) {
        int ht,s=0,he=0,a,i=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("cantidad de horas trabajadas: ");
            ht=sc.nextInt();
            
            if(ht>35){
                he=ht-35;
                s=(he*22)+(35*15);
            }if(ht<=35){
                s=ht*15;
            }
            System.out.println("SU SALARIO ES: "+s);
            System.out.println("desea calcular otro salario...?");
            System.out.println("[1] si");
            System.out.println("[2] no");
            a=sc.nextInt();
            i++;
            }while(a==1);
            
    }
    
}
