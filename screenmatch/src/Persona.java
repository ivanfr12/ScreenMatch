public class Persona {
    // Variables de instancia privadas
    private String nombre;
    private int edad;

    // Métodos públicos para acceder y modificar las variables
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) { // Validación simple
            this.edad = edad;
        }
    }
}