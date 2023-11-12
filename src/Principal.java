import br.com.alura.screenmatch.calculadora.CalculadoraTempo;
import br.com.alura.screenmatch.calculadora.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1990);
        meuFilme.setDuracaoEmMinutos(232);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(4);
        System.out.println("Total de avaliacoes é: " + meuFilme.getTotalDeAvaliacoes());
//        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("The Wire");
        minhaSerie.setTemporadas(5);
        minhaSerie.setMinutosPorEpisodio(13);
        minhaSerie.setQntEpisodios(10);
        System.out.println("Duracao da Serie: " + minhaSerie.getDuracaoEmMinutos());

        Filme novoFilme = new Filme();
        novoFilme.setNome("O poderoso chefão part II");
        novoFilme.setAnoDeLancamento(1993);
        novoFilme.setDuracaoEmMinutos(200);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(novoFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNome("Pilot");
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalAvaliacoes(500);
        filtro.filtra(episodio);
    }
}
