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
public class Cliente extends Usuario{
    private int tipo;

    public Cliente(int tipo) {
    }

    public Cliente(int tipo, String nome, String CPF_CNPJ, int idUsuario, int telefone, String senha) {
        super(nome, CPF_CNPJ, idUsuario, telefone, senha);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
