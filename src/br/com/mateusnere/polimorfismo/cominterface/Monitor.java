package br.com.mateusnere.polimorfismo.cominterface;

public class Monitor implements Financeiro {

    private String nome;

    public Monitor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Double calculaRemuneracaoMensal(int horasDoMes) {
        return 1500d;
    }
}
