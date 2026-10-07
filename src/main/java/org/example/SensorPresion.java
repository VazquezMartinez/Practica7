package org.example;

import java.util.Random;

public class SensorPresion extends Sensor {

    private double valorActual;
    private Random rand = new Random();

    public SensorPresion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, false, "hPa", false);
    }

    @Override
    public double leerValor() {
        valorActual = 900.0 + (200.0 * rand.nextDouble());
        System.out.println("Leyendo presión: " + valorActual + " " + unidadMedida);
        return valorActual;
    }
}
