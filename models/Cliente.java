package models;

class Cliente extends Usuario {
    protected String enderecoDeEntrega;
    protected String formaDePagamento;

    public Cliente(String nome, String email, String telefone, String cpf, String endereco) {
        super(nome, email, telefone, cpf, null);
        this.enderecoDeEntrega = null;
        this.formaDePagamento = null;
    }
    public String getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }
    public void setEnderecoDeEntrega(String enderecoDeEntrega) {
        this.enderecoDeEntrega = enderecoDeEntrega;
    }
    public String getFormaDePagamento() {
        return formaDePagamento;
    }
    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

}