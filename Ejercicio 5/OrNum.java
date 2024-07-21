
package primero;

import java.util.Scanner;

public class OrNum {
   
int num1,num2,num3;

public void obtm() {

Scanner datos = new Scanner(System.in);
        
        System.out.println("Introduzca 3 números: ");
        
        System.out.print("1#: ");
        num1= datos.nextInt();
        System.out.print("2#: ");
        num2= datos.nextInt();
        System.out.print("3#: ");
        num3= datos.nextInt();
        System.out.println("");
        System.out.println("Números de mayor a menor.");
       
}

public void resul(){
    
    if(num1>num2 && num2>num3){
            
            System.out.print(num1+" - ");
            System.out.print(num2+" - ");
            System.out.print(+num3);
            System.out.println("");
            
        }else{
        }if(num1>num3 && num3>num1){
            
            System.out.print(num1+" - ");
            System.out.print(num3+" - ");
            System.out.print(+num2);
            System.out.println("");
            
        }else{
        }if(num2>num1 && num1>num3){
            
            System.out.print(num2+" - ");
            System.out.print(num1+" - ");
            System.out.print(+num3);
            System.out.println("");
        
        }else{
        }if(num2>num3 && num3>num1){
            
            System.out.print(num2+" - ");
            System.out.print(num3+" - ");
            System.out.print(+num1);
            System.out.println("");
            
        }else{
        }if(num3>num1 && num1>num2){
            
            System.out.print(num3+" - ");
            System.out.print(num1+" - ");
            System.out.print(+num2);
            System.out.println("");
            
        }else{
        }if(num3>num2 && num2>num1){
            
            System.out.print(num3+" - ");
            System.out.print(num2+" - ");
            System.out.print(+num1);
            System.out.println("");
        }
                      }
                   
           
}


    
