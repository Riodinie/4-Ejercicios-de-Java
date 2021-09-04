package Punto4;//CODIGO DE PLATA MONICA Y GARCIA MARIA
//Se llaman a las variables estaticas de la clase atleta
import static Punto4.Atleta.nacionalidad;
import static Punto4.Atleta.nombre;
import static Punto4.Atleta.tiempo;
import static Punto4.Atleta.totalAtletas;
import static Punto4.Atleta.sumTiempo;


public class Competencia {
    
    double men = 100000; 
    String nombremin = null;
    String nacionalidadmin = null;
    double tiempoPromedio;
    
    
    //2-Datos Campeon
    public void datosCampeon(){
                
            for(int i=0;i<totalAtletas;i++){
                if(tiempo[i]<men){
                    men = tiempo[i];
                    nombremin = nombre[i];
                   nacionalidadmin = nacionalidad[i];
                }
            }
            
        //Si nombremin es diferente de null es por que ya se registraron datos
        if(nombremin!=null){
            
           System.out.println("-------------------------------------------");
           System.out.println("-------------------------------------------");
           System.out.println("\t    DATOS CAMPEON");
           System.out.println("");
           System.out.println(""
           + "Nombre: "+nombremin
           + "\nNacionalidad: "+nacionalidadmin
           + "\nTiempo: "+men);
        
        //Mensaje de error
        }else{
            
           System.out.println("");
           System.out.println("###########################################");
           System.out.println("       No hay atletas registrados.");    
           System.out.println("###########################################");
          }
    }
    
    //4-Promedio de tiempo de los atletas
    public void promedioAtletas(){
             tiempoPromedio = sumTiempo/totalAtletas;
             
            //Si no hay atletas registrados sumTiempo = 0 por lo que se verifica con este condicional 
            if(sumTiempo!=0){
            System.out.println("-------------------------------------------");
            System.out.println("-------------------------------------------");
            System.out.println("\t    PROMEDIO DE TIEMPO");
            System.out.println("");
            System.out.println("    El tiempo promedio de todos los "
             + "\n           atletas fue: "+tiempoPromedio);
            
            //Mensaje de error
            }else{
                
            System.out.println("");
            System.out.println("###########################################");
            System.out.println("        No hay atletas registrados."); 
            System.out.println("###########################################");
            }
            
    }
    
}
