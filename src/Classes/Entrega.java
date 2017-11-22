/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Hamil
 */
public class Entrega {
    
    private int idEntrega;
    private double preco;
    private double distancia;
    private String status;
    Produto produto;
    ArrayList<HistoricoEntrega> historico;

    public Entrega(int idEntrega, double preco, double distancia, String status, Produto produto, ArrayList<HistoricoEntrega> historico) {
        this.idEntrega = idEntrega;
        this.preco = preco;
        this.distancia = distancia;
        this.status = status;
        this.produto = produto;
        this.historico = historico;
    }

    public Entrega() {
    }

    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ArrayList<HistoricoEntrega> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<HistoricoEntrega> historico) {
        this.historico = historico;
    }
    
    
}
