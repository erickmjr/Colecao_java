package Colecao;

public class App{
	
	public static void main(String[] args) {

		Biblioteca biblioteca = new Biblioteca();

		Livro livro1 = new Livro("Dan brown", "editoraLa", "codigo da vinci", "oi-90");
		Livro livro2 = new Livro("Hirohiko Araki", "editoraLa", "Jojo's Bizarre Adventures", "ola-45");

		biblioteca.addLivro(livro2);
		biblioteca.addLivro(livro1);
		biblioteca.verificarLivro(livro1);

		biblioteca.removeLivro(livro1);
		biblioteca.mostrarInfos();
		biblioteca.verificarListaVazia();

		System.out.println(biblioteca.verificarLivro(livro1));
		
	}
}
