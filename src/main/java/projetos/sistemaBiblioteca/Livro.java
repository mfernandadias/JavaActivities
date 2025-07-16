package projetos.sistemaBiblioteca;

public class Livro {
    private String titulo;
    private int ano;
    private int exemplares;
    private Autor autor;

    public Livro(String titulo, Autor autor, int exemplares, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.exemplares = exemplares;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", exemplares=" + exemplares +
                ", autor=" + autor +
                '}';
    }
}
