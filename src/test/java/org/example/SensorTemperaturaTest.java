package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SensorTemperaturaTest {

    @Test
    void leerValor() {
        SensorTemperatura s = new SensorTemperatura("T1", "Intel", 5);

        double valor = s.leerValor();

        assertTrue(valor >= 20.0 && valor <= 35.0);
    }
}