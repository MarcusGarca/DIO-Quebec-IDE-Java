package br.com.dio.model;

import java.util.Objects;

public class Livro {
    private String nome;
    private int edicao;


    /**
     * Constructor class Livro
     * @param nome
     * @param edicao
     */
    public Livro(String nome, int edicao) {
        this.nome = nome;
        this.edicao = edicao;
    }

    /**
     * Constructor Empty class Livro
     */
    public Livro() {

    }

    /**
     * Getters and Setters class Livro
     * @return
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    /**
     * Equals ans Hashcode class Livro
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return edicao == livro.edicao && Objects.equals(nome, livro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, edicao);
    }

    /**
     * toString class Livro
     * @return
     */
    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", edicao=" + edicao +
                '}';
    }
}
