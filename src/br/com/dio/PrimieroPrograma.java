package br.com.dio;

import br.com.dio.model.Gato;

public class PrimieroPrograma {
    public static void main(String[] args) {
        Gato gato =  new Gato();
        gato.setNome("café");
        System.out.print(gato);


        Livro livro = new Livro("O problema dos 3 corpos", 300);


    }

}



    class Livro {

        private String nome;
        private  Integer numPaginas;


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

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }


        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }

    }

