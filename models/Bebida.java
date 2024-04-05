package models;

public class Bebida extends Produto {
    protected String marca;

    public Bebida(String nome, String preco, String categoria, String marca) {
        super(nome, preco, categoria);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
    void setMarca(String marca) {
        this.marca = marca;
    }
}
