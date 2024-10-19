package models;

import java.util.ArrayList;
import feedback.Feedback;

public class LearningPath {
    private String creador;
    private String titulo;
    private String descripcion;
    private int nivelDificultad;
    private int duracionTotal;
    public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getNivelDificultad() {
		return nivelDificultad;
	}
	public void setNivelDificultad(int nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}
	public int getDuracionTotal() {
		return duracionTotal;
	}
	public void setDuracionTotal(int duracionTotal) {
		this.duracionTotal = duracionTotal;
	}
	public ArrayList<Actividad> getActividades() {
		return actividades;
	}
	public void setActividades(ArrayList<Actividad> actividades) {
		this.actividades = actividades;
	}
	public ArrayList<Feedback> getFeedback() {
		return feedback;
	}
	public void setFeedback(ArrayList<Feedback> feedback) {
		this.feedback = feedback;
	}
	private ArrayList<Actividad> actividades;
    private ArrayList<Feedback> feedback;

    // Métodos: agregarActividad, eliminarActividad, calcularDuracion, etc.
}
