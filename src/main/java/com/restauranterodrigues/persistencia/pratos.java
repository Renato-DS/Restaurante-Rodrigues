package com.restauranterodrigues.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

             @Entity
public class pratos {
     private int id_pedidos;
     private Integer cardapio_id;
     private int quantidade;
     
     @Id     
     @GeneratedValue(strategy = GenerationType.IDENTITY) 
     private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_pedidos() {
        return id_pedidos;
    }

    public void setId_pedidos(int id_pedidos) {
        this.id_pedidos = id_pedidos;
    }

    public int getCardapio_id() {
        return cardapio_id;
    }

    public void setCardapio_id(int cardapio_id) {
        this.cardapio_id = cardapio_id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
     
     
}
