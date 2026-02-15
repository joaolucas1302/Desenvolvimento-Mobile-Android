public class Cpf {
    private String numeroCPF;
    private Data dataEmissao;

    public Cpf(String numeroCPF, Data dataEmissao) {
        this.numeroCPF = numeroCPF;
        this.dataEmissao = dataEmissao;
    }

    public void mostrarDadosCPF() {
        System.out.println("------------------------------");
        System.out.println("Dados do CPF:");
        System.out.println("------------------------------");
        System.out.println("Número do CPF: " + this.numeroCPF);
        System.out.println("Data de Emissão: " + this.dataEmissao);
        System.out.println("------------------------------");
    }
}
