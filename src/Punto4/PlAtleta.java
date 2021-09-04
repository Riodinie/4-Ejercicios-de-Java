package Punto4;//CODIGO DE PLATA MONICA Y GARCIA MARIA
import java.util.Scanner;
import java.io.IOException;

public class PlAtleta {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        //Instancias        
        Atleta atleta = new Atleta();
        Competencia competencia = new Competencia();
        Scanner numero = new Scanner (System .in);
        
        int op;
            System.out.println("\t     PUNTO 4: ATLETAS");
            System.out.println("\tGarcia Maria y Plata Monica");
        do{ 
            //Menu principal
            System.out.println("-------------------------------------------");
            System.out.println("-------------------------------------------");
            System.out.println("");
            System.out.println("                   MENU               ");
            System.out.println("     **********************************"
             + "\n    *  1. Registrar atleta            *"
             + "\n    *  2. Datos del campeón           *"
             + "\n    *  3. Atletas por país            *"
             + "\n    *  4. Tiempo promedio             *"
             + "\n    *  5. Salir                       *");
            System.out.println("     **********************************");
            System.out.println("");
            
            System.out.print("     Digite un número:");
            op = numero.nextInt(); 
 
            System.out.println("");
            
            switch(op){
                
            case 1:
                atleta.registrarAtleta();
                break;
                    
            case 2:
                competencia.datosCampeon();
                break;
                
            case 3:
                atleta.atletaPais();
                break;
                
            case 4:
                competencia.promedioAtletas();
                break;
                
            case 5:
                //Salir
                System.out.println("-------------------------------------------");
                System.out.println("|-----------------------------------------|");
                System.out.println("||        Cerrando el programa.          ||");
                System.out.println("|-----------------------------------------|");
                System.out.println("-------------------------------------------");
                break;
                
            default:
                //Mensaje error
                System.out.println("");
                System.out.println("###########################################");
                System.out.println("#           Numero no valido.             #");
                System.out.println("###########################################");
                break;
            }
        
        }while(op!=5);
    } 
    
}
