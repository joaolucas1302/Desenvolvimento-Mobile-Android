public class Main {
    public static void main(String[] args) {
      Professor professor101 = new Professor(101, 3500, "Edgar Dijkstra", "M", "R. Acadêmica, 50");
      Aluno aluno202 = new Aluno(202, 950, "Mariana Souza", "F", "R. Lírio, 77");
      Aluno aluno203 = new Aluno(203, 950, "Juliano Silva", "M", "R. Cravo, 88");
      Aluno aluno204 = new Aluno(204, 950, "Mario Mariano", "M", "R. Tulipas, 99");
      Aluno aluno205 = new Aluno(205, 950, "Clara Lovato", "F", "R. Rosas, 66");
      Curso cco = new Curso(264, "Bacharelado em Ciência da Computação");
      cco.incluirDisciplina("POO", "Prog. Orientada a Objetos", 60);
      cco.incluirDisciplina("COMP", "Compiladores", 60);
      Disciplina poo, comp = null;
      poo = cco.getDisciplina("POO");
      comp = cco.getDisciplina("COMP");
      poo.incluirProfessor(professor101);
      comp.setProfessor(poo.getProfessor());
      poo.incluirAluno(aluno202);
      poo.incluirAluno(aluno203);
      poo.incluirAluno(aluno204);
      poo.incluirAluno(aluno205);
      comp.setAlunos(poo.getAlunos());
      cco.mostrarDados();
    }
}