package br.com.mateusnere.polimorfismo.cominterface;


public class Main {

    public static void main(String[] args) {

        Professor professor = new Professor("José", 25.43);
        Monitor monitor = new Monitor("Mariana");
        Coordenador coordenador =  new Coordenador("Elias", 31.11, 250d);

        System.out.println(professor.getNome() + " tem salário de " + printaSalarioFuncionario(professor));
        System.out.println(monitor.getNome() + " tem salário de " + printaSalarioFuncionario(monitor));
        System.out.println(coordenador.getNome() + " tem salário de " + printaSalarioFuncionario(coordenador));
    }

    public static String printaSalarioFuncionario(Financeiro financeiro) {
        return "R$" + financeiro.calculaRemuneracaoMensal(125);
    }
}
