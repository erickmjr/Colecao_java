package Colecao;

public class Livro {
    private String autor, editora, titulo, isbn;

    public Livro (String autor, String editora, String titulo, String isbn) {
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getAutor() {
    	return autor;
    }
    
    public String getEditora() {
    	return editora;
    }
    
    public String getTitulo() {
    	return titulo;
    }
    
    public String getIsbn() {
    	return isbn;
    }
}

