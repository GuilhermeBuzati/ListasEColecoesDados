package br.com.alura.orientacaoObjetoJava.principal;

import br.com.alura.orientacaoObjetoJava.modelos.Filme;
import br.com.alura.orientacaoObjetoJava.modelos.Serie;
import br.com.alura.orientacaoObjetoJava.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Vingadores", 2012);
        meuFilme.avalia(6);
        Filme filmeDoGuilherme = new Filme("Dogville", 2002);
        meuFilme.avalia(10);
        Serie lost = new Serie("Lost", 2010);

        Filme f1 = filmeDoGuilherme;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoGuilherme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

    }
}
