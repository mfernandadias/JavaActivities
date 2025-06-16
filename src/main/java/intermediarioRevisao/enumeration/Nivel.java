package intermediarioRevisao.enumeration;

public enum Nivel {
    BAIXO(1), MEDIO(2), ALTO(3);

    private int valor;

    Nivel(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static void main(String[] args){
        for(Nivel n : Nivel.values()){
            System.out.println(n + " - valor: " + n.getValor());
        }
    }
}
