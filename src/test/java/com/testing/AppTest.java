
package com.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void probarSuma() {
        int resultado = App.sumar(5, 3);
        assertEquals(8, resultado);
    }
}
