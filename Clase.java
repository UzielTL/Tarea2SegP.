
/**
 * Write a description of class Clase here.
 * 
 * @author Uziel Ticona Ledezma 
 * @version 20/05/2021
 */
public class Clase{
    private double [] notas;
    public Clase(int cantidad){
        notas = new double [cantidad];
    }
    
    public double [] añadirNota(double [] nota){
        notas= nota;
        return notas;
    }
    
    public double promedioTotal(){
        double res=0;
        for(int i=0;i<notas.length;i++){
            res = res+notas[i];
        }
        return res / notas.length;
    }
    
    public double promedioNotasAprobadas(){
        double res=0;
        double contador=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>=51){
                res= res + notas[i];
                contador++;
            }
        }
        return res / contador;
    }
    
    public double cantidadReprobados(){
        double contador=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]<51){
                contador++;
            }
        }
        return  contador;
    }
    
    public double cantidadAprobados(){
        double contador=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>=51){
                contador++;
            }
        }
        return  contador;
    }
    
    public double notaMasAlta(){
        double notaAlta=0;
        double estado=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>notaAlta){
                notaAlta=notas[i];
            }
        }
        return notaAlta;
    }
    
}
