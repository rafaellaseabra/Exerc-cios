package Exercicios;

public class PrincipalBrinquedo {

	public static void main(String[] args) {
		
		Brinquedo car = new Brinquedo("Preto com amarelo", "Carrinho de controle remoto", "20km", "Carro do Batman");

		System.out.println("----Carro----");
		System.out.println("Cor: "+ car.getCor());
		System.out.println("Tipo: "+ car.getTipo());
		System.out.println("Velocidade: "+ car.getVelocidade());
		System.out.println("Nome: "+ car.getNome());
		System.out.println("\n ");
		
		Brinquedo moto = new Brinquedo("Preto com vermelho", "Mini Moto Infantil Elétrica (Triciclo)", "15km", "Motinha Harley");

		System.out.println("----Moto----");
		System.out.println("Cor: "+ moto.getCor());
		System.out.println("Tipo: "+ moto.getTipo());
		System.out.println("Velocidade: "+ moto.getVelocidade());
		System.out.println("Nome: "+ moto.getNome());
		System.out.println("\n ");
		
		Brinquedo nav = new Brinquedo("Branco com vermelho", "Barco de controle remoto", "15-20km", "Barco RC");

		System.out.println("----Navio----");
		System.out.println("Cor: "+ nav.getCor());
		System.out.println("Tipo: "+ nav.getTipo());
		System.out.println("Velocidade: "+ nav.getVelocidade());
		System.out.println("Nome: "+ nav.getNome());
		System.out.println("\n ");


	}

}
