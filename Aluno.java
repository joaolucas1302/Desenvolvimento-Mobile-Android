public class Aluno extends Pessoa {
    private int ra;
    private double mensalidade;

    public Aluno(int ra, double mensalidade, String nome, String endereco, String sexo) {
        super(nome, sexo, endereco);
        this.ra = ra;
        this.mensalidade = mensalidade;
    }

    @Override
    public void mostrarDados() {
        System.out.println("--- Dados do Aluno ---");
        System.out.println("RA: " + ra);
        System.out.println("Mensalidade: " + mensalidade);
        super.mostrarDados(); // Chama o mostrarDados da classe Pessoa
    }
    
    // --- GETTERS e SETTERS ---
    public int getRa(){
      return this.ra;
    }
    
    public void setRa(int ra){
      this.ra = ra;
    }

    public double getMensalidade(){
      return this.mensalidade;
    }
    
    public void setMensalidade(double mensalidade){
      this.mensalidade = mensalidade;
    }
}