package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculadora.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private int qntEpisodios;
    private boolean ativa;
    private int minutosPorEpisodio;
    private int totalAvaliacoes;

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getQntEpisodios() {
        return qntEpisodios;
    }

    public void setQntEpisodios(int qntEpisodios) {
        this.qntEpisodios = qntEpisodios;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * qntEpisodios * minutosPorEpisodio;
    }

    @Override
    public int getClassificacao() {
        if (totalAvaliacoes > 100 ){
            return 4;
        } else {
            return 2;
        }
    }
}
