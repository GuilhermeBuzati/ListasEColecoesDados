import br.com.alura.orientacaoObjetoJava.calculos.CalculadoraDeTempo;
import br.com.alura.orientacaoObjetoJava.calculos.FiltroRecomendacao;
import br.com.alura.orientacaoObjetoJava.modelos.Episodio;
import br.com.alura.orientacaoObjetoJava.modelos.Filme;
import br.com.alura.orientacaoObjetoJava.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(2);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2010);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodios(50);
        System.out.println(lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoGuilherme = new Filme();
        filmeDoGuilherme.setDuracaoEmMinutos(200);
        filmeDoGuilherme.setNome("Dogville");
        filmeDoGuilherme.setAnoDeLancamento(2002);
        filmeDoGuilherme.avalia(10);

        ArrayList<Filme> listaDeFiles = new ArrayList<>();
        listaDeFiles.add(filmeDoGuilherme);
        listaDeFiles.add(meuFilme);

        System.out.println("Tamanho da lista " + listaDeFiles.size());
        System.out.println("Primeiro filme " + listaDeFiles.get(0).getNome());
        System.out.println(listaDeFiles);
    }
}