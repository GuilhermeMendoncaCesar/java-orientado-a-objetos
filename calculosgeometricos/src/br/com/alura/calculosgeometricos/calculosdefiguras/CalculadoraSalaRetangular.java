package br.com.alura.calculosgeometricos.calculosdefiguras;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura / 2;
        System.out.println("Área = " + area);
    }

    @Override
    public void calcularPerimetro(double lado1, double lado2, double lado3, double lado4) {
        double perimetro = lado1 + lado2 + lado3 + lado4;
        System.out.println("Perímetro = " + perimetro);
    }
}
