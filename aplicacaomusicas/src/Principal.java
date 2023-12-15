import br.com.alura.aplicacaomusicas.formatos.MinhasPreferidas;
import br.com.alura.aplicacaomusicas.formatos.Musica;
import br.com.alura.aplicacaomusicas.formatos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("New Rules");
        musica.setArtista("Dua Lipa");

        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcos Mendes");

        for (int i = 0; i < 5001; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        System.out.println(musica.getClassificacao());
        System.out.println(meuPodcast.getClassificacao());
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);
        preferidas.inclui(meuPodcast);

    }
}
