package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SensorAceleracionTest {

    @Test
    void leerValor() {
        SensorAceleracion s = new SensorAceleracion("A1", "Sony", 5);

        double valor = s.leerValor();

        assertTrue(valor >= 0);
    }
}