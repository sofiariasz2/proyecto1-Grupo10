
package models;


import java.util.ArrayList;
import java.util.Date;

public class Actividad {
	
	public String descripcion;
    public String objetivo;
    public int nivelDificultad;
    public int duracionEsperada;
    public ArrayList<Actividad> prerequisitos;
    public Date fechaLimite;
    public boolean esObligatoria;
    public float rating;
    public int resultado;
	
	//Constructor
    public Actividad(String descripcion, String objetivo, int nivelDificultad, int duracionEsperada, Date fechaLimite, boolean esObligatoria) {
        this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.nivelDificultad = nivelDificultad;
        this.duracionEsperada = duracionEsperada;
        this.fechaLimite = fechaLimite;
        this.esObligatoria = esObligatoria;
        this.prerequisitos = new ArrayList<>();
        this.rating = 0;
        this.resultado = 0;  // Iniciar la actividad como no completada
    }
	
	
	//Metodo que se debe implementar en las subclases	
	public abstract string obtenerResultado();
	
	
	//Metodo para establecer el resultado de la actividad 
	
	
		
		
		
	
	}
	
	
	

}
