package Punto2;//CODIGO DE PLATA MONICA Y GARCIA MARIA
import java.util.Scanner;

public class PCita {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System .in);

        //Pedir Datos de la cita por teclado con Scanner
        System.out.println("\t  PUNTO 2:CITA MEDICA");
        System.out.println("      Garcia Maria y Plata Monica");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese el numero de la Cita:");
        int numero = datos.nextInt();
        System.out.println("Ingrese el tipo de cita (Numero de 1 al 5):");
        int tipo = datos.nextInt();
        System.out.println("Ingrese la tarifa de la cita: ");
        double tarifa = datos.nextDouble();
        System.out.println("");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        //Instancia Cita
        Cita cita = new Cita(numero, tipo, tarifa);
        
        //Especificamos Tipo
        String tipo_ = "Especialista";
        if(cita.getTipo().equals(tipo_)){
            tipo_= "incremento del \n\t\t  50%";
        }else{
            tipo_= "descuento del \n\t\t   50%";
        }
        
        //Tipo de cita CORRECTO (1-5)
        if((tipo<6)&&(tipo>0)){
        
            //Imprime en consola la Factura
            System.out.println("");
            System.out.println("");
            System.out.println("\t    FACTURA DE LA CITA");
            System.out.println("--------------------------------------------");
            System.out.println("Numero de la cita: "+cita.getNumero());
            System.out.println("Tipo de cita: : "+cita.getTipo());
            System.out.println("Tarifa normal: "+cita.getTarifa());
            System.out.println("Tarifa Final: "+cita.calcularValorFinal());
            System.out.println("--------------------------------------------");
            System.out.println("\tPor ser de tipo "+cita.getTipo()+"\n    La tarifa tiene un "+tipo_);
            System.out.println("--------------------------------------------");   
        
        //Tipo de Cita INCORRECTO
        }else{
            
            //Mensaje de error
            System.out.println("");
            System.out.println("");            
            System.out.println("####################################");
            System.out.println("   El tipo de cita es incorrecto.");  
            System.out.println("####################################");
        }
    }  
}