package br.com.dio;


import br.com.dio.model.Cat;
import br.com.dio.model.Livro;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Cat gato = new Cat();
        System.out.println(gato);

        Livro livro = new Livro("Java para iniciantes", 3);
        System.out.println(livro);

    }
}

