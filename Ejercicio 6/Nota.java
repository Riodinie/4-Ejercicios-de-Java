
package segundo;

import java.util.Scanner;

public class Nota {
 
    float nota;
    int opcion = 0;
    
public void preg(){
    
    Scanner datos = new Scanner(System.in);
        
        System.out.println("Digite su nota ( 0 a 10 ):");
        nota=datos.nextFloat();
    
}

public void analisis(){
    
    if((nota>=0)&&(nota<=5.9)){
          opcion=1;
         }else{   
         }if((nota>=6)&&(nota<=7.9)){
          opcion=2;   
         }else{
         }if((nota>=8)&&(nota<=9.5)){
          opcion=3;
         }else{
         }if((nota>=9.6)&&(nota<=10)){
          opcion=4;
         }
}

public void resultado(){
    switch (opcion){
             
             case 1:
                 System.out.println("Su nota es Insuficiente.");
             break; 
             
             case 2:
                 System.out.println("Su nota es Buena.");
             break;
            
             case 3:
                 System.out.println("Su nota es Sobresaliente.");
             break;
             
             case 4:
                 System.out.println("Su nota es Excelente");
             break;
             
             default:
                 System.out.println("La nota que ingreso no es valida.");
             break;
         }
        
}
    
}
