package models;

public class Funcionario extends Usuario {
    protected String cargo;

    public Funcionario(String nome, String email, String telefone, String cpf, String cargo) {
        super(nome, email, telefone, cpf, null);
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}
