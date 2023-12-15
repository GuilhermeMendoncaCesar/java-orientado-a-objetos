package br.com.alura.numerosprimos.primalidade;

public class NumerosPrimos {
    private int[] primos;
    private int indice;
    public void verificarPrimalidade(int numero){
        if (numero % 2 != 0){
            primos[indice] = numero;
            indice++;
            System.out.println("Este número é primo!");
        } else {
            System.out.println("Este número não é primo!");
        }
    }

    public void listarPrimos(){
        for (int p : primos) {
            System.out.println(p + ", ");
        }
    }

    public void aumentarIndice(){
        this.indice++;
    }

    public int getIndice() {
        return indice;
    }


}
