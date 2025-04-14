package Prova1;

public class EventoPatrocinado extends Evento {
    private String patrocinador;
    private double valor;

    public EventoPatrocinado(String descricao, String patrocinador, double valor) {
        super(descricao);
        this.patrocinador = patrocinador;
        this.valor = valor;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPatrocinador: " + patrocinador + ", Valor: " + valor;
    }
}
