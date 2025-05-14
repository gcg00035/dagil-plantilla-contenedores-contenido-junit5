package es.vrivas.dagil;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Clase de test para la clase Contenido.
 */
public class ContenidoTest {

    /**
     * Mensaje indicando que se inician los tests de la clase Contenido.
     */
    @BeforeAll
    public static void setUp() {
        System.out.println("Iniciando test clase Contenido...");
    }

    //---------------------------------------------------------------
    // Tests para el método getId
    //---------------------------------------------------------------

    /**
     * Comprueba que el id inicial es 0.
     */
    @Test
    public void getId_inicia_a_0() {
        assertEquals(0, new Contenido().getId());
    }

    /**
     * Comprueba que el id se puede establecer a otro valor.
     */
    @Test
    public void getId_inicia_a_otro_valor() {
        // Comprueba otro id
        Contenido objeto = new Contenido()
                .setId(1);
        assertEquals(1, objeto.getId());
    }

    //---------------------------------------------------------------
    // Tests para el método getDescripcion
    //---------------------------------------------------------------

    /**
     * Comprueba que la descripción inicial es "".
     */
    @Test
    public void getDescripcion_inicia_vacia() {
        // Comprueba que la descripción inicial es ""
        assertEquals("", new Contenido().getDescripcion());
    }

    /**
     * Comprueba que la descripción se puede establecer a otro valor.
     */
    @Test
    public void getDescripcion_inicia_a_otro_valor() {
        // Comprueba otra descripción
        Contenido objeto = new Contenido();
        objeto.setDescripcion("Descripción");
    }

    
    //---------------------------------------------------------------
    // Tests para el método getTitulo
    //---------------------------------------------------------------


    @Test
    public void getTitulo_inicia_vacia() {
        // Comprueba que el titulo inicial es ""
        assertEquals("", new Contenido().getTitulo());
    }

    /**
     * Comprueba que el titulo se puede establecer a otro valor.
     */
    @Test
    public void getTitulo_inicia_a_otro_valor() {
        // Comprueba otro titulo
        Contenido objeto = new Contenido();
        objeto.setTitulo("Titulo");
        assertEquals("Titulo", objeto.getTitulo());
    }


    //---------------------------------------------------------------
    // Tests para el método setId
    //---------------------------------------------------------------

    /**
     * Comprueba que salta una excepción si se intenta establecer un id negativo.
     */
    @Test
    public void setId_excepciones() {
        // Comprueba que no se puede establecer un id negativo
        try {
            new Contenido().setId(-1);
            fail();
        } catch (IllegalArgumentException e) {
            System.err.println("Excepción lanzada: " + e.getMessage() + " para id negativo");
        }
    }

    /**
     * Comprueba que se puede establecer un id y que devuelve el propio objeto.
     */
    @Test
    public void setId_asigna_id_y_devuelve_this() {
        // Comprueba que establece el id y que devuelve el propio objeto
        Contenido objeto = new Contenido();
        assertSame(objeto, objeto.setId(1));
        assertEquals(1, objeto.getId());
    }

    //---------------------------------------------------------------
    // Tests para el método setTitulo
    //---------------------------------------------------------------

    /**
     * Comprueba que salta una excepción si se intenta establecer un titulo nulo o vacío.
     */
    @Test
    public void setTitulo_excepciones() {
        // Comprueba que no se puede establecer un titulo nulo
        Contenido objeto = new Contenido();
        try {
            objeto.setTitulo(null);
            fail();
        } catch (IllegalArgumentException e) {
            System.err.println("Excepción lanzada: " + e.getMessage() + " para titulo nulo");
        }

        // Comprueba que no se puede establecer un titulo vacío
        try {
            objeto.setTitulo("");
            fail();
        } catch (IllegalArgumentException e) {
            System.err.println("Excepción lanzada: " + e.getMessage() + " para titulo vacío");
        }
    }

    /**
     * Comprueba que el titulo inicial es "".
     */
    @Test
    public void setTitulo_titulo_inicial_es_nula() {
        Contenido objeto = new Contenido();
        assertEquals("", objeto.getTitulo());
    }

    /**
     * Comprueba que establece un titulo y que devuelve el mismo objeto.
     */
    @Test
    public void setTitulo_asigna_titulo_y_devuelve_this() {
        // Comprueba que establece un titulo y que devuelve el mismo objeto
        Contenido objeto = new Contenido();
        assertSame(objeto, objeto.setTitulo("Titulo"));
        assertEquals("Titulo", objeto.getTitulo());
    }


    
    //---------------------------------------------------------------
    // Tests para el método setDescripcion
    //---------------------------------------------------------------
/**
     * Comprueba que salta una excepción si se intenta establecer una descripción nula o vacía.
     */
    @Test
    public void setDescripcion_excepciones() {
        // Comprueba que no se puede establecer una descripción nula
        Contenido objeto = new Contenido();
        try {
            objeto.setDescripcion(null);
            fail();
        } catch (IllegalArgumentException e) {
            System.err.println("Excepción lanzada: " + e.getMessage() + " para descripción nula");
        }

        // Comprueba que no se puede establecer una descripción vacía
        try {
            objeto.setDescripcion("");
            fail();
        } catch (IllegalArgumentException e) {
            System.err.println("Excepción lanzada: " + e.getMessage() + " para descripción vacía");
        }
    }

    /**
     * Comprueba que la descripción inicial es "".
     */
    @Test
    public void setDescripcion_descripcion_inicial_es_nula() {
        Contenido objeto = new Contenido();
        assertEquals("", objeto.getDescripcion());
    }

    /**
     * Comprueba que establece una descripción y que devuelve el mismo objeto.
     */
    @Test
    public void setDescripcion_asigna_descripcion_y_devuelve_this() {
        // Comprueba que establece una descripción y que devuelve el mismo objeto
        Contenido objeto = new Contenido();
        assertSame(objeto, objeto.setDescripcion("Descripción"));
        assertEquals("Descripción", objeto.getDescripcion());
    }



    //---------------------------------------------------------------
    // Tests para el método toString
    //---------------------------------------------------------------
    /**
     * Comprueba que devuelve un string con el objeto en formato JSON para un objeto con id 0 y descripción "".
     */
    @Test
    public void toString_constructor_por_defecto() {
        Contenido objeto = new Contenido();
        assertEquals("{id: 0, Titulo: '', descripcion: ''}", objeto.toString());
    }

    /**
    * Comprueba que devuelve un string con el objeto en formato JSON.
    */
    @Test
    public void toString_objeto_con_datos() {
        // Comprueba que devuelve un string con el objeto en formato JSON para un objeto con id y descripción
        Contenido objeto = new Contenido();
        objeto.setId(1);
        objeto.setDescripcion("Descripción para testToString");
        objeto.setTitulo("Hola");
        assertEquals("{id: 1, Titulo: 'Hola', descripcion: 'Descripción para testToString'}", objeto.toString());
    }

    /**
     * Mensaje indicando que se finalizan los tests de la clase Contenido.
     */
    @AfterAll
    public static void tearDown() {
        System.out.println("Finalizando test clase Contenido...");
    }
}
