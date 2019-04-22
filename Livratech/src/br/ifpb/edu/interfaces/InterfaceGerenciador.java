package br.ifpb.edu.interfaces;

import br.ifpb.edu.livratech.Area;
import br.ifpb.edu.livratech.Autor;
import br.ifpb.edu.livratech.Categoria;
import br.ifpb.edu.livratech.Editora;
import br.ifpb.edu.livratech.Gerenciador;
import br.ifpb.edu.livratech.Livro;

public interface InterfaceGerenciador {
	
	// Adicionar //
	
	//adicionar livro ao sistema//
	public Livro adicionar(Gerenciador gerenciar, Livro livros);
	
	//adicionar editora ao sistema//
	public Editora adicionar(Gerenciador gerenciar, Editora editoras);
	
	//adicionar uma area de livro ao sistema//
	public Area adicionar(Gerenciador gerenciar, Area areas);
	
	//adicionar um autor de livro ao sistema//
	public Autor adicionar(Gerenciador gerenciar, Autor autores);
	
	//adicionar categoria de um livro ao sistema//
	public Categoria adicionar(Gerenciador gerenciar, Categoria categoria);
	
	// Remover //
	
	//remover um livro do sistema//
	public Livro remover (Gerenciador gerenciar, Livro livros);
	
	//remover uma editora do sistema//
	public Editora remover (Gerenciador gerenciar, Editora editoras);
	
	//remover uma area do sistema//
	public Area remover (Gerenciador gerenciar, Area areas);
	
	//remover um autor do sistema//
	public Autor remover (Gerenciador gerenciar, Autor autores);
	
	//remover uma categoria do sistema//
	public Categoria remover (Gerenciador gerenciar, Categoria categoria);
	
	// Atualizar //
	
	//atualizar um livro do sistema//
	public Livro atualizar (Gerenciador gerenciar, Livro livros);
	
	//atualizar uma editora do sistema//
	public Editora atualizar(Gerenciador gerenciar, Editora editoras);
	
	//atualizar uma area do sistema//
	public Area atualizar(Gerenciador gerenciar, Area areas);
	
	//atualizar um autor do sistema//
	public Autor atualizar(Gerenciador gerenciar, Autor autores);
	
	//atualizar uma categoria do sistema//
	public Categoria atualizar (Gerenciador gerenciar, Categoria categoria);

}
