package br.com.mateusnere.polimorfismo.comheranca;

public class ProfessorMatematica extends Professor {

    public ProfessorMatematica(String nome, String matricula, Double valorHora) {
        super(nome, matricula, valorHora);
    }

    @Override
    public Double calculaRemuneracao(Integer horasTrabalhadas) {
        return (super.getValorHora() * horasTrabalhadas) * 1.1;
    }
}
