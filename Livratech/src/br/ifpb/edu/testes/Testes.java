package br.ifpb.edu.testes;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import br.ifpb.edu.livratech.Livro;
import br.ifpb.edu.livratech.Area;
import br.ifpb.edu.livratech.Autor;
import br.ifpb.edu.livratech.Categoria;
import br.ifpb.edu.livratech.Editora;
import br.ifpb.edu.interfaces.InterfaceGerenciador;

class Testes{

	@Test
	void adicionarLivro() {
		InterfaceGerenciador i = null;
		Livro livro = new Livro();
		livro.setNomeLivro("livro");
		Livro l = i.adicionarLivro(livro);
		assertNotNull(l);
	}
	@Test
	void adicionarEditora() {
		InterfaceGerenciador i = null;
		Editora editora = new Editora(); 
		editora.setNomeEditora("editora");
		Editora e = i.adicionarEditora(editora);
		assertNotNull(e);
	}	
	@Test
	void adicionarArea() {
		InterfaceGerenciador i = null;
		Area area = new Area();
		area.setNomeArea("area");
		Area a = i.adicionarArea(area);
		assertNotNull(a);
	}
	@Test
	void adicionarAutor(){
		InterfaceGerenciador i = null;
		Autor autor = new Autor(); 
		autor.setNomeAutor("autor");
		Autor u = i.adicionarAutor(autor);
		assertNotNull(u);
	}
	@Test
	void adicionarCategoria() {
		InterfaceGerenciador i = null;
		Categoria categoria = new Categoria(); 
		categoria.setNomeCategoria("categoria");
		Categoria c = i.adicionarCategoria(categoria);
		assertNotNull(c);
	}	
}