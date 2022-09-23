package br.com.dio.model;

import java.util.Objects;

public class Cat {
    /**
     * Attributes class Cat
     */
    private String nome;
    private String cor;
    private int idade;

    /**
     * Construtor Empty
     */
    public Cat() {
    }

    /**
     * Construtor class Cat
     * @param nome
     * @param cor
     * @param idade
     */
    public Cat(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    /**
     * Getters and Setters class Cat
     * @return
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idada) {
        this.idade = idada;
    }

    /**
     * Equals and Hashcode class Gat
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return idade == cat.idade && Objects.equals(nome, cat.nome) && Objects.equals(cor, cat.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    /**
     * toString class Cat
     * @return
     */
    @Override
    public String toString() {
        return "Cat{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
