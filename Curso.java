import java.util.ArrayList;
import java.util.List;

public class Curso implements Validador{
  private int codigoCurso;
  private String nomeCurso;
  private int cargaHoraria;
  private List<Disciplina> disciplinas;

  public Curso(int codigoCurso, String nomeCurso){
    this.codigoCurso = codigoCurso;
    this.nomeCurso = nomeCurso;
    this.cargaHoraria = 0;
    this.disciplinas = new ArrayList<>();
  }
  
  public void validarCH(){
    int cargaHorariaTotal = 0;
    for (Disciplina d : this.disciplinas)
      cargaHorariaTotal += d.getCargaHoraria();
    this.cargaHoraria = cargaHorariaTotal;
  }

  public void listarDisciplinas(){
    for (Disciplina d : this.disciplinas){
      d.mostrarDados();
    }
  } 
  
  public void listarDisciplinas(String codigoDisciplina){
    for (Disciplina d : this.disciplinas)
      if (d.getCodigoDisciplina() == codigoDisciplina){
        d.mostrarDados();
        break;
      }
  }

  public void incluirDisciplina(String codigoDisciplina, String nomeDisciplina, int cargaHoraria) {
    this.disciplinas.add(new Disciplina(codigoDisciplina, nomeDisciplina, cargaHoraria, new Turma()));
    this.validarCH();
  }
  
  public void mostrarDados(){
    System.out.println("Cód. Curso: " + this.codigoCurso);
    System.out.println("Curso: " + this.nomeCurso);
    System.out.println("CH: " + this.cargaHoraria);
    System.out.println("Disciplinas:");
    System.out.println("--------------------------------------");
    this.listarDisciplinas();
  }
  
  // --- GETTERS e SETTERS ---
  public int getCodigoCurso(){
    return this.codigoCurso;
  }
  
  public void setCodigoCurso(int codigoCurso){
    this.codigoCurso = codigoCurso;
  }
  
  public String getNomeCurso(){
    return this.nomeCurso;
  }
  
  public void setNomeCurso(String nomeCurso){
    this.nomeCurso = nomeCurso;
  }
  
  public int getCargaHoraria(){
    return this.cargaHoraria;
  }
  
  public void setCargaHoraria(int cargaHoraria){
    this.cargaHoraria = cargaHoraria;
  }
  
  public Disciplina getDisciplina(String codigoDisciplina){
    Disciplina umaDisciplina = null;
    for (Disciplina d : this.disciplinas)
      if (d.getCodigoDisciplina() == codigoDisciplina){
        umaDisciplina = d;
        break;
      }
    return umaDisciplina;
  }

  public List<Disciplina> getDisciplinas() {
    return this.disciplinas;
  }

  public void setDisciplinas(List<Disciplina> disciplinas) {
    this.disciplinas = disciplinas;
  }
}
