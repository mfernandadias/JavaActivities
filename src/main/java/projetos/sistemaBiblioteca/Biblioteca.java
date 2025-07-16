package projetos.sistemaBiblioteca;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    void adicionarLivro(Livro livro){
        livros.add(livro);
    }


    //listar os livros do autor
    void buscarLivrosPorAutor(String nomeAutor){

    }

    /*
    Métodos obrigatórios:
    Método	O que faz
    void adicionarLivro(Livro livro)	Adiciona um livro à lista
    void listarLivrosPorAno()	Lista todos os livros ordenados por ano
    void buscarLivrosPorAutor(String nomeAutor)	Lista os livros cujo autor
    tem o nome correspondente

     */
}
