package br.com.senac.restauranterodrigues.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

             @Entity
public class pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)             
    private int id; 
    
    private Integer mesas_id;
    private String cpf_cliente;
    private double valor_total;
   
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getMesas_id() {
        return mesas_id;
    }

    public void setMesas_id(Integer mesas_id) {
        this.mesas_id = mesas_id;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
    
    
    
}
