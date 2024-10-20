package main;

import models.LearningPath;
import models.RecursoEducativo;
import usuarios.Profesor;
import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        // Crear un profesor
        Profesor profesor1 = new Profesor("Carlos Pérez", "cperez@learning.com");

        // Crear un Learning Path
        LearningPath learningPath1 = profesor1.crearLearningPath(
                "Aprender Programación en Java", 
                "Curso para aprender Java desde cero", 
                "Introducción a la programación orientada a objetos", 
                "Contenido de programación en Java", 
                2  // Nivel de dificultad
        );

        // Crear una actividad (Recurso Educativo)
        RecursoEducativo actividad1 = new RecursoEducativo("Video Introducción a Java", "Aprender los conceptos básicos de Java", 30, "https://videojava.com");

        // Agregar la actividad al Learning Path
        profesor1.agregarActividadALearningPath(learningPath1, actividad1);

        // Mostrar los Learning Paths creados por el profesor
        profesor1.mostrarLearningPaths();

        // Modificar el Learning Path
        profesor1.modificarLearningPath(learningPath1, "Java para Principiantes", "Curso básico de programación en Java", 1);

        // Eliminar la actividad del Learning Path
        profesor1.eliminarActividadDeLearningPath(learningPath1, actividad1);
    }
}




