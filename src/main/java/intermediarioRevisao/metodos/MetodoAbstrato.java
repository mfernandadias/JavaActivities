package intermediarioRevisao.metodos;

public class MetodoAbstrato {
    /*
    Descrição: declarados em classes abstratas ou interfaces, implementados em subclasses
     */
    abstract class Animal{
        abstract void emitirSom();
    }

    class Gato extends Animal {

        void emitirSom(){
            System.out.println("Miu miu miu ");
        }

    }


}
