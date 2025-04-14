package projecto.model;

import java.io.Serializable;

public class Veiculo implements Serializable {
    private String modelo;
    private String placa;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return modelo + " - Placa: " + placa;
    }
}
