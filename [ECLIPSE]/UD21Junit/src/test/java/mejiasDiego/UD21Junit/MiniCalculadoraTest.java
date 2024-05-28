package mejiasDiego.UD21Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MiniCalculadoraTest {

    private MiniCalculadora miniCalculadora;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        miniCalculadora = new MiniCalculadora();
    }

    @AfterEach
    void tearDown() throws Exception {
        miniCalculadora = null;
    }

    @Test
    void testAgregarOperacion() {
        miniCalculadora.getCampoEntrada().setText("5");
        miniCalculadora.agregarOperacion("+");
        miniCalculadora.getCampoEntrada().setText("3");
        miniCalculadora.mostrarResultado();
        assertEquals("8.0", miniCalculadora.getCampoEntrada().getText());
    }

    @Test
    void testMostrarResultado() {
        miniCalculadora.getCampoEntrada().setText("10");
        miniCalculadora.agregarOperacion("-");
        miniCalculadora.getCampoEntrada().setText("2");
        miniCalculadora.mostrarResultado();
        assertEquals("8.0", miniCalculadora.getCampoEntrada().getText());
    }

    @Test
    void testEvaluarExpresion() {
        assertEquals(8.0, miniCalculadora.evaluarExpresion("5+3"));
        assertEquals(6.0, miniCalculadora.evaluarExpresion("8-2"));
        assertEquals(15.0, miniCalculadora.evaluarExpresion("3*5"));
        assertEquals(4.0, miniCalculadora.evaluarExpresion("8/2"));
    }

    @Test
    void testEvaluarExpresionSimple() {
        assertEquals(9.0, miniCalculadora.evaluarExpresionSimple("4+5"));
        assertEquals(5.0, miniCalculadora.evaluarExpresionSimple("10-5"));
        assertEquals(20.0, miniCalculadora.evaluarExpresionSimple("4*5"));
        assertEquals(2.0, miniCalculadora.evaluarExpresionSimple("10/5"));
    }

   
    }


