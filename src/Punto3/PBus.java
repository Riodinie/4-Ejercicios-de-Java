package Punto3;//CODIGO DE PLATA MONICA Y GARCIA MARIA
import java.util.Scanner;

public class PBus {

    public static void main(String[] args) {
        
        //Variables Datos
        int pasajeross;
        int pasajerosb;
        
        //Pedir datos del Bus por teclado con Scanner
        Scanner datos=new Scanner(System .in);
        
        System.out.println("\t\tPUNTO 3:BUS");
        System.out.println("    Garcia Maria y Plata Monica");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese la placa del bus:");
        String placa=datos.nextLine();
        System.out.println("Ingrese el precio del pasaje en el bus por persona:");
        double pasaje=datos.nextDouble();
        System.out.println("Ingrese la capacidad de pasajeros del bus:");
        int capacidad=datos.nextInt();
        System.out.println("Ingrese los pasajeros actuales:");
        int pasajerosActuales=datos.nextInt();
         
        //Cantidad de Pasajeros
        if (pasajerosActuales > capacidad){
            //Capcidad de pasajeros al maximo
            System.out.println("");
            System.out.println("###############################################################");
            System.out.println(" Los pasajeros actuales superan la capacidad del cupo del bus.");  
            System.out.println("################################################################");
        
        }else{
            
            //Instancia Bus
            Bus buss=new Bus(placa, capacidad, pasaje, pasajerosActuales);
            
            System.out.println("Ingrese la cantidad de pasajeros que subieron al bus:");
            pasajeross= datos.nextInt();
            buss.subirPasajeros(pasajeross);
         
            System.out.println("Ingrese la cantidad de pasajeros que bajaron del bus:");
            pasajerosb = datos.nextInt();
            buss.bajarPasajeros(pasajerosb);
            System.out.println("");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            
            //Imprimir en consola Factura del Bus
            System.out.println("");
            System.out.println("");
            System.out.println("\t    FACTURA DEL BUS");
            System.out.println("--------------------------------------------");
            System.out.println("INFORMACION DEL BUS: ");
            System.out.println("Placa: "+buss.getPlaca());
            System.out.println("Capacidad maxima: "+buss.getCapaciad()+" pasajeros.");
            System.out.println("Prercio del pasaje:: "+buss.getPrecioPasaje());
            System.out.println("--------------------------------------------");
            System.out.println("Pasajeros que Subieron: "+pasajeross);
            System.out.println("Pasajeros que Bajaron: "+pasajerosb);
            System.out.println("--------------------------------------------"); 
            System.out.println("BALANCE FINAL DEL BUS");
            System.out.println("TOTAL pasajeros que Subieron: "+buss.getPasajerosTotales());
            System.out.println("TOTAL Dinero de los Pasajes: "+buss.getdineroAcumulado());
            System.out.println("TOTAL pasajeros Actualmente: "+buss.getPasajerosActuales());
        } 
    }   
}
