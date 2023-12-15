package br.com.alura.faunadomestica.animais;

public class Cachorro extends Animal {

    @Override
    public String emitirSom(){
        return "au au";
    }

    public void abanarRabo(){
        System.out.println("Abanando");
    }

}
