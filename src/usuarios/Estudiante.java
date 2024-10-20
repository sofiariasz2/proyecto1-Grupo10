package usuarios;

import java.util.ArrayList;
import models.LearningPath;

public class Estudiante extends Usuario {
    private ArrayList<LearningPath> learningPathsInscritos;

    // Constructor
    public Estudiante(String nombre, String email) {
        super(nombre, email);  // Llama al constructor de Usuario
        this.learningPathsInscritos = new ArrayList<>();
    }

    // Método para inscribirse en un Learning Path
    public void inscribirseEnLearningPath(LearningPath learningPath) {
        this.learningPathsInscritos.add(learningPath);
        System.out.println(getNombre() + " se ha inscrito en el Learning Path: " + learningPath.getTitulo());
    }

    // Mostrar los Learning Paths en los que está inscrito
    public void mostrarLearningPathsInscritos() {
        System.out.println("Learning Paths inscritos para " + getNombre() + ":");
        for (LearningPath lp : learningPathsInscritos) {
            System.out.println("- " + lp.getTitulo());
        }
    }
}
