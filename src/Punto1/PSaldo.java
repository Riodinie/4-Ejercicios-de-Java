package Punto1;//CODIGO DE PLATA MONICA Y GARCIA MARIA

public class PSaldo {

    public static void main(String[] args) {
        
        //Instancias
        Datos d1=new Datos();
        SalarioNeto s1=new SalarioNeto();
        
        //Ejecutando Metodos
        d1.PedirDatos();
        s1.SueldoDevengado();
        s1.AuxilioTrans();
        s1.Comision();
        s1.SalarioNeto();
        
        //Factura completa
        d1.Fact1();
        s1.Fact2();
    }
}
