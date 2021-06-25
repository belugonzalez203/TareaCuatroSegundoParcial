import java.util.ArrayList;
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona{
    private String nombre;
    private String codigo;
    private int carnet;
    private ArrayList<String> datos;//contiene nombre, codigo, carnet, cargo,etc
    
    public Persona(String nombre, String codigo, int carnet){
        this.nombre = nombre;
        this.codigo = codigo;
        this.carnet = carnet;
        datos = new ArrayList<String>();
    }
    
    private void datos(){
        datos.add(nombre+codigo); 
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public int getCarnet(){
        return carnet;
    }
    
    public String mostrarDatos(){
        return nombre + "\n" + "Codigo: " + codigo + "\n";
    }
}
