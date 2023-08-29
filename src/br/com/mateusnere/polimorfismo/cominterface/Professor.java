package br.com.mateusnere.polimorfismo.cominterface;

public class Professor implements Financeiro {

    private String nome;

    private Double valorHora;

    public Professor(String nome, Double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
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

    @Override
    public Double calculaRemuneracaoMensal(int horasDoMes) {
        return this.valorHora * horasDoMes;
    }
}
