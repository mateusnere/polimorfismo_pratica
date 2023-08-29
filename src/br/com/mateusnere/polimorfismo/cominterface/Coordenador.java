package br.com.mateusnere.polimorfismo.cominterface;

public class Coordenador implements Financeiro {

    private String nome;

    private Double valorHora;

    private Double valorGratificacao;

    public Coordenador(String nome, Double valorHora, Double valorGratificacao) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.valorGratificacao = valorGratificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorGratificacao() {
        return valorGratificacao;
    }

    public void setValorGratificacao(Double valorGratificacao) {
        this.valorGratificacao = valorGratificacao;
    }

    @Override
    public Double calculaRemuneracaoMensal(int horasDoMes) {
        return (this.valorHora * horasDoMes) + this.valorGratificacao;
    }
}
