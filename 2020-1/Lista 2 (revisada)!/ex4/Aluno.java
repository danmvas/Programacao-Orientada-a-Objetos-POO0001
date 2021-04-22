public class Aluno {

    private float[] notas = new float[5];
    private int topoPilha = 0;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public boolean adicionarNota(float nota) {
        if (topoPilha < 5) {
            notas[topoPilha] = nota;
            topoPilha++;
        } else {
            false;
        }
    }

    public void setNotas(float[] notas) {
        for (int i = 0; i != notas.lenght || topoPilha != 5; i++) {
            adicionarNota(notas[i]);
        }
    }

    public float calculaMedia() {
        float media = 0;

        for (float nota : notas) {
            media += nota;
        }

        return media / 5;
    }

    public String toString() {

        StringBuilder aluno = new StringBuilder();

        aluno.append("Nome: ");
        aluno.append(nome);
        aluno.append("\n");

        for (float nota : notas) {
            aluno.append(nota);
            aluno.append(" ");
        }

        aluno.append("Media: ");
        aluno.append(calcularMedia());

        return aluno.toString();

    }

}