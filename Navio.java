package Exercicios;

public class Navio extends Brinquedo {

	public  Navio (String cor, String tipo, String velocidade, String nome) {
	      super(cor,tipo, velocidade,nome);
	}
	
	@Override
	public void mover() {
		System.out.println("Se locomovendo na água");
		
	}
}

