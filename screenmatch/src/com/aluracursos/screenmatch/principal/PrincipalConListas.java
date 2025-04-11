package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        miPelicula.evalua(8);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        miPelicula.evalua(10);
        Serie casaDragon = new Serie("La casa del dragon", 2022);
        miPelicula.evalua(7);

        Pelicula otra = new Pelicula("Jhon Wick", 2014);
        otra.evalua(9);

        Serie serie = new Serie("La casa de papel", 2017);
        serie.evalua(9);

        // Array Lista de peliculas
        List<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);
        lista.add(otra);
        lista.add(serie);

        for (Titulo item : lista) {
            System.out.println("Nombre: " + item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        // Array - Lista de actores
        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Bandera");
        listaDeArtistas.add("Ricardo Darin");
        //Lista desordenada
        System.out.println(listaDeArtistas);

        // Lista ordenada - sort ordena la lista de la A - Z
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados " + lista);

        // Ordenar por fecha de lanzamiento.
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha " + lista);
    }
}
