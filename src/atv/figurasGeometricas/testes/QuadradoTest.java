package atv.figurasGeometricas.testes;

import atv.figurasGeometricas.src.Quadrado;
import junit.framework.TestCase;

public class QuadradoTest extends TestCase {

    public void setUp() throws Exception {
        Quadrado quadrado2 = new Quadrado(3);
        super.setUp();
    }

    public void testGetLado() {
        Quadrado quadrado = new Quadrado(4);
        assertEquals(4, quadrado.getLado(), 0.0001);
    }

    public void testSetLado() {
        Quadrado quadrado = new Quadrado(3);
        quadrado.setLado(4);
        assertEquals(4, quadrado.getLado(), 0.0001);
    }

    public void testGetArea() {
        Quadrado quadrado = new Quadrado(4);
        assertEquals(16, quadrado.getArea(), 0.0001);
    }

    public void testGetPerimetro() {
        Quadrado quadrado = new Quadrado(3);
        assertEquals(12, quadrado.getPerimetro(), 0.0001);
    }

    public void testGetTipoFigura() {
        Quadrado quadrado = new Quadrado(3);
        assertEquals("Quadrado", quadrado.getTipoFigura());
    }

    public void testCompareTo() {
        Quadrado q1 = new Quadrado(3);
        Quadrado q2 = new Quadrado(4);
        assertTrue(q1.compareTo(q2) < 0);

        Quadrado q3 = new Quadrado(5);
        Quadrado q4 = new Quadrado(4);
        assertTrue(q1.compareTo(q2) > 0);

        Quadrado q5 = new Quadrado(4);
        Quadrado q6 = new Quadrado(4);
        assertEquals(0, q1.compareTo(q2));
    }
}