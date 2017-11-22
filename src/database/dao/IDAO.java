/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.dao;

import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Hamil
 */
public interface IDAO<C,K> {
    
     public void salvar(C p) throws ClassNotFoundException, SQLException;
    public void alterar(C p) throws ClassNotFoundException, SQLException;
    public void apagar(C p) throws ClassNotFoundException, SQLException;
    public C buscarPelaChave(K p) throws ClassNotFoundException, SQLException;
    public ArrayList<C> buscarTodos() throws ClassNotFoundException, SQLException;
    public int quantidade() throws ClassNotFoundException, SQLException;
}
