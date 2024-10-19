package controller;

import models.LearningPath;
import models.Actividad;
import usuarios.Estudiante;

import java.util.Map;
import java.util.ArrayList;
import java.util.Date;


public class ControlPath {
	
	private String nombrePath;
	private boolean enCurso;
	private Date fechaInicio;
	private Date fechaFinalizacion;
	private int totalActividades;// cuantas actividades hay en el learning path 
	private int actividadesCompletadas;// cantidad de actividades completadas
	private float progreso;//progreso en porcentaje 
	private ArrayList<ControlActividad> actividades;// Lista de actividades dentro del learning path 
	
	//constructor
	
	public ControlPath(String nombrePath, boolean enCurso, Date fechaInicio, Date fechaFinalizacion,
			int totalActividades, int actividadesCompletadas, float progreso, ArrayList<ControlActividad> actividades) {
		super();
		this.nombrePath = nombrePath;
		this.enCurso = false;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.totalActividades = totalActividades;
		this.actividadesCompletadas = 0;
		this.progreso = progreso;
		this.actividades = new ArrayList<>(); // se inicializa la lista de actividades que tiene el learning path 
	}
	
	//metodo para iniciar el learning path 
	
	public void iniciarLearningPath() {
		
		
		this.fechaInicio= new Date();//fecha actual
		this.enCurso= true;
		
	
	}
	//metodo para iniciar el learning path 
	
	public void finalizarLearningPath() {
			
			
		this.fechaFinalizacion = new Date();//fecha actual
		this.progreso=100; //completado
		this.enCurso= false;
			
		
	}
	
	//metodo para actualizar el progreso
	public void actualizarProgreso(float nuevoProgreso) {
		
		if (nuevoProgreso >=0 && nuevoProgreso <= 100) {
			
			
			this.progreso= nuevoProgreso;
			
		}
		
		else {
			
			System.out.println("Progreso invalido. Debe estar entre 0 y 100");
			
		}
		
	}
	
	//metodo para agregar una actividad completada y actualizar el progreso automaticamente 
	public void agregarActividadCompletada() {
		
		if (actividadesCompletadas < totalActividades) {
			
			actividadesCompletadas++;
			this.progreso = ((float) actividadesCompletadas/totalActividades)*100;
			
		}
	}
	
	//metodo para verificar si el learning path ya se completo 
	
	public boolean esLearningPathCompletado() {
		
		return this.progreso==100;
	}
	
	//metodo para agregar una nueva actividad a la lista de control actividades

	public void agregarControlActividad(ControlActividad controlActividad) {
		
		actividades.add(controlActividad);
		
	}
	
	
	//metodo para obtener la lista de actividades
	
	public ArrayList<ControlActividad> getActividades(){
		
		return actividades;
	}
	
	//getters para acceder a los datos del learning path (se usa en controlador)
	public String getNombrePath() {
		return nombrePath;
	}

	public boolean isEnCurso() {
		return enCurso;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public int getActividadesCompletadas() {
		return actividadesCompletadas;
	}

	public float getProgreso() {
		return progreso;
	}
	
		
	
	
	

}
