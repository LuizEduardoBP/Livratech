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
public Editora adicionarEditora(Editora editoras);

//adicionar uma area de livro ao sistema//
public Area adicionarArea(Area areas);

//adicionar um autor de livro ao sistema//
public Autor adicionarAutor(Autor autores);

//adicionar categoria de um livro ao sistema//
public Categoria adicionarCategoria(Categoria categoria);

// Remover //

//remover um livro do sistema//
public Livro removerLivro (Livro livros);

//remover uma editora do sistema//
public Editora removerEditora (Editora editoras);

//remover uma area do sistema//
public Area removerArea (Area areas);

//remover um autor do sistema//
public Autor removerAutor (Autor autores);

//remover uma categoria do sistema//
public Categoria removerCategoria (Categoria categoria);

// Atualizar //

//atualizar um livro do sistema//
public Livro atualizarLivro (Livro livros);

//atualizar uma editora do sistema//
public Editora atualizarEditora(Editora editoras);

//atualizar uma area do sistema//
public Area atualizarArea(Area areas);

//atualizar um autor do sistema//
public Autor atualizarAutor(Autor autores);

//atualizar uma categoria do sistema//
public Categoria atualizarCategoria (Categoria categoria);


}