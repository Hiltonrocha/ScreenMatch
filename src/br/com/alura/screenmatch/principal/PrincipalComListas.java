package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filmeUm = new Filme("Star Wars", 1998);
        filmeUm.avalia(9);
        filmeUm.setDuracaoEmMinutos(189);
        Filme filmeDois = new Filme("A Abelha", 2023);
        filmeDois.avalia(10);
        filmeDois.setDuracaoEmMinutos(182);
        Filme filmeTres = new Filme("Não Olhe para Cima", 2000);
        filmeTres.avalia(6);
        filmeTres.setDuracaoEmMinutos(126);
        Serie minhaSerie = new Serie("The Wire", 2000);
        minhaSerie.setTemporadas(4);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeUm);
        listaDeAssistidos.add(filmeDois);
        listaDeAssistidos.add(filmeTres);
        listaDeAssistidos.add(minhaSerie);

        for (Titulo item: listaDeAssistidos){
            System.out.println(item.getNome());
            if ( item instanceof Filme filme ){
                System.out.println("Duracao em Minutos: " + filme.getDuracaoEmMinutos());
            } else if (item instanceof Serie serie) {
                System.out.println("Temporadas: " + serie.getTemporadas());
            }
        }

        Collections.sort(listaDeAssistidos);
        System.out.println("Ordenada por Nome: " + listaDeAssistidos);
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenada por Ano de lancamento: " + listaDeAssistidos);
    }
}
