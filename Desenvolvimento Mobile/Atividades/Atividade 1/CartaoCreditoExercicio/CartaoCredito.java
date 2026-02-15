public class CartaoCredito {
    private String bandeira;
    private String numeroCartao;
    private Data dataValidade;
    private int cvv;

    public CartaoCredito(String bandeira, String numeroCartao, Data dataValidade, int cvv) {
        this.bandeira = bandeira;
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }

    public void mostrarDadosCartao() {
        System.out.println("------------------------------");
        System.out.println("Dados do Cartão de Crédito:");
        System.out.println("------------------------------");
        System.out.println("Bandeira: " + this.bandeira);
        System.out.println("Número do Cartão: " + this.numeroCartao);
        System.out.println("Data de Validade: " + this.dataValidade);
        System.out.println("CVV: " + this.cvv);
        System.out.println("------------------------------");
    }

}
