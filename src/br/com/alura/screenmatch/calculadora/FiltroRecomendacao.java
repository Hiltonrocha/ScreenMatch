package br.com.alura.screenmatch.calculadora;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel c){
        if (c.getClassificacao() >= 4){
            System.out.println("Esta entre os tops da semana");
        } else if (c.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Coloque na lista para assistit depois");
        }
    }
}
