package br.ifpb.edu.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.ifpb.edu.livratech.Livro;
import br.ifpb.edu.livratech.Area;
import br.ifpb.edu.livratech.Autor;
import br.ifpb.edu.livratech.Categoria;
import br.ifpb.edu.livratech.Editora;
import br.ifpb.edu.livratech.Endereco;
import br.ifpb.edu.livratech.Gerenciador;
import br.ifpb.edu.interfaces.InterfaceGerenciador;


class Testes{

	@Test
	void adicionarLivro() {
		InterfaceGerenciador i;
		Livro livro = new Livro(); 
		Livro l = i.adicionarLivro(livros);
		assertNotNull(l);
		assertEquals("livro", l.getNomeLivro());
		
	}
}