package revisao.parte3.exercicios;

public class Exercicio02Retangulo {

    /*
    Criar classe Retangulo com base e altura, calcular área e perímetro.
     */
    private double base;
    private double altura;

    public Exercicio02Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static double calcularArea(double getBase, double getAltura){
        return getBase * getAltura;
    }

    public static double calcularPerimetro(double getPerimetro){
        return getPerimetro * getPerimetro;
    }

}
