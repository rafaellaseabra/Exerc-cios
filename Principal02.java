package Exercicios;

public class Principal02 {

	public static void main(String[] args) {
		
		ContaBancaria Cliente1 = new ContaBancaria("0000", 12500.00);
		
		Cliente ContaCliente1 = new Cliente ("Cecília", Cliente1);
		
		System.out.println("Nome: " + ContaCliente1.getNome() + "\nConta: " + Cliente1.getNumero() + "\nSALDO: " +Cliente1.getSaldo());

	}

}
