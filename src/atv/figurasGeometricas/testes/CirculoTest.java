package atv.figurasGeometricas.testes;

import atv.figurasGeometricas.src.Circulo;
import junit.framework.TestCase;

public class CirculoTest extends TestCase {
    private Circulo circulo;

    public void setUp() throws Exception {
        circulo = new Circulo(5.0); // Criando um círculo com raio 5
    }

    public void testGetRaio() {
        assertEquals(5.0, circulo.getRaio(), 0.0001);
    }

    public void testSetRaio() {
        circulo.setRaio(10.0);
        assertEquals(10.0, circulo.getRaio(), 0.0001);
    }

    public void testGetArea() {
        double areaEsperada = Math.PI * 5.0 * 5.0; // π * r²
        assertEquals(areaEsperada, circulo.getArea(), 0.0001);
    }

    public void testGetPerimetro() {
        double perimetroEsperado = 2 * Math.PI * 5.0; // 2πr
        assertEquals(perimetroEsperado, circulo.getPerimetro(), 0.0001);
    }

    public void testGetTipoFigura() {
        assertEquals("Círculo", circulo.getTipoFigura());
    }

    public void testCompareTo() {
        Circulo menor = new Circulo(3.0);
        Circulo maior = new Circulo(7.0);

        assertTrue(menor.compareTo(circulo) < 0);
        assertTrue(maior.compareTo(circulo) > 0);

        Circulo igual = new Circulo(5.0);
        assertEquals(0, circulo.compareTo(igual));
    }
}