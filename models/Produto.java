package models;

public class Produto {
    protected String nomeDoItem;
    protected String precoDoItem;
    protected String categoriaDoItem;

public Produto(String nome, String preco, String categoria) {
    this.nomeDoItem = nome;
    this.precoDoItem = preco;
    this.categoriaDoItem = categoria;
}

    public String getNomeDoItem() {
        return nomeDoItem;
    }
    public void setNomeDoItem(String nomeDoItem) {
        this.nomeDoItem = nomeDoItem;
}
public String getCategoriaDoItem() {
    return categoriaDoItem;
}
public void setCategoriaDoItem(String categoriaDoItem) {
    this.categoriaDoItem = categoriaDoItem;
}
public String getPrecoDoItem() {
    return precoDoItem;
}
public void setPrecoDoItem(String precoDoItem) {
    this.precoDoItem = precoDoItem;
}


}