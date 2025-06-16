package intermediarioRevisao.interfaceRevisao;

//uimport intermediarioRevisao.metodos.Gato;

import java.util.function.Consumer;

public class ExemploAnimalConsumer {
    public static void main(String[] args){
        Animal[] animais = { new Cachorro("Rex"), new Gato("Mia") };
        //Animal[] animais = {new Cachorro("Rex", new Gato("Mia"))};
        Consumer<Animal> som = Animal::emitirSom;

        for(Animal a : animais){
            som.accept(a);
        }
    }
}
