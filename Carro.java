package Exercicios;

public class Carro extends Brinquedo {
	
	public  Carro (String cor, String tipo, String velocidade, String nome) {
	      super(cor,tipo, velocidade,nome);
	}
	
	@Override
	public void mover() {
		System.out.println("Se locomovendo na estrada");
		
	}
}




