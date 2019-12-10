package model;

public class Cliente {
    private String nome;
    private String email;
    private String endereço;

    public Cliente(String nome,String email,String endereço){
        this.nome = nome;
        this.email = email;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereço() {
        return endereço;
    }
}
