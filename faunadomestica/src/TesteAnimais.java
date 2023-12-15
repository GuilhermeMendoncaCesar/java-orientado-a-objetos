import br.com.alura.faunadomestica.animais.Cachorro;
import br.com.alura.faunadomestica.animais.Gato;

public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro.emitirSom());
        cachorro.abanarRabo();

        Gato gato = new Gato();
        System.out.println(gato.emitirSom());
        gato.arranharMoveis();
    }

}