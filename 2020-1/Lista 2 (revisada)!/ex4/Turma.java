package ex4;

public class Turma {

    private Aluno[] turma;
    private Aluno[] auxiliar = new Aluno[numeroAlunos];
    private Aluno[] aprovados = new Aluno[topoAuxiliar];
    private int numeroAlunos;
    private int topoPilha = 0;
    private int topoAuxiliar = 0;

    public Turma(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
        turma = new Aluno[numeroAlunos];
    }

    public boolean adicionaAluno(Aluno novoAluno) {
        if (topoPilha < numeroAlunos && novoAluno != null) {
            turma[topoPilha] = novoAluno;
            topoPilha++;
            return true;
        } else {
            return false;
        }
    }

    public Aluno[] aprovadosDaTurma() {
        
        for (int i = 0; i < topoPilha; i++){
            if(turma[i].calcularMedia() > 7){
                auxiliar[topoAuxiliar] = turma[i];
                topoAuxiliar++;
            }
        }

        for(int i = 0; i < topoAuxiliar; i++){
            aprovados[i] = auxiliar[i];
        }

        return aprovados;

}