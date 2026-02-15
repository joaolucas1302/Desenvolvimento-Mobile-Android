import java.util.List;

public class Disciplina {
  private String codigoDisciplina;
  private String nome;
  private int cargaHoraria;
  private Professor umProfessor;
  private Turma turma;

  public Disciplina(String codigoDisciplina, String nome, int cargaHoraria, Turma turma){
    this.codigoDisciplina = codigoDisciplina;
    this.nome = nome;
    this.cargaHoraria = cargaHoraria;
    if (turma == null) {
      throw new IllegalArgumentException("Turma não pode ser nula");
    }
    this.turma = turma;
  }

  public void incluirProfessor(Professor umProfessor){
    this.umProfessor = umProfessor;  
  }
  
  public void incluirAluno(Aluno umAluno) {
    this.turma.adicionarAluno(umAluno);
  }
  
  public void mostrarDados(){
    System.out.println("Cód. Disciplina: " + this.codigoDisciplina);
    System.out.println("Disciplina: " + this.nome);
    System.out.println("CH: " + this.cargaHoraria);
    System.out.println("Professor: " + this.umProfessor.getNome());
    System.out.println("Alunos:");
    System.out.println("--------------------------------------");
    // Percorrendo a lista de alunos
    for (Aluno a : this.turma.getAlunos())
        System.out.println("RA: " + a.getRa() + " | Nome: " + a.getNome());
    System.out.println("--------------------------------------");
  }
  
  // --- GETTERS e SETTERS ---
  public String getCodigoDisciplina(){
    return this.codigoDisciplina;
  }
  
  public void setCodigoDisciplina(String codigoDisciplina){
    this.codigoDisciplina = codigoDisciplina;
  }
  
  public String getNome(){
    return this.nome;
  }
  
  public void setNome(String nome){
    this.nome = nome;
  }
  
  public int getCargaHoraria(){
    return this.cargaHoraria;
  }
  
  public void setCargaHoraria(int cargaHoraria){
    this.cargaHoraria = cargaHoraria;
  }
  public Professor getProfessor(){
    return this.umProfessor;
  }
  
  public void setProfessor(Professor umProfessor){
    this.umProfessor = umProfessor;
  }
  
  public List<Aluno> getAlunos() {
    return this.turma.getAlunos();
  }

  public void setAlunos(List<Aluno> alunos) {
    this.turma.setAlunos(alunos);
  }
}
