package list;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String curso;
    private double nota;
    private String sala;


    public Aluno(String nome,String curso, double nota){
        this.nome=nome;
        this.curso=curso;
        this.nota=nota;
    }

    public Aluno(String nome,String curso, double nota, String sala){
        this(nome,curso,nota);
        this.sala=sala;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getCurso(){
        return curso;
    }

    public void SetCurso(String curso){
        this.curso=curso;
    }

    public double getNota(){
        return nota;
    }

    public void SetNota(double nota){
        this.nota=nota;
    }
    public String getSala(){
        return sala;
    }

    public void SetSala(String sala){
        this.sala=sala;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", nota=" + nota +
                ", sala='" + sala + '\'' +
                '}';
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }
}
