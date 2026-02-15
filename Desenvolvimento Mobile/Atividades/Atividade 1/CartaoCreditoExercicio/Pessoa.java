import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    private Cpf cpf;
    private ArrayList<CartaoCredito> cartoes;

    public Pessoa(String nome, int idade, String endereco, String numeroCPF, Data dataEmissao) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cpf = new Cpf(numeroCPF, dataEmissao);
        this.cartoes = new ArrayList<>();
    }

    public void incluirCartaoCredito(String bandeira, String numeroCartao, Data dataValidade, int cvv) {
        this.cartoes.add(new CartaoCredito(bandeira, numeroCartao, dataValidade, cvv));
    }
    
    public void mostrarDadosPessoa() {
        System.out.println("------------------------------");
        System.out.println("Dados da Pessoa:");
        System.out.println("------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("------------------------------");
    }

    public void mostrarDadosCartao() {
        if (this.cartoes != null && !this.cartoes.isEmpty()) {
            for (CartaoCredito cartaoCredito : this.cartoes) {
                cartaoCredito.mostrarDadosCartao();
            }
        } else {
            System.out.println("Nenhum cartão de crédito cadastrado.");
        }
    }

    public void mostrarDadosCPF() {
        cpf.mostrarDadosCPF();
    }
}
