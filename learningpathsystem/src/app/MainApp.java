
import controller.Controlador;
import controller.ControlPath;
import controller.ControlActividad;
import models.LearningPath;
import models.Actividad;
import models.Encuesta;
import models.Quiz;
import models.RecursoEducativo;
import usuarios.Estudiante;
import usuarios.Profesor;

import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        // Instanciar el controlador principal del sistema
        Controlador controlador = new Controlador();

        // Crear profesores
        Profesor profesor1 = new Profesor("Carlos Pérez", "cperez@learning.com");
        Profesor profesor2 = new Profesor("Lucía Gómez", "lgomez@learning.com");

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Ana Martínez", "amartinez@learning.com");
        Estudiante estudiante2 = new Estudiante("Juan López", "jlopez@learning.com");

        // Crear un Learning Path usando Controlador (que internamente usará ControlPath)
        LearningPath learningPath1 = controlador.crearLearningPath(
                "Aprender Programación en Java",
                "Un curso completo para aprender programación en Java desde cero",
                "Intermedio",
                new Date(), // Fecha de creación
                profesor1  // El profesor que crea el Learning Path
        );

        // Crear actividades para el Learning Path
        String[] preguntasEncuesta = {"¿Qué te pareció el curso?", "¿Cómo mejorarías el contenido?"};
        Actividad actividad1 = new RecursoEducativo("Video Introducción a Java", 
                "Video sobre conceptos básicos de Java", 30, "https://videojava.com");
        Actividad actividad2 = new Quiz("Quiz sobre Java básico", 
                "Preguntas de opción múltiple sobre conceptos básicos", 20, 
                new String[]{"¿Qué es una clase?", "¿Qué es un objeto?"}, 
                new String[][]{
                    {"Entidad", "Método", "Variable", "Función"},
                    {"Instancia", "Tipo de dato", "Método", "Ninguna de las anteriores"}
                });
        Actividad actividad3 = new Encuesta("Encuesta de Satisfacción", 
                "Encuesta sobre el curso", 10, preguntasEncuesta);

        // Añadir actividades al Learning Path usando el Controlador (internamente usará ControlPath)
        controlador.agregarActividadALearningPath(learningPath1, actividad1);
        controlador.agregarActividadALearningPath(learningPath1, actividad2);
        controlador.agregarActividadALearningPath(learningPath1, actividad3);

        // Mostrar los Learning Paths creados
        controlador.mostrarLearningPaths();

        // Inscribir a un estudiante en el Learning Path
        controlador.inscribirEstudianteEnLearningPath(estudiante1, learningPath1);

        // El estudiante realiza algunas actividades (internamente usa ControlActividad)
        controlador.realizarActividad(estudiante1, actividad1);  // Completa el recurso educativo
        controlador.realizarActividad(estudiante1, actividad2);  // Completa el quiz

        // Dejar feedback en las actividades (internamente usa ControlActividad)
        controlador.dejarFeedback(estudiante1, actividad1, "Excelente video sobre Java", 5);
        controlador.dejarFeedback(estudiante1, actividad2, "El quiz fue un poco complicado, pero interesante", 4);

        // Ver el progreso del estudiante en el Learning Path
        controlador.mostrarProgresoEstudiante(estudiante1, learningPath1);

        // Finalizar el programa mostrando la información recopilada
        System.out.println("El estudiante ha completado algunas actividades. Fin del programa.");
    }
}
