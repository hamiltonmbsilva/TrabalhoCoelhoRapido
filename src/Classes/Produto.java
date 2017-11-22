/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Hamil
 */
public class Produto {
    
    private int idProduto;
    private String descricao;
    private double volume;
    
    public Produto() {
    }

    public Produto(int idProduto, String descricao, double volume) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.volume = volume;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    
}
