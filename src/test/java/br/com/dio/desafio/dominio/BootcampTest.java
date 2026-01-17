package br.com.dio.desafio.dominio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BootcampTest {

    @Test
    void testGettersAndSetters() {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp");

        assertEquals("Bootcamp Java Developer", bootcamp.getNome());
        assertEquals("Descrição do Bootcamp", bootcamp.getDescricao());
        assertNotNull(bootcamp.getConteudos());
        assertNotNull(bootcamp.getDevsInscritos());
    }

    @Test
    void testAdicionarConteudo() {
        Bootcamp bootcamp = new Bootcamp();
        Curso curso = new Curso();
        curso.setTitulo("Java");

        bootcamp.getConteudos().add(curso);

        assertTrue(bootcamp.getConteudos().contains(curso));
    }
}