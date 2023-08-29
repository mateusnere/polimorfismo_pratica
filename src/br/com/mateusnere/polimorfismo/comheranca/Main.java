package br.com.mateusnere.polimorfismo.comheranca;

public class Main {

    public static void main(String[] args) {

        final Professor professorDeHistoria = new ProfessorHistoria("Alan", "UC1010123", 20.85);
        final Professor professorDeMatematica = new ProfessorMatematica("Mirian", "UC1100321", 20.85);
        final Professor professorDeQuimica = new ProfessorQuimica("Rogerio", "UC10097741", 20.85);

        System.out.println("O professor " + professorDeHistoria.getNome() +
                " tem a matrícula " + professorDeHistoria.getMatricula() +
                " e seu salario no mês de agosto será de R$" + professorDeHistoria.calculaRemuneracao(100));

        System.out.println("O professor " + professorDeMatematica.getNome() +
                " tem a matrícula " + professorDeMatematica.getMatricula() +
                " e seu salario no mês de agosto será de R$" + professorDeMatematica.calculaRemuneracao(100));

        System.out.println("O professor " + professorDeQuimica.getNome() +
                " tem a matrícula " + professorDeQuimica.getMatricula() +
                " e seu salario no mês de agosto será de R$" + professorDeQuimica.calculaRemuneracao(100));

    }
}
