package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SensorPresionTest {

    @Test
    void leerValor() {
        SensorPresion s = new SensorPresion("P1", "Bosch", 5);

        double valor = s.leerValor();

        assertTrue(valor >= 900.0 && valor <= 1100.0);
    }
}