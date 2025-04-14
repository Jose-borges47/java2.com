package aluno;

public class MainAluno {
    public static void main(String[] args) {
        Departamento dcc = new Departamento("Instituto de Informática", "INF");
        Curso curso = new Curso("Engenharia de Software", "ES", dcc);
        Aluno aluno = new Aluno("Lucas", "20251234", 2025, curso);

        System.out.println(aluno);
    }
}
