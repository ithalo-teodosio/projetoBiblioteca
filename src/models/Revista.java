package models;

public class Revista extends Material {
    private int numeroRevista;

    public Revista(String titulo, String autor, int numeroRevista) {
        super(titulo, autor);
        this.numeroRevista = numeroRevista;
    }

    public int getNumeroRevista() {
        return numeroRevista;
    }

    public String toString() {
        return super.toString() + "\nRevista: " + numeroRevista;
    }
}
