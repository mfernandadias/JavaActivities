package revisaoCompleta.revisao2POO.exercicios;

public class Retangulo {
    Double base;
    Double altura;

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void area(double base, double altura){
        double area = base * altura;
        System.out.println("Area: " + area);
    }
}
