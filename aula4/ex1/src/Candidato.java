public class Candidato {
    int inscricao;
    double nota;
    String nome;

    public Candidato(){

    }

    public Candidato(int inscricao, String nome, double nota) {
        this.inscricao = inscricao;
        this.nota = nota;
        this.nome = nome;
    }

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    


}
