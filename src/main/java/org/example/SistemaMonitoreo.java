package org.example;

import java.util.ArrayList;

public class SistemaMonitoreo {

    public static void main(String[] args) {

        ArrayList<Sensor> listaSensores = new ArrayList<>();

        listaSensores.add(new SensorTemperatura("T1", "Intel", 5));
        listaSensores.add(new SensorTemperatura("T2", "AMD", 5));

        listaSensores.add(new SensorPresion("P1", "Bosch", 3));
        listaSensores.add(new SensorPresion("P2", "Siemens", 3));

        listaSensores.add(new SensorAceleracion("A1", "Sony", 4));
        listaSensores.add(new SensorAceleracion("A2", "LG", 4));

        for (Sensor s : listaSensores) {
            System.out.println("\n=====================================================");
            s.encender();
            s.calibrar();

            double valor = s.leerValor();

            System.out.println("Resultado: " + valor);
            System.out.println(s.obtenerEstado());
        }
    }
}

