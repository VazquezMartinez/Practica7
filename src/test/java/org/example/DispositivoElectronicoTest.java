package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DispositivoElectronicoTest {

    @Test
    void encender() {
        DispositivoElectronico d = new DispositivoElectronico("D1", "Intel", 10, false);

        d.encender();

        assertTrue(d.encendido);
    }

    @Test
    void apagar() {
        DispositivoElectronico d = new DispositivoElectronico("D2", "AMD", 8, true);

        d.apagar();

        assertFalse(d.encendido);
    }

    @Test
    void obtenerEstado() {
        DispositivoElectronico d = new DispositivoElectronico("D3", "Sony", 5, true);

        String estado = d.obtenerEstado();

        assertTrue(estado.contains("D3"));
        assertTrue(estado.contains("Sony"));
        assertTrue(estado.contains("Encendido"));
    }
}