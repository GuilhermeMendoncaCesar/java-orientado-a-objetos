package br.com.alura.aplicacaomusicas.formatos;

import br.com.alura.aplicacaomusicas.calculos.Classificavel;

public class Podcast extends Audio implements Classificavel {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getClassificacao() {
        return getTotalDeCurtidas() * 20 / getTotalDeReproducoes();
    }
}