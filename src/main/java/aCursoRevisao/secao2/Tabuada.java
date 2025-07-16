package aCursoRevisao.secao2;

public class Tabuada {
    void tabuada(int a){
        int resultado = 0;
        for(int i = 0; i <= 10; i++){
            resultado = i * a;
            System.out.println(resultado);

        }
    }

    public static void main(String[] args){
        Tabuada exemplo1 = new Tabuada();

        exemplo1.tabuada(8);


    }
}
