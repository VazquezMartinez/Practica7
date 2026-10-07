package org.example;

public abstract class Sensor extends DispositivoElectronico {

    protected String unidadMedida;
    protected boolean estaCalibrado;

    public Sensor(String modelo, String fabricante, double consumoEnergia,
                  boolean encendido, String unidadMedida, boolean estaCalibrado) {

        super(modelo, fabricante, consumoEnergia, encendido);
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = estaCalibrado;
    }

    public void calibrar() {
        estaCalibrado = true;
        System.out.println(modelo + " calibrado.");
    }

    public abstract double leerValor();
}
