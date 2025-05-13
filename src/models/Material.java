package models;

public abstract class Material {

    protected String titulo;
    protected String autor;

    public Material(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String toString() {
        return "\nTítulo: " + titulo + ";\nAutor: " + autor;
    }
}
