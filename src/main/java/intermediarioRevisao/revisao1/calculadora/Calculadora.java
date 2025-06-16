package intermediarioRevisao.revisao1.calculadora;

public class Calculadora {
    /*
    sobrescarga é quando criamos vários métodos com o mesmo nome, mas parâmetros diferentes
     */
    public int somar(int a, int b){
        return a + b;
    }

    public double somar(double a, double b){
        return a *  b;
    }
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}
