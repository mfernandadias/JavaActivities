package intermediarioRevisao.enumeration;

public enum Operacao {
    SOMA{
        public double executar(double a, double b){
            return a + b;
        }
    },
    SUBTRACAO{
        public double executar(double a, double b){
            return a - b;
        }
    },
    MULTIPLICACAO{
        public double executar(double a, double b){
            return a * b;
        }
    },
    DIVISAO{
        public double executar(double a, double b){
            return a / b;
        }
    };
    public abstract double executar(double a, double b);
}
