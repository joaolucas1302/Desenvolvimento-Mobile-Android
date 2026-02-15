public class Pessoa {
    // Atributos
    private String nome;
    private String sexo;
    private String endereco;

    // Construtor
    public Pessoa(String nome, String sexo, String endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    // Método para exibir as informações
    public void mostrarDados() {
        System.out.println("--- Dados da Pessoa ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("-----------------------");
    }
    
    // --- GETTERS (Para ler os dados) ---
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    // --- SETTERS (Para alterar os dados) ---
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}