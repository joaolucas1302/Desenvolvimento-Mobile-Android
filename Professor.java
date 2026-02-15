public class Professor extends Pessoa {
    private int codigoProfessor;
    private double salario;

    public Professor(int codigoProfessor, double salario, String nome, String endereco, String sexo) {
        super(nome, sexo, endereco); 
        this.codigoProfessor = codigoProfessor;
        this.salario = salario;
    }

    @Override
    public void mostrarDados() {
        System.out.println("--- Dados do Professor ---");
        System.out.println("Código: " + this.codigoProfessor);
        System.out.println("Salário:" + this.salario);
        super.mostrarDados(); // Chama o mostrarDados da classe Pessoa
    }
 
    // --- GETTERS e SETTERS ---
    public int getCodigoProfessor(){
      return this.codigoProfessor;
    }
    
    public void setCodigoProfessor(int codigoProfessor){
      this.codigoProfessor = codigoProfessor;
    }

    public double getSalario(){
      return this.salario;
    }
    
    public void setSalario(double salario){
      this.salario = salario;
    }
}