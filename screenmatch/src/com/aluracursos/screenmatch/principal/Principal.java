package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // crear una nueva instancia de pelicula
        Pelicula miPelicula = new Pelicula("encanto", 2021);
        miPelicula.setDuracionEnminutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);

        // Imprimir los get - la informacion de las peliculas cargadas
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

//        System.out.println(miPelicula.getNombre());
//        System.out.println(miPelicula.getDuracionEnminutos());
//        System.out.println(miPelicula.getFechaDeLanzamiento());
//        System.out.println(miPelicula.getTotalDeLasEvaluaciones());

        Serie casaDragon = new Serie("La casa del dragon", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnminutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionEnminutos (180);

        // Llamamos a la clase CalculadoraDeTiempo
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos: "
                + calculadora.getTiempoTotal() + " minutos");

        // Llamamos a la clase de FiltroRecomendacion
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtro(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtro(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.setDuracionEnminutos(180);


        // Array Lista de peliculas
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());
        // Imprimir la lista completa
        System.out.println(listaDePeliculas.toString());
        System.out.println("ToString de la pelicula: " + listaDePeliculas.get(0).toString());
    }
}