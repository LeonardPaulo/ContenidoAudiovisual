package com.audiovisual.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeliculaTest {

    @Test
    public void testGetResumen() {
        Pelicula pelicula = new Pelicula("Inception", 2010, "Christopher Nolan");
        assertEquals("Película: Inception (2010), Director: Christopher Nolan", pelicula.getResumen());
    }
}
