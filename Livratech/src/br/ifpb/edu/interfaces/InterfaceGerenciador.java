package br.ifpb.edu.interfaces;

import java.util.ArrayList;

import br.ifpb.edu.livratech.Area;
import br.ifpb.edu.livratech.Autor;
import br.ifpb.edu.livratech.Categoria;
import br.ifpb.edu.livratech.Editora;
import br.ifpb.edu.livratech.Gerenciador;
import br.ifpb.edu.livratech.Livro;
import br.ifpb.edu.livratech.Pedido;

public interface InterfaceGerenciador {

//pesquisar livros//
public Livro[] pesquisaSimples(String termo);

//Consulta livros em falta//
public void consultaPedidos(Pedido pedidos);

// Adicionar //

//adicionar livro ao sistema//
public Livro adicionarLivro(Livro livros);

//adicionar editora ao sistema//
public Editora adicionar(Editora editoras);

//adicionar uma area de livro ao sistema//
public Area adicionar(Area areas);

//adicionar um autor de livro ao sistema//
public Autor adicionar(Autor autores);

//adicionar categoria de um livro ao sistema//
public Categoria adicionar(Categoria categoria);

// Remover //

//remover um livro do sistema//
public Livro remover (Livro livros);

//remover uma editora do sistema//
public Editora remover (Editora editoras);

//remover uma area do sistema//
public Area remover (Area areas);

//remover um autor do sistema//
public Autor remover (Autor autores);

//remover uma categoria do sistema//
public Categoria remover (Categoria categoria);

// Atualizar //

//atualizar um livro do sistema//
public Livro atualizar (Livro livros);

//atualizar uma editora do sistema//
public Editora atualizar(Editora editoras);

//atualizar uma area do sistema//
public Area atualizar(Area areas);

//atualizar um autor do sistema//
public Autor atualizar(Autor autores);

//atualizar uma categoria do sistema//
public Categoria atualizar (Categoria categoria);


}