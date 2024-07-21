package Punto1;//CODIGO DE PLATA MONICA Y GARCIA MARIA
import java.util.Scanner;

public class Datos{

    //Variables Datos
    private int cedula;
    private String nombres;
     
    //Pedir Datos del empleado por teclado con Scanner
    public void PedirDatos(){
        Scanner datos = new Scanner (System .in);
        
        System.out.println("\tPUNTO 1:SALARIO NETO");
        System.out.println("    Garcia Maria y Plata Monica");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese el nombre completo del empleado:");
        nombres = datos.nextLine();
        System.out.println("Ingrese la cedula del empleado:");
        cedula = datos.nextInt();
        
    }
    
    //Imprime en consola los datos del empleado
    public void Fact1(){
        
        //Parte superior de la factura
        System.out.println("");
        System.out.println("");
        System.out.println("\t FACTURA DEL EMPLEADO");
        System.out.println("-------------------------------------------");
        System.out.println("INFORMACION DEL EMPLEADO");
        System.out.println("Nombre: "+nombres);
        System.out.println("Cedula: "+cedula); 
    }
}

