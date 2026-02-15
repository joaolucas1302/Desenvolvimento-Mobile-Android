public class Chamada {
  private String data;
  private int sala;
  private int predio;

  public Chamada(String data, int sala, int predio){
    this.data = data;
    this.sala = sala;
    this.predio = predio;
  }

  public void imprimir(Curso umCurso, String umaDisciplina){
    System.out.println("Lista de Presença");
    System.out.println("-----------------");
    System.out.println("Curso: " + umCurso.getCodigoCurso());
    System.out.println("Nome: " + umCurso.getNomeCurso());
    System.out.println("-----------------");
    System.out.println("Disciplina: " + 
        umCurso.getDisciplina(umaDisciplina).getNome());
    System.out.println("Professor: " +
        umCurso.getDisciplina(umaDisciplina).getProfessor().getNome());
    System.out.println("Alunos: ");
    for (Aluno a : umCurso.getDisciplina(umaDisciplina).getAlunos())
      System.out.println(a.getRa() + " - " + a.getNome());
  }
}
