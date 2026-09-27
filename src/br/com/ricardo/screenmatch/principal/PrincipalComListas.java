package br.com.ricardo.screenmatch.principal;

import br.com.ricardo.screenmatch.modelos.Filme;
import br.com.ricardo.screenmatch.modelos.Serie;
import br.com.ricardo.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args){
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        Filme f1 = filmeDoPaulo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Estrelas: " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da Ordenação");

        System.out.println(buscaPorArtista);

        Collections.sort(lista);

        System.out.println("Lista de Títulos Ordenados: " + lista);


    }

}
