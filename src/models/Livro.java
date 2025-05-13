package models;

import enums.Genero;

public class Livro extends Material {

    private Genero genero;

    public Livro(String titulo, String autor, Genero genero) {
        super(titulo, autor);
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    public String toString() {
        return super.toString() + "\nGênero: " + genero;
    }
}
