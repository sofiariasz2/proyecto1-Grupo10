package models;

public class RecursoEducativo extends Actividad {
    private String recurso;

    // Constructor que acepta los parámetros necesarios
    public RecursoEducativo(String descripcion, String objetivo, int duracionEsperada, String recurso) {
        super(descripcion, objetivo, duracionEsperada);
        this.recurso = recurso;
    }

    // Getter para el recurso
    public String getRecurso() {
        return recurso;
    }

    // Setter para el recurso
    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    // Método que devuelve los detalles del recurso como un String, en lugar de imprimirlo
    public String obtenerDetalles() {
        return "Recurso Educativo: " + getDescripcion() +
               "\nObjetivo: " + getObjetivo() +
               "\nDuración esperada: " + getDuracionEsperada() + " minutos" +
               "\nEnlace/Referencia: " + recurso;
    }

	
	}


