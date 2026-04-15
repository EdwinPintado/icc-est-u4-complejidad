import java.util.ArrayList;
import java.util.List;

public class Generador {
    public static List<Estudiante> generarEstudiantes(int cantidad) {
        List<Estudiante> estudiantes = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            String cedula =  i+ "";  //i + "" devuelve un valor texto
            String nombre = "Estudiante_" +i;  // Estudiante_i "valor de i"
            Estudiante estudiante = new Estudiante(nombre, cedula);  
            estudiantes.add(estudiante);  // Agrega el estudiante a la lista de estudiantes
        }
        return estudiantes; // retorna la lista de estudiantes generados
    }
}
