
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Persona{
    private Persona estudiante;
    private int notaPP, notaSP;
    private double notaFinal;
    
    public Estudiante(String nombre, String codigo, int carnet){
        super(nombre, codigo, carnet);
    }
    
    public String notas(int notaPP, int notaSP){
        String respuesta = "";
        this.notaPP = notaPP;
        this.notaSP = notaSP;
        int aux = notaPP + notaSP;
        notaFinal = (double)aux/2;
        if(notaFinal >= 51){
            respuesta = "Aprobado con: " + notaFinal + " puntos";
        }else{
            respuesta = "Reprobado con: "  + notaFinal + " puntos";
        }
        return respuesta;
    }
    
    public String mostrarDatos(){
        return "Estudiante: "+super.mostrarDatos()+ notas(notaPP, notaSP) + "\n" + "\n";
    }
}
