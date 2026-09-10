package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CinemaTest {

    @Test
    public void deveRetornarMesmaInstancia() {

        Cinema cinema1 = Cinema.getInstance();
        Cinema cinema2 = Cinema.getInstance();

        assertSame(cinema1, cinema2);
    }

    @Test
    public void deveDefinirNomeCinema() {

        Cinema cinema = Cinema.getInstance();

        cinema.setNomeCinema("CineMax");

        assertEquals("CineMax", cinema.getNomeCinema());
    }

    @Test
    public void deveDefinirUsuarioLogado() {

        Cinema cinema = Cinema.getInstance();

        cinema.setUsuarioLogado("Lucas");

        assertEquals("Lucas", cinema.getUsuarioLogado());
    }

    @Test
    public void deveCompartilharMesmaConfiguracao() {

        Cinema cinema1 = Cinema.getInstance();
        Cinema cinema2 = Cinema.getInstance();

        cinema1.setNomeCinema("CineMax");
        cinema1.setUsuarioLogado("Lucas");

        assertEquals("CineMax", cinema2.getNomeCinema());
        assertEquals("Lucas", cinema2.getUsuarioLogado());
    }
}