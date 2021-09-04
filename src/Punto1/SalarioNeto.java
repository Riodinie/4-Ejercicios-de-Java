package Punto1;//CODIGO DE PLATA MONICA Y GARCIA MARIA
import java.util.Scanner;

public class SalarioNeto{
    
    //Variables Datos
    public int salarioB, diasL, auxT, ventas, smlv2, prestamo; ///Ingresadas por el usuario
    public int sueldoD, comisionV, totalDev, salarioNETO;      ///Resultado de los metodos

    //Pedir Datos del sueldo por teclado con Scanner
    public void SueldoDevengado(){
        Scanner datos=new Scanner(System.in);
        
        System.out.println("Digite el salario del empleado: ");
        salarioB=datos.nextInt();                   //Salario Basico
        System.out.println("Digite los dias laborales del empleado (entre 1 a 30 dias): ");
        diasL=datos.nextInt();                      //Dias laborales
         
        sueldoD=salarioB*diasL/30;                  ///Sueldo Devengado
    }
   
    //Calcula Auxilio de Transporte
    public void AuxilioTrans(){
        smlv2=737717*2; 
       
        if(salarioB<=smlv2){
            auxT=83140*diasL/30;
            System.out.println("\t***Cuenta con auxilio de transporte***");
    }else{
            System.out.println("\t***No cuenta con auxilio de transporte***");
        }
    }
    
    //Calcular Comision de Ventas
    public void Comision(){
        Scanner datos=new Scanner(System.in);
        
        System.out.println("Digite el valor de venta del mes: ");
        ventas=datos.nextInt();                     //Ventas
         
        comisionV=ventas*=0.02;                      ///Comision(2%)            
    }
    
    //Calcular Salario NETO
    public void SalarioNeto(){
        Scanner datos=new Scanner(System.in);
        
        totalDev=sueldoD+=comisionV;                //Total Devengado
              
        System.out.println("Digite el valor del prestamo:");
        prestamo=datos.nextInt();                   //Prestamo
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        salarioNETO= totalDev -= prestamo;          ///Salario Neto
    }
    
    //Imprime en consola los datos del salario
    public void Fact2(){
        
        //Parte inferior de la factura
        System.out.println("-------------------------------------------");
        System.out.println("SALARIO NETO DEL EMPLEADO");
        System.out.println("-------------------------------------------");
        System.out.println("Salario Basico: "+salarioB);
        System.out.println("Auxilio de Transporte: "+auxT);
        System.out.println("Comision de venta: "+comisionV);
        System.out.println("____________________________________________");
        System.out.println("SALARIO NETO a recibir: "+salarioNETO);
        System.out.println("____________________________________________");        
    }
}

                     