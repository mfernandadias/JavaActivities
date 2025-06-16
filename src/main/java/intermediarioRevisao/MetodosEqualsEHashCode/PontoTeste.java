package intermediarioRevisao.MetodosEqualsEHashCode;

public class PontoTeste {
    public static void main(String[] args){
        Ponto p1 = new Ponto(1, 2);
        Ponto p2 = new Ponto(1, 2);
        Ponto p3 = new Ponto(3, 4);
        Ponto p4 = p1; // p4 e p1 referenciam o mesmo objeto

        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true (conteúdo igual)
        System.out.println("p1 == p2: " + (p1 == p2));         // false (referências diferentes)
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // false
        System.out.println("p1.equals(p4): " + p1.equals(p4)); // true (mesma referência)
        System.out.println("p1 == p4: " + (p1 == p4));         // true
    }
}
