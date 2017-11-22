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
public class Gerente extends Usuario{
    private String permissao;

    public Gerente(String permissao) {

    }

    public Gerente(String permissao, String nome, String CPF_CNPJ, int idUsuario, int telefone, String senha) {
        super(nome, CPF_CNPJ, idUsuario, telefone, senha);
        this.permissao = permissao;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

}
