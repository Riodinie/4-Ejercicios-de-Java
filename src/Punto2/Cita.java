package Punto2;//CODIGO DE PLATA MONICA Y GARCIA MARIA

public class Cita {
    
    //Atributos 
    private int numero, tipo;
    private double tarifa, valorFinal=0;

    //Constructor
    public Cita(int numero,int tipo,double tarifa){
        this.numero = numero;
        this.tipo = tipo;
        this.tarifa = tarifa;        
    }

    //Get Numero
    public int getNumero() {
        return numero;
    }
    
    //Get Tipo; Estructura para asginar por medio del numero
    public String getTipo() { 
        
        if ((tipo <=3)&&(tipo>0)) {
            return "General";
        }else if(tipo==4 || tipo ==5){
            return "Especialista";
        }
        return "NADA";
    }

    //Get Tarifa
    public double getTarifa() {
        return tarifa;
    }
    
    //Calcular el Valor Final de la Tarifa
    public double  calcularValorFinal(){
        double porc= tarifa * 50 /100;
        if ((tipo <=3)&&(tipo>0)) {
            valorFinal = tarifa - porc;
        } else if(tipo==4 || tipo ==5){ 
            valorFinal = tarifa + porc;
        }
        return valorFinal;        
    }
}
