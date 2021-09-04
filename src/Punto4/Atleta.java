package Punto4;//CODIGO DE PLATA MONICA Y GARCIA MARIA
import java.util.Scanner;

class Atleta{
    
    //Declaramos Variables estaticas
    static String nombre[];
    static String nacionalidad[];
    static double tiempo[];
    static int totalAtletas;
    static double may=0;
    static String nacionalidadpais;
    static String nombreatletapais;
    static double sumTiempo=0;
    ///Variable logica 
    boolean P = true;

    //Scanners
    Scanner dato = new Scanner (System .in);
    Scanner dato2 = new Scanner (System .in);
    
    
    //1-Registro de Atletas
    public void registrarAtleta(){
      
      System.out.println("-------------------------------------------");
      System.out.println("-------------------------------------------");  
      System.out.println("\t    REGISTRAR ATLETAS");
      System.out.println("");
      System.out.println("Cantidad de atletas:");
      totalAtletas = dato.nextInt();
      
      P=false;//confirma que ya hay atletas registrados
      
      //Se inicilizan con el valor de totalAtleta
      nombre = new String[totalAtletas];
      nacionalidad = new String[totalAtletas];
      tiempo = new double[totalAtletas];  
        
        for(int i=0;i<totalAtletas;i++){
            
            System.out.println("\t\tAtleta N°"+(i+1));
            System.out.println("Nombre:");
            nombre[i] = dato2.nextLine();
            
            System.out.println("Nacionalidad: ");
            nacionalidad[i] = dato2.nextLine();
            
            System.out.println("Tiempo del atleta (minutos): ");
            tiempo[i] = dato.nextDouble();
            System.out.println("-------------------------------------------");
            sumTiempo=sumTiempo+tiempo[i];
            System.out.println("");
        }
        
    }
        
        //3-Atleta por pais
        public void atletaPais(){
        
         System.out.println("-------------------------------------------");
         System.out.println("-------------------------------------------");
         System.out.println("\t    ATLETAS POR PAÍS");
         System.out.println("");
         
         if(P==false){//Si p=true; entonces no sean registrado atletas
             
         System.out.println("Ingrese nacionalidad: ");
         nacionalidadpais = dato2.nextLine();
         System.out.println("");
         System.out.println("Atletas de nacionalidad "+nacionalidadpais+":");
         
         
          for (int i=0;i<totalAtletas;i++){
              if(nacionalidadpais==null ? nacionalidad[i] == null: nacionalidadpais.equals(nacionalidad[i])){
                  /*operador ternario (condicion)?valor1:valor2
                  recibe el valor1 cuando la condición sea true
                  o  el valor2 cuando la condición sea false.*/
                  nombreatletapais=nombre[i];
                  System.out.println(nombreatletapais);
                }
            }
          
        //Mensaje de errror
        }else{
        
         System.out.println(""); 
         System.out.println("###########################################");
         System.out.println("       No hay atletas registrados.");   
         System.out.println("###########################################");
        }
    }
}
