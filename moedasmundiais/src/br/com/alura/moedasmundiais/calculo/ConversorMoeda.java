package br.com.alura.moedasmundiais.calculo;

public class ConversorMoeda implements FinanceiramenteConversivel{

    @Override
    public double dolarParaReal(double dolar) {
        return dolar * 4.92;
    }

}
