
/**
 * Write a description of class Reloj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reloj
{
    private int horas;
    private int minutos;
    private int segundos;
    
    public Reloj(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public int getHoras(){
        return horas;
    }
    
    public int getMinutos(){
        return minutos;
    }
    
    public int getSegundos(){
        return segundos;
    }
    
    public void setHoras(int horas){
        this.horas = horas;
    }
    
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }
    
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }
    
    public void avanzarHoras(){
        horas++;
        if(horas>=13) horas=0;
    }
    
    public void avanzarMinutos(){
        minutos++;
        if(minutos>=60){
            minutos=0;
            avanzarHoras();
        }
    }
    
    public void avanzarSegundos(){
        segundos++;
        if(segundos>=60){
            segundos=0;
            avanzarMinutos();
        }
    }
    
    public void retrocederHoras(){
        horas--;
        if(horas<=-1) horas=12;
    }
    
    public void retrocederMinutos(){
        minutos--;
        if(minutos<=-1){
            minutos=59;
            retrocederHoras();
        }
    }
    
    public void retrocederSegundos(){
        segundos--;
        if(segundos<=-1){
            segundos=59;
            retrocederMinutos();
        }
    }
    
}
