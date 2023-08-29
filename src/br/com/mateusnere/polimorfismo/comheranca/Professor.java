package br.com.mateusnere.polimorfismo.comheranca;

public class Professor {

    private String nome;
    private String matricula;
    private Double valorHora;

    public Professor(String nome, String matricula, Double valorHora) {
        this.nome = nome;
        this.matricula = matricula;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double calculaRemuneracao(Integer horasTrabalhadas) {
        return this.valorHora * horasTrabalhadas;
    }
}
