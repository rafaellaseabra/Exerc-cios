package Exercicios;

public class Principal03 {

	public static void main(String[] args) {

		Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
		Biblioteca biblioteca = new Biblioteca("Municipal Dr.Júlio Prestes de Albuquerque", livro1);
		biblioteca.exibirInfo();

		System.out.println("Titulo: " + livro1.getTitulo() + "\nAutor: " + livro1.getAutor()+ ("\nBiblioteca: ")+biblioteca.getNome());
		biblioteca.exibirInfo();
	}



}


