package Punto3;//CODIGO DE PLATA MONICA Y GARCIA MARIA

public class Bus{
    
    //Atributos
    private int capacidadPasajeros, pasajerosActuales, totalPasajeros;
    private String placa;
    private double precioPasaje;

    //Constructor
    public Bus (String placa, int capacidad, double pasaje, int pasajerosActuales){
        this.placa = placa;
        this.capacidadPasajeros=capacidad;
        this.precioPasaje=pasaje;
        this.pasajerosActuales=pasajerosActuales;    
    }
    
    //Get Placa
    public String getPlaca(){
        return placa;
    }

    //Get Capacidad
    public int getCapaciad(){
        return capacidadPasajeros;
    }    
   
    //Get Precio del Pasaje
    public double getPrecioPasaje(){
        return precioPasaje;
    }
    
    //Get Pasajeros actuales
    public int getPasajerosActuales(){
        return pasajerosActuales;        
    }
       
    //Get Pasajeros Totales
    public int getPasajerosTotales(){
        return totalPasajeros;  
    }
   
    //Pasajeros a Subir
    public void subirPasajeros(int pasajeros){
        
        //Comprovar si los psajeros actuales no sobre pasan el limite
        if (pasajerosActuales > capacidadPasajeros){
            System.out.println("");
            System.out.println("###############################################################");
            System.out.println("No se puede subir "+pasajeros+" pasajeros por SOBRECUPO.");
            System.out.println("###############################################################");
            totalPasajeros=pasajerosActuales;
            System.out.println("");

        //Pasajeros que pueden subir
        }else if(pasajerosActuales + pasajeros > capacidadPasajeros){
            System.out.println("");
            System.out.println("###############################################################");
            System.out.println("No se puede subir "+pasajeros+" pasajeros por SOBRECUPO.");
            pasajeros=capacidadPasajeros-pasajerosActuales;
            System.out.println("Por lo que solo se permitira subir a "+pasajeros+" pasajeros.");
            System.out.println("###############################################################");
            System.out.println("");
            
            totalPasajeros=pasajerosActuales+ pasajeros;
            pasajerosActuales=pasajerosActuales+pasajeros;
        }else{
            totalPasajeros=pasajerosActuales+pasajeros;
            pasajerosActuales=pasajerosActuales+pasajeros;
        }
    }
   
    //Pasajeros a Bajar
    public void bajarPasajeros(int pasajeros){
        
        //Comprobar que la cantidad de pajeros que se bajan sea mayor a la existente
        if (pasajeros > pasajerosActuales){
            //Mensaje de error
            System.out.println("");
            System.out.println("###############################################################");
            System.out.println("La cantidad de pasajeros que desea bajar es mayor al numero "
            + "\nde pasajeros actuales.");
            System.out.println("###############################################################");
            System.out.println("");
        } else {      
            pasajerosActuales= pasajerosActuales-pasajeros;
        }
    } 
    
    //Total del Dinero Acumulado
    public double getdineroAcumulado(){
        
        double dineroAcumulado;
        dineroAcumulado=totalPasajeros*precioPasaje;
        return dineroAcumulado;        
    }      
}
