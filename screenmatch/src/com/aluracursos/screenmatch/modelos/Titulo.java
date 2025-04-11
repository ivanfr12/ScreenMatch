package com.aluracursos.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{

    // Clases metodos para utilizar en la clase de com.aluracursos.screenmatch.principal.Principal.java
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnminutos;
    private boolean incluidoEnElPlan;

    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    // contructores
    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    // Get de los atributos
    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnminutos() {
        return duracionEnminutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    // Setter atributos de las variables privadas

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnminutos(int duracionEnminutos) {
        this.duracionEnminutos = duracionEnminutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    // obtener el return del totalDeLasEvaluaciones
    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Fue lanzada en: " + fechaDeLanzamiento);
        System.out.println("Duracion de la pelicula: " + getDuracionEnminutos());
    }
    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;

    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
