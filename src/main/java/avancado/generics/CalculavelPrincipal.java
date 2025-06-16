package avancado.generics;

public class CalculavelPrincipal implements Calculavel<Double> {

    public static void main(String[] args) {
        CalculavelPrincipal calc = new CalculavelPrincipal();
        Double resultado = calc.somar(10.5, 5.5);

    }

    @Override
    public Double somar (Double a, Double b){
        return a + b;
    }

}
