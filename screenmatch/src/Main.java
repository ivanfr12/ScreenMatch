public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        // Accediendo y modificando los datos mediante métodos públicos
        persona.setNombre("Juan");
        persona.setEdad(25);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        // Modificando los datos de manera controlada
        persona.setEdad(30);
        System.out.println("Edad actualizada: " + persona.getEdad());
    }
}