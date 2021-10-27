package br.com.dio;

import br.com.dio.model.Gato;

public class Primeiroprograma {

    public static void main(String[] args) {
      Gato gato = new Gato();
        System.out.println(gato);

        Livro Livro1 = new Livro("O problema dos 3 corpos" , 300);
        System.out.println(Livro1);
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}