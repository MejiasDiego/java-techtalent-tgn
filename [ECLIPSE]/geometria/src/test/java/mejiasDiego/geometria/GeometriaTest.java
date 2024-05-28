package mejiasDiego.geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeometriaTest {

    private Geometria geometria;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        geometria = new Geometria();
    }

    @AfterEach
    void tearDown() throws Exception {
        geometria = null;
    }

    @Test
    void testAreaCuadrado() {
        assertEquals(25, geometria.areacuadrado(5));
    }

    @Test
    void testAreaCirculo() {
        assertEquals(28.2744, geometria.areaCirculo(3), 0.0001);
    }

    @Test
    void testAreaTriangulo() {
        assertEquals(10, geometria.areatriangulo(5, 4));
    }

    @Test
    void testAreaRectangulo() {
        assertEquals(20, geometria.arearectangulo(5, 4));
    }

    @Test
    void testAreaPentagono() {
        assertEquals(30, geometria.areapentagono(10, 6));
    }

    @Test
    void testAreaRombo() {
        assertEquals(12, geometria.arearombo(6, 4));
    }

    @Test
    void testAreaRomboide() {
        assertEquals(24, geometria.arearomboide(6, 4));
    }

    @Test
    void testAreaTrapecio() {
        assertEquals(18, geometria.areatrapecio(8, 4, 3));
    }

    @Test
    void testFigura() {
        assertEquals("cuadrado", geometria.figura(1));
        assertEquals("Circulo", geometria.figura(2));
        assertEquals("Triangulo", geometria.figura(3));
        assertEquals("Rectangulo", geometria.figura(4));
        assertEquals("Pentagono", geometria.figura(5));
        assertEquals("Rombo", geometria.figura(6));
        assertEquals("Romboide", geometria.figura(7));
        assertEquals("Trapecio", geometria.figura(8));
        assertEquals("Default", geometria.figura(9));
    }

    @Test
    void testGettersAndSetters() {
        geometria.setId(10);
        assertEquals(10, geometria.getId());

        geometria.setNom("Octagono");
        assertEquals("Octagono", geometria.getNom());

        geometria.setArea(100.0);
        assertEquals(100.0, geometria.getArea(), 0.0001);
    }

    @Test
    void testConstructorWithId() {
        Geometria geom = new Geometria(1);
        assertEquals(1, geom.getId());
        assertEquals("cuadrado", geom.getNom());
    }

    @Test
    void testDefaultConstructor() {
        Geometria geom = new Geometria();
        assertEquals(9, geom.getId());
        assertEquals("Default", geom.getNom());
    }

    @Test
    void testToString() {
        geometria.setId(10);
        geometria.setNom("Octagono");
        geometria.setArea(100.0);
        assertEquals("Geometria [id=10, nom=Octagono, area=100.0]", geometria.toString());
    }
}
