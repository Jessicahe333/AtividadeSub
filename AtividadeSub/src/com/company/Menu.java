package com.company;

import model.Cliente;
import model.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void menu(){
        System.out.println("1 - Inserir produtos");
        System.out.println("2 - Mostrar todos os protudos");
        System.out.println("3 - Carrinho(Lista de compras)");
        System.out.println("4 - Finalizar a compra");
        System.out.printf("0 - Sair");
    }
    public void menuCompra(){
        System.out.println("1 - Inserir item");
        System.out.println("2 - Remover item");
        System.out.println("3 - Mostrar todos os itens");
    }

    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private ArrayList<Produto> compras = new ArrayList<Produto>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();


    public void run(){
        Scanner scanner = new Scanner(System.in);
        do {
            menu();
            int op = scanner.nextInt();
            //Produto produto;
            switch (op){
                case 1:
                    System.out.println("Informe: codigo; nome; preço; quantidade; categoria e descrição do produto!");
                    int codigo, quantidade;
                    double preco;
                    String categoria, nome, descricao;
                    codigo = scanner.nextInt();
                    nome = scanner.next();
                    preco = scanner.nextDouble();
                    quantidade = scanner.nextInt();
                    categoria = scanner.next();
                    descricao = scanner.next();
                    Produto p = new Produto(codigo,nome, preco, quantidade,categoria,descricao);
                    produtos.add(p);
                    break;

                case 2:
                    for(Produto pn: produtos){
                        System.out.println("Codigo:" + pn.getCodigo());
                        System.out.println("Nome:" + pn.getNome());
                        System.out.println("Preço:" + pn.getPreco());
                        System.out.println("Quantidade:" + pn.getQuantidade());
                        System.out.println("Categoria:" + pn.getCategoria());
                        System.out.println("Descrição:" + pn.getDescricao() + "\n");
                    }
                    break;

                case 3:
                    menuCompra();
                    int i = scanner.nextInt();
                    switch (i){
                        case 1:
                            System.out.println("Inserir o código do produto para adicionar no carrinho:");
                            int id = scanner.nextInt();
                            System.out.println("Inserir a quantidade de compras:");
                            int valor = scanner.nextInt();
                            for(Produto pn: produtos){
                                if (id == pn.getCodigo()){
                                   Produto item = new Produto(pn.getCodigo(),pn.getNome(),pn.getPreco(),valor,pn.getCategoria(),pn.getDescricao());
                                   compras.add(item);
                                   pn.setQuantidade(pn.getQuantidade()- valor);

                                }
                            }
                            break;

                        case 2:
                            if (compras.isEmpty()){
                                System.out.println("O carrinho já é vazio!");
                            }
                            else{
                                System.out.println("Inserir o código para remover item do carrinho:");
                                int item = scanner.nextInt();
                                System.out.println("Inserir a quantidade de remover do carrinho:");
                                int v = scanner.nextInt();
                                for (Produto e: compras){
                                    if(item == e.getCodigo()){
                                        for(Produto c:produtos){
                                           c.setQuantidade(c.getQuantidade() + v);
                                        }
                                        compras.remove(e);

                                    }
                                }
                            }
                            break;

                        case 3:
                            System.out.println("Lista de compras:");
                            for(Produto d: compras){
                                System.out.println("Codigo:" + d.getCodigo());
                                System.out.println("Nome:" + d.getNome());
                                System.out.println("Preço:" + d.getPreco());
                                System.out.println("Quantidade:" + d.getQuantidade());
                                System.out.println("Categoria:" + d.getCategoria());
                                System.out.println("Descrição:" + d.getDescricao() + "\n");
                            }
                            break;

                        case 4:
                            Cliente c1 = new Cliente("Hello","hello@compra.com","Rua Hello");
                            Cliente c2 = new Cliente("Hi","hi@compra.com","Rua Hi");
                            clientes.add(c1);
                            clientes.add(c2);
                            System.out.println("Compra finalizada! Seu resumo:\n");
                            System.out.println("Nome do cliente: " + c1.getNome());
                            System.out.println("E-mail do cliente: " + c1.getEmail());
                            System.out.println("Endereço do cliente: " + c1.getEndereço());
                            System.out.println("Items da compra: \n");
                            for(Produto f: compras){
                                System.out.println("Codigo:" + f.getCodigo());
                                System.out.println("Nome:" + f.getNome());
                                System.out.println("Preço:" + f.getPreco());
                                System.out.println("Quantidade:" + f.getQuantidade());
                                System.out.println("Categoria:" + f.getCategoria());
                                System.out.println("Descrição:" + f.getDescricao() + "\n");
                            }


                    }




            }
            if(op == 0) break;
        }while (true);
    }

}
