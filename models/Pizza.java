package models;

public class Pizza {
    private String sabor;
    private String borda;
    private String tamanho;
    private String preco;

    public Pizza(String sabor, String borda, String recheio, String tamanho, String preco) {
        this.sabor = sabor;
        this.borda = borda;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getBorda() {
        return borda;
    }
    public void setBorda(String borda) {
        this.borda = borda;
    }
    public String getPreco() {
        return preco;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
