package br.com.dio.desafio.dominio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

class MentoriaTest {

    @Test
    void testCalcularXp() {
        Mentoria mentoria = new Mentoria();
        assertEquals(30.0, mentoria.calcularXp());
    }

    @Test
    void testGettersAndSetters() {
        Mentoria mentoria = new Mentoria();
        LocalDate data = LocalDate.now();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria sobre Java avançado");
        mentoria.setData(data);

        assertEquals("Mentoria Java", mentoria.getTitulo());
        assertEquals("Mentoria sobre Java avançado", mentoria.getDescricao());
        assertEquals(data, mentoria.getData());
    }
}