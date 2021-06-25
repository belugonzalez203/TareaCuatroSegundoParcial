
/**
 * Write a description of class Docente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Docente extends Persona{
    private Persona docente;
    private String materia;
    private int hrsTrabajo, antiguedad;//hrsTrabajo al mes y antiguedad en anios
    private int diasVacacion;
    
    public Docente(String nombre, String codigo, int carnet, String materia){
        super(nombre, codigo, carnet);
        this.materia = materia;
    } 
    
    public String calcularVacaciones(int hrsTrabajo, int antiguedad){
        String respuesta = "";
        this.hrsTrabajo = hrsTrabajo;
        this.antiguedad = antiguedad;
        if(hrsTrabajo <=18 && antiguedad<=5){ 
            respuesta = "tiene derecho a: 5 dias de vacacion";
        }else if(hrsTrabajo >18 && antiguedad>5){
            if(hrsTrabajo <= 54 && antiguedad<=10){
                respuesta = "tiene derecho a: 10 dias de vacacion";
            }
        }else if(hrsTrabajo > 54 && antiguedad>10){
            respuesta = "tiene derecho a: 15 dias de vacacion";
        }   
        return respuesta;
    } 
    
    public String mostrarDatos(){
        return "Docente: "+super.mostrarDatos()+"Materia: "+materia+"\n"
                +"Horas de trabajo al mes: "+hrsTrabajo+"\n"+"Antiguedad: "
                +antiguedad+" anios"+"\n"+calcularVacaciones(hrsTrabajo,antiguedad)+"\n" + "\n";
    } 
}
