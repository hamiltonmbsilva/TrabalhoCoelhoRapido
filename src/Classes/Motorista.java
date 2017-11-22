/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author aluno
 */
public class Motorista extends Usuario{
    private int CNH;

    public Motorista() {
    }

    public Motorista(int CNH, String nome, String CPF_CNPJ, int idUsuario, int telefone, String senha) {
        super(nome, CPF_CNPJ, idUsuario, telefone, senha);
        this.CNH = CNH;
    }

    public int getCNH() {
        return CNH;
    }

    public void setCNH(int CNH) {
        this.CNH = CNH;
    }
    
    
}
