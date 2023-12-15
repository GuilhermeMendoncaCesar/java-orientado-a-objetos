package br.com.alura.aplicacaomusicas.formatos;

import br.com.alura.aplicacaomusicas.calculos.Classificavel;

public class MinhasPreferidas {

    public void inclui(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("É um sucesso do momento");
        } else {
            System.out.println("Recomendamos que assista depois");
        }
    }

}
