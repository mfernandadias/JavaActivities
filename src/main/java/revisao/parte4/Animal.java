package revisao.parte4;

public class Animal {
    //
    void emitirSom(){
        System.out.println("Animal fazzendo som");
    }

    class Cacrro extends Animal{
        void abanarRabo(){
            System.out.println("Cachorro abando o rabo");
        }
    }

    /*

     */

    class Cavalo extends Animal{
        @Override
        void emitirSom(){
            System.out.println("Relinchando");
        }
    }
}
