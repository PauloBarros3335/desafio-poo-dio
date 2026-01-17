package br.com.dio.desafio.dominio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void testCalcularXp() {
        Curso curso = new Curso();
        curso.setCargaHoraria(8);
        assertEquals(80.0, curso.calcularXp());
    }

    @Test
    void testGettersAndSetters() {
        Curso curso = new Curso();
        curso.setTitulo("Java Basics");
        curso.setDescricao("Curso introdutório de Java");
        curso.setCargaHoraria(10);

        assertEquals("Java Basics", curso.getTitulo());
        assertEquals("Curso introdutório de Java", curso.getDescricao());
        assertEquals(10, curso.getCargaHoraria());
    }
}