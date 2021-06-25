
/**
 * Write a description of class Administrativo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrativo extends Persona{
    private Persona administrativo;
    private String areaTrabajo;
    private int hrsTrabajo, antiguedad;//hrsTrabajo al mes y antiguedad en anios
    private int diasVacacion;
    public Administrativo(String nombre, String codigo, int carnet, String areaTrabajo){
        super(nombre, codigo, carnet);
        this.areaTrabajo = areaTrabajo;
    }
    
    public String calcularVacaciones(int hrsTrabajo, int antiguedad){
        String respuesta = "";
        this.hrsTrabajo = hrsTrabajo;
        this.antiguedad = antiguedad;
        if(hrsTrabajo <=18 && antiguedad<=5){ 
            respuesta = "tiene derecho a: 4 dias de vacacion";
        }else if(hrsTrabajo >18 && antiguedad>5){
            if(hrsTrabajo <= 54 && antiguedad<=10){
                respuesta = "tiene derecho a: 8 dias de vacacion";
            }
        }else if(hrsTrabajo > 54 && antiguedad>10){
            respuesta = "tiene derecho a: 15 dias de vacacion";
        }   
        return respuesta;
    
    } 
    
    public String mostrarDatos(){
        return "Administrativo: "+super.mostrarDatos()+"Con el cargo: "+areaTrabajo+"\n"
                +"Horas de trabajo al mes: "+hrsTrabajo+"\n"+"Antiguedad: "
                +antiguedad+" anios"+"\n"+calcularVacaciones(hrsTrabajo,antiguedad)+"\n" + "\n";
    } 
}
