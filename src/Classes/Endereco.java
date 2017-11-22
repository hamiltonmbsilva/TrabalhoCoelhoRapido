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
public class Endereco {
    
    private String cidade ;
    private String bairro;
    private String logadouro;
    private int numero;
    private String cep;
    private String complemento;
    private String estado;
    

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Endereco() {
    }

    public Endereco(String cidade, String bairro, String logadouro, int numero, String cep, String complemento, String estado) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.logadouro = logadouro;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.estado = estado;
    }
    
}
