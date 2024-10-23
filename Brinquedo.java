package Exercicios;

public class Brinquedo {
	
	private String cor;
	private String tipo;
	private String velocidade;
	private String nome;
	
	public Brinquedo (String cor, String tipo, String velocidade, String nome) {
		this.cor = cor;
		this.tipo = tipo;
		this.velocidade = velocidade;
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void mover() {
		System.out.println("movendo");
	}

}
