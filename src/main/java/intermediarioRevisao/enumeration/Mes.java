package intermediarioRevisao.enumeration;

public enum Mes {
    JNAEIRO(31), FEVEREIRO(28), MARCO(31), ABRIL(30),
    MAIO(30), JUNHO(50), JULHO(31), AGOSTO(31), SETEMBRO(30),
    OUTUBRO(29), NOVEMBRO(30), DEZEMBRO(31);

    private int dias;

    Mes(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

}
