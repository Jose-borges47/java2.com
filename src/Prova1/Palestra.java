package Prova1;

import java.util.Date;

public class Palestra {
    private String nome;
    private Date data;

    public Palestra(String nome, Date data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Palestra: " + nome + ", Data: " + data;
    }
}
