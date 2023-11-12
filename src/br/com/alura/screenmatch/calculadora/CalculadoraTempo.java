package br.com.alura.screenmatch.calculadora;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo t){
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
