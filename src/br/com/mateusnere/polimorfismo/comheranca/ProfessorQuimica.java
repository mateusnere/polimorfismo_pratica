package br.com.mateusnere.polimorfismo.comheranca;

public class ProfessorQuimica extends Professor {
    public ProfessorQuimica(String nome, String matricula, Double valorHora) {
        super(nome, matricula, valorHora);
    }

    @Override
    public Double calculaRemuneracao(Integer horasTrabalhadas) {
        return (super.getValorHora() * horasTrabalhadas) * 1.08;
    }
}
