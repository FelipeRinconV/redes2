package pruebas;

import controladores.Converter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {


    @Test
    void convertirDecimalBinarioTest() {
        assertEquals("1010", Converter.convertirDecimalBinario("10"));
        assertNotEquals("110", Converter.convertirDecimalBinario("10"));
    }

    @Test
    void convertirDecimalHexadecimalTest() {
        assertEquals("a", Converter.convertirDecimalHexadecimal("10"));
        assertNotEquals("b", Converter.convertirDecimalHexadecimal("10"));
    }

    @Test
    void convertirHexadecimalDecimalTest() {
        assertEquals("10", Converter.convertirHexadecimalDecimal("a"));
        assertNotEquals("11",  Converter.convertirHexadecimalDecimal("a"));
    }

    @Test
    void convertirBinarioHexadecimalTest() {
        assertEquals("a", Converter.convertirBinarioHexadecimal("1010"));
        assertNotEquals("b", Converter.convertirBinarioHexadecimal("1010"));
    }


    @Test
    void convertirHexadecimalBinarioTest() {
        assertEquals("1010", Converter.convertirHexadecimalBinario("a"));
        assertNotEquals("110", Converter.convertirHexadecimalBinario("a"));
    }



}