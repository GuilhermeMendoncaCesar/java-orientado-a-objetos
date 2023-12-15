package br.com.alura.aplicacaomusicas.formatos;

import br.com.alura.aplicacaomusicas.calculos.Classificavel;

public class Musica extends Audio implements Classificavel {
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getClassificacao() {
        return getTotalDeCurtidas() * 80 / getTotalDeReproducoes();
    }

}
