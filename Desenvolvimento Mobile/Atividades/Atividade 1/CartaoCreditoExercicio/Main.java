public class Main {
    public static void main(String[] args) {
        Data dataEmissao1 = new Data(14, 2, 2026);
        Data dataValidade1 = new Data(14, 2, 2031);
        Pessoa pessoa1 = new Pessoa("João", 30, "Rua A, 123", "123.456.789-00", dataEmissao1);
        pessoa1.incluirCartaoCredito("Visa", "1234 5678 9012 3456", dataValidade1, 123);

        Data dataEmissao2 = new Data(10, 5, 2020);
        Pessoa pessoa2 = new Pessoa("Maria", 25, "Rua B, 456", "987.654.321-00", dataEmissao2);

        Data dataEmissao3 = new Data(1, 1, 2022);
        Data dataValidade3a = new Data(1, 1, 2028);
        Data dataValidade3b = new Data(1, 6, 2029);
        Pessoa pessoa3 = new Pessoa("Carlos", 40, "Rua C, 789", "111.222.333-44", dataEmissao3);
        pessoa3.incluirCartaoCredito("Mastercard", "5555 6666 7777 8888", dataValidade3a, 321);
        pessoa3.incluirCartaoCredito("Elo", "9999 0000 1111 2222", dataValidade3b, 456);

        pessoa1.mostrarDadosPessoa();
        pessoa1.mostrarDadosCPF();
        pessoa1.mostrarDadosCartao();

        pessoa2.mostrarDadosPessoa();
        pessoa2.mostrarDadosCPF();
        pessoa2.mostrarDadosCartao();

        pessoa3.mostrarDadosPessoa();
        pessoa3.mostrarDadosCPF();
        pessoa3.mostrarDadosCartao();
    }
}
