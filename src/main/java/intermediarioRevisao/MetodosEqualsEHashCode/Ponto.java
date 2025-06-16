package intermediarioRevisao.MetodosEqualsEHashCode;

public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true; // Mesma referência
        if (o == null || getClass() != o.getClass()) return false; // Nulo ou classes diferentes

        Ponto ponto = (Ponto) o; // Cast para a classe Ponto

        // Compara os atributos relevantes
        return x == ponto.x && y == ponto.y;
    }
    // hashCode precisa ser sobrescrito se equals for sobrescrito!
    @Override
    public int hashCode() {
        // Implementação básica para demonstração, será explicada a seguir.
        return 31 * x + y;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
