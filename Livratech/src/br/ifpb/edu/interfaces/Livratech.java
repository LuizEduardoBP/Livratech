package br.ifpb.edu.interfaces;

import br.ifpb.edu.livratech.Livro;
import br.ifpb.edu.livratech.Area;
import br.ifpb.edu.livratech.Autor;
import br.ifpb.edu.livratech.Categoria;
import br.ifpb.edu.livratech.Editora;
import br.ifpb.edu.livratech.Endereco;
import br.ifpb.edu.livratech.Gerenciador;

public interface Livratech {

	public Livro adicionar(Gerenciador gerenciar, Livro livros);
	
	public Editora adicionar(Gerenciador gerenciar, Editora editoras);
	
	public Area adicionar(Gerenciador gerenciar, Area areas);
	
	public Autor adicionar(Gerenciador gerenciar, Autor autores);
	
	public Categoria adicionar(Gerenciador gerenciar, Categoria categoria);
	
	
}
