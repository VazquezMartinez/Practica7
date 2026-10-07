package org.example;

import java.util.Random;

public class SensorAceleracion extends Sensor {

    private double x, y, z;
    private Random rand = new Random();

    public SensorAceleracion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, false, "m/s^2", false);
    }

    @Override
    public double leerValor() {

        x = rand.nextDouble() * 10;
        y = rand.nextDouble() * 10;
        z = rand.nextDouble() * 10;

        System.out.println("Lectura aceleración:");
        System.out.println("X: " + x + " Y: " + y + " Z: " + z);

        double magnitud = Math.sqrt(x*x + y*y + z*z);

        System.out.println("Magnitud: " + magnitud + " " + unidadMedida);

        return magnitud;
    }
}