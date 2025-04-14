package Prova1;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String descricao;
    private List<Palestra> palestras;

    public Evento(String descricao) {
        this.descricao = descricao;
        this.palestras = new ArrayList<>();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Palestra> getPalestras() {
        return palestras;
    }

    public void adicionarPalestra(Palestra palestra) {
        this.palestras.add(palestra);
    }

    @Override
    public String toString() {
        return "Evento: " + descricao + "\nPalestras: " + palestras;
    }
}
