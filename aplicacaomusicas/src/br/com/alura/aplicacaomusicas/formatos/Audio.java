package br.com.alura.aplicacaomusicas.formatos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private double classificacao;

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void curtir(){
        this.totalDeCurtidas++;
    }

    public void reproduzir(){
        this.totalDeReproducoes ++;
    }

}
