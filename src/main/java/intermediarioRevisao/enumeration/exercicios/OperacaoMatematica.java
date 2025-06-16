package intermediarioRevisao.enumeration.exercicios;

public enum OperacaoMatematica {

    /*

     */
    SOMA("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    },
    SUBTRACAO("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICAO("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    },
    DIVISAO("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

   private String simbolo;

    OperacaoMatematica(String simbolo) {
        this.simbolo = simbolo;
    }

    public abstract double executarOperacao(double x, double y);
    public String toString(){
        return this.simbolo;
    }
}

