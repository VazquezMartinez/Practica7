package org.example;

import java.util.Random;

public class SensorTemperatura extends Sensor {

    private double valorActual;
    private Random rand = new Random();

    public SensorTemperatura(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, false, "°C", false);
    }

    @Override
    public double leerValor() {
        valorActual = 20.0 + (15.0 * rand.nextDouble());
        System.out.println("Leyendo temperatura: " + valorActual + " " + unidadMedida);
        return valorActual;
    }
}