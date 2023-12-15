package br.com.alura.faunadomestica.animais;

public class Gato extends Animal {

    @Override
    public String emitirSom(){
        return "miau";
    }

    public void arranharMoveis(){
        System.out.println("RRRRrrrrrr");
    }

}
