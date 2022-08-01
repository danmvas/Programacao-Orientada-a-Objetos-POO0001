package ex1;

public class Filme implements ITaxavel {

	private String nome;
	private int duracao;

	public Filme() {
	}

	public String getNome() {
		return nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double calculaImposto() {
		return this.duracao * 0.015;
	}

}
