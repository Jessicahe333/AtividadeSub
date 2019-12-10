package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    private int codigo, quantidade;
    private double preco;
    private String categoria, nome, descricao;

//    private ArrayList<Produto> produtos;
//
//    public Produto(ArrayList produtos){
//        produtos = new ArrayList<>();
//    }

    public Produto(int codigo,String nome, double preco, int quantidade, String categoria, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {

        return descricao;
    }
}
