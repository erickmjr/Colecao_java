package Colecao;

import java.util.ArrayList;

public class Biblioteca{
	private Livro livro;
	ArrayList<Livro> Colecao = new ArrayList<Livro>();

    public void addLivro(Livro livro) {
    	Colecao.add(livro);
    }

    public void removeLivro(Livro livro) {
    	Colecao.remove(livro);
    }

    public boolean verificarListaVazia() {
        return Colecao.isEmpty();
    }

    public boolean verificarLivro(Livro livro) {
        return Colecao.contains(livro);
    }

    public void mostrarInfos(){

		if (verificarListaVazia()){
			System.out.println("A coleção está vazia.");
		} else {
			for(Livro livro: Colecao) {
				System.out.println("Autor: " + livro.getAutor());
				System.out.println("Título: " + livro.getTitulo());
				System.out.println("Editora: " + livro.getEditora());
				System.out.println("ISBN: " + livro.getIsbn());
				System.out.println();
			}
		}
    }

    public void obterLivro(String autor, String titulo,  String editora, String isbn) {
		for(Livro livro: Colecao) {
			if(livro.getAutor().equals(autor) &&
					livro.getTitulo().equals(titulo) &&
					livro.getEditora().equals(editora) &&
					livro.getIsbn().equals(isbn)) {
				System.out.println("Livro " +  livro.getTitulo() + " encontrado na coleção.");

			} else {
				System.out.println("O livro não existe na coleção.");
			}
		}
    }
}

