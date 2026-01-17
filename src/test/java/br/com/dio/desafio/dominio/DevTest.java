package br.com.dio.desafio.dominio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class DevTest {

    @Test
    void testInscreverBootcamp() {
        Dev dev = new Dev();
        dev.setNome("João");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setCargaHoraria(8);
        bootcamp.getConteudos().add(curso);

        dev.inscreverBootcamp(bootcamp);

        assertTrue(dev.getConteudosInscritos().contains(curso));
        assertEquals("João", dev.getNome());
    }

    @Test
    void testProgredir() {
        Dev dev = new Dev();
        Bootcamp bootcamp = new Bootcamp();
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setCargaHoraria(8);
        bootcamp.getConteudos().add(curso);

        dev.inscreverBootcamp(bootcamp);
        dev.progredir();

        assertTrue(dev.getConteudosConcluidos().contains(curso));
        assertFalse(dev.getConteudosInscritos().contains(curso));
    }

    @Test
    void testCalcularTotalXp() {
        Dev dev = new Dev();
        Bootcamp bootcamp = new Bootcamp();
        Curso curso = new Curso();
        curso.setCargaHoraria(8);
        Mentoria mentoria = new Mentoria();
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        dev.progredir();

        assertEquals(110.0, dev.calcularTotalXp()); // 80 + 30
    }
}