package Prova1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int idade;
    private List<Evento> eventos;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.eventos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void adicionarEvento(Evento evento) {
        this.eventos.add(evento);
    }

    @Override
    public String toString() {
        return "Usuario: " + nome + ", Idade: " + idade + "\nEventos: " + eventos;
    }
}
