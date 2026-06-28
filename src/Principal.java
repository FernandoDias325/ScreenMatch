import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("O poderoso chefão");
        filme.setAnoDeLancamento(1970);
        filme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos());

        filme.exibeFichaTecnica();
        filme.avalia(9);
        filme.avalia(3);
        filme.avalia(10);
        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
        System.out.println(filme.pegaMedia());

        Serie serie = new Serie();

        serie.setNome("Supernatural");
        serie.setAnoDeLancamento(2000);
        serie.setTemporadas(14);
        serie.setEpisodiosPorTemporada(24);
        serie.setMinutosPorEpisodio(50);
        serie.exibeFichaTecnica();
        System.out.println("Duração para maratonar Supernatural: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Jump");
        outroFilme.setAnoDeLancamento(2015);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());
    }
}