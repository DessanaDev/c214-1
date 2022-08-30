public class Professor {

    private String nomeDoProfessor;
    private int horarioDeAtendimento;
    private String periodo;


    //CONSTRUTOR
    public Professor(String nomeDoProfessor, int horarioDeAtendimento, String periodo) {
        this.nomeDoProfessor = nomeDoProfessor;
        this.horarioDeAtendimento = horarioDeAtendimento;
        this.periodo = periodo;
    }


    //GETTERS
    public String getNome() {
        return nomeDoProfessor;
    }

    public int getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }


    //SETTERS
    public void setNome(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public void setHorarioDeAtendimento(int horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
